/*
 * Copyright (c) 2021 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */

package care.data4life.hl7.fhir.r4.model

import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

{%- set resource_list = [
    "Address",
    "Age",
    "Annotation",
    "Attachment",
    "BackboneElement",
    "CarePlan",
    "CareTeam",
    "CodeableConcept",
    "CodeSystem",
    "Coding",
    "Condition",
    "ContactDetail",
    "ContactPoint",
    "Count",
    "DiagnosticReport",
    "Distance",
    "DocumentReference",
    "DomainResource",
    "Dosage",
    "Duration",
    "Element",
    "Encounter",
    "Extension",
    "FamilyMemberHistory",
    "Goal",
    "HumanName",
    "Identifier",
    "Location",
    "Medication",
    "MedicationRequest",
    "MedicationStatement",
    "Meta",
    "Money",
    "Narrative",
    "Observation",
    "Organization",
    "Patient",
    "Period",
    "Practitioner",
    "PractitionerRole",
    "Procedure",
    "ProcedureRequest",
    "Provenance",
    "Quantity",
    "Questionnaire",
    "QuestionnaireResponse",
    "Range",
    "Ratio",
    "Reference",
    "ReferralRequest",
    "Resource",
    "SampledData",
    "ServiceRequest",
    "Signature",
    "Specimen",
    "Substance",
    "Timing",
    "UsageContext",
    "ValueSet"
] %}
{%- set fhir_resource_list = [
    "CarePlan",
    "CareTeam",
    "CodeSystem",
    "Condition",
    "DiagnosticReport",
    "DocumentReference",
    "DomainResource",
    "Encounter",
    "FamilyMemberHistory",
    "Goal",
    "Location",
    "Medication",
    "MedicationRequest",
    "MedicationStatement",
    "Observation",
    "Organization",
    "Patient",
    "Practitioner",
    "PractitionerRole",
    "Procedure",
    "ProcedureRequest",
    "Provenance",
    "Questionnaire",
    "QuestionnaireResponse",
    "ReferralRequest",
    "Resource",
    "ServiceRequest",
    "Specimen",
    "Substance",
    "ValueSet",
] %}

object FhirSerializationModule {

    fun module(): SerializersModule {
        return SerializersModule {
            polymorphic(FhirR4::class) {
{%- for resource in resources %}
{%- if resource.name in resource_list %}
                subclass({{ resource.name }}::class)
{%- endif %}
{%- endfor %}
            }
            polymorphic(FhirResource::class) {
{%- for resource in resources %}
{%- if resource.name in fhir_resource_list %}
                subclass({{ resource.name }}::class)
{%- endif %}
{%- endfor %}
            }
        }
    }
}
{% if True %}{% endif %}
