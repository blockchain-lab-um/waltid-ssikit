package id.walt.signatory.rest

import id.walt.signatory.MergingDataProvider
import id.walt.signatory.ProofConfig
import id.walt.signatory.Signatory
import id.walt.vclib.Helpers.encode
import io.javalin.http.Context
import io.javalin.plugin.openapi.dsl.document

data class IssueCredentialRequest(val templateId: String, val config: ProofConfig, val credentialData: Map<String, Any>? = null)

object SignatoryController {
    val signatory = Signatory.getService()

    fun listTemplates(ctx: Context) {
        ctx.json(signatory.listTemplates())
    }

    fun listTemplatesDocs() = document().operation {
        it.summary("List VC templates").operationId("listTemplates").addTagsItem("Verifiable Credentials")
    }.json<Array<String>>("200")

    fun loadTemplate(ctx: Context) {
        ctx.result(Signatory.getService().loadTemplate(ctx.pathParam("id")).encode())
    }

    fun loadTemplateDocs() = document().operation {
        it.summary("Load a VC template").operationId("loadTemplate").addTagsItem("Verifiable Credentials")
    }.pathParam<String>("id") { it.description("Retrieves a single VC template form the data store") }.json<String>("200")

    fun issueCredential(ctx: Context) {
        val req = ctx.bodyAsClass<IssueCredentialRequest>()
        if (!signatory.listTemplates().contains(req.templateId)) {
            ctx.status(404).result("Template with supplied id does not exist.")
            return
        }

        ctx.result(signatory.issue(req.templateId, req.config, req.credentialData?.let { MergingDataProvider(req.credentialData) }))
    }

    fun issueCredentialDocs() = document().operation {
        it.summary("Issue a credential").operationId("issue").addTagsItem("Credentials").description("Based on a template (maintained in the VcLib), this call creates a W3C Verifiable Credential. Note that the '<b>templateId</b>, <b>issuerDid</b>, and the <b>subjectDid</b>, are mandatory parameters. All other parameters are optional. <br><br> This is a example request, that also demonstrates how to populate the credential with custom data: the <br><br>{<br>" +
                "  \"templateId\": \"VerifiableId\",<br>" +
                "  \"config\": {<br>" +
                " &nbsp;&nbsp;&nbsp;&nbsp;   \"issuerDid\": \"did:ebsi:zuathxHtXTV8psijTjtuZD7\",<br>" +
                " &nbsp;&nbsp;&nbsp;&nbsp;   \"subjectDid\": \"did:key:z6MkwfgBDSMRqXaJtw5DjhkJdDsDmRNSrvrM1L6UMBDtvaSX\"<br>" +
                " &nbsp;&nbsp;&nbsp;&nbsp; },<br>" +
                "  \"credentialData\": {<br>" +
                " &nbsp;&nbsp;&nbsp;&nbsp;   \"credentialSubject\": {<br>" +
                " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     \"firstName\": \"Severin\"<br>" +
                " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   }<br>" +
                " &nbsp;&nbsp;&nbsp;&nbsp; }<br>" +
                "}<br>")
    }.body<IssueCredentialRequest>().json<String>("200")
}
