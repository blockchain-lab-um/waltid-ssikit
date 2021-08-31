package id.walt

import id.walt.rest.ErrorResponse
import io.javalin.http.Context
import io.javalin.plugin.openapi.annotations.*
import org.eclipse.jetty.server.Authentication

class NewUserRequest(val name: String) {
}
object UserController {

    fun create(ctx: Context) {
    }

    @OpenApi(
        summary = "Get all users",
        operationId = "getAllUsers",
        tags = ["User"],
        responses = [OpenApiResponse("200", [OpenApiContent(Array<Authentication.User>::class)])]
    )
    fun getAll(ctx: Context) {
        ctx.json(listOf(""))
    }
    fun getOne(ctx: Context) {
    }

    @OpenApi(
        summary = "Update user by ID",
        operationId = "updateUserById",
        tags = ["User"],
        pathParams = [OpenApiParam("userId", Int::class, "The user ID")],
        requestBody = OpenApiRequestBody([OpenApiContent(NewUserRequest::class)]),
        responses = [
            OpenApiResponse("204"),
            OpenApiResponse("400", [OpenApiContent(ErrorResponse::class)]),
            OpenApiResponse("404", [OpenApiContent(ErrorResponse::class)])
        ]
    )
    fun update(ctx: Context) {
    }

    fun delete(ctx: Context) {
    }

}
