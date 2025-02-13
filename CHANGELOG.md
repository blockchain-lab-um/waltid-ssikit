# Changelog

Notable changes since the last release of the [SSI Kit](https://github.com/walt-id/waltid-ssikit). 

## [Unreleased]

## [1.1.1] - 2021-12-03

-   Features
    -   Added GaiaxSelfDecription credential <https://github.com/dNationCloud/waltid-ssikit/pull/1> thx to <https://github.com/dNationCloud> & <https://github.com/matofeder>
    -   Added GaiaxServiceOffering credential
    -   Added VerifiableVaccinationCertificate credential <https://github.com/walt-id/waltid-ssikit/pull/80>
    -   Creation of VerifiablePresentations via Custodian REST API <https://github.com/walt-id/waltid-ssikit/issues/62>
    -   Custodians REST API should also offer the management functionality for DIDs <https://github.com/walt-id/waltid-ssikit/issues/71>
    -   Import cryptographic key from did:key <https://github.com/walt-id/waltid-ssikit/commit/4ed0b4c02ff75aad7032109b71414ff32756422a>

## [1.1.0] - 2021-11-25

-   Features
    -   Parameterize did:web creation <https://github.com/walt-id/waltid-ssikit/issues/51>
    -   Automatic deployment of test-system at <https://[core|signatory|custodian|auditor|essif].ssikit.walt.id>
    -   Introduced TrustedSchemaRegistry Policy for validating Json-schemas against the EBSI TSR
    -   JsonSchemaPolicy now validates against Json-schemas maintained in the VcLib
    -   Did Document context can be a single string or a list of strings <https://github.com/walt-id/waltid-ssikit/pull/60>
    -   Merging Data Provider - Signatory API now takes credential data as well <https://github.com/walt-id/waltid-ssikit/pull/74>

## [1.0.1] - 2021-11-08

-   Features
    -   SIOPv2 data structures  <https://github.com/walt-id/waltid-ssikit/pull/59>

## [1.0.0] - 2021-11-07

-   Roadmap Items
    -   Init Key Management <https://github.com/walt-id/waltid-roadmap/issues/8>
    -   Init Decentralized Identifiers <https://github.com/walt-id/waltid-roadmap/issues/11>
    -   Signatory <https://github.com/walt-id/waltid-roadmap/issues/9>
    -   Custodian <https://github.com/walt-id/waltid-roadmap/issues/11>
    -   Auditor <https://github.com/walt-id/waltid-roadmap/issues/15>
    -   ESSIF | DID -basic <https://github.com/walt-id/waltid-roadmap/issues/2>
    -   ESSIF VC verification - basic  <https://github.com/walt-id/waltid-roadmap/issues/6>

-   Features 
    -   Server Binding-Address must be configurable <https://github.com/walt-id/waltid-ssikit/issues/1>
    -   Loading issuer from EBSI <https://github.com/walt-id/waltid-ssikit/pull/37>
    -   Abstract BaseDid <https://github.com/walt-id/waltid-ssikit/pull/38>
    -   Trusted Issuer Registry Policy <https://github.com/walt-id/waltid-ssikit/pull/39>
    -   Persistence context <https://github.com/walt-id/waltid-ssikit/pull/41>
    -   New EBSI DID format <https://github.com/walt-id/waltid-ssikit/pull/42>
    -   DID Document context <https://github.com/walt-id/waltid-ssikit/issues/44>
    -   Feat SIOP <https://github.com/walt-id/waltid-ssikit/pull/45>
    -   Feat/ebsi vc and vp verifications <https://github.com/walt-id/waltid-ssikit/pull/48>
    -   Update GaiaxCredential <https://github.com/walt-id/waltid-ssikit/pull/50>
    -   Replacement of existing key-alias when importing keys <https://github.com/walt-id/waltid-ssikit/pull/54>

-   Fixes
    -   Swagger Docu is broken (no docs nor parameters are shown)  <https://github.com/walt-id/waltid-ssikit/issues/20>
    -   Key export/import of EdDSA_ED25519 not working <https://github.com/walt-id/waltid-ssikit/issues/18>
    -   Fix/ebsi onboarding ephemeral key service <https://github.com/walt-id/waltid-ssikit/pull/40>
    -   Fixed the way of finding the padding <https://github.com/walt-id/waltid-ssikit/pull/43>
    -   SignaturePolicy fails for issuers using did:ebsi <https://github.com/walt-id/waltid-ssikit/issues/52>

[Unreleased]: https://github.com/walt-id/waltid-ssikit/compare/1.1.1...HEAD

[1.1.1]: https://github.com/walt-id/waltid-ssikit/compare/1.1.0...1.1.1

[1.1.0]: https://github.com/walt-id/waltid-ssikit/compare/1.0.1...1.1.0

[1.0.1]: https://github.com/walt-id/waltid-ssikit/compare/1.0.0...1.0.1

[1.0.0]: https://github.com/walt-id/waltid-ssikit/compare/2be9d92014df8b7da68ccccc96bdd1024f2ce50e...1.0.0
