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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.AuditEventAction
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirAuditEvent
 *
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection
 * of intrusion attempts and monitoring for inappropriate usage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEvent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
interface FhirAuditEvent : FhirDomainResource {

    /**
     * Type/identifier of event.
     */
    val type: Coding

    /**
     * More specific type/id for the event.
     */
    val subtype: List<Coding>?

    /**
     * Indicator for type of action performed during the event that generated the
     * audit.
     */
    val action: AuditEventAction?

    /**
     * Time when the event occurred on source.
     */
    val recorded: Instant

    /**
     * Whether the event succeeded or failed.
     */
    val outcome: String?

    /**
     * Description of the event outcome.
     */
    val outcomeDesc: String?

    /**
     * The purposeOfUse of the event.
     */
    val purposeOfEvent: List<CodeableConcept>?

    /**
     * Actor involved in the event.
     */
    val agent: List<AuditEventAgent>

    /**
     * Audit Event Reporter.
     */
    val source: AuditEventSource

    /**
     * Data or objects used.
     */
    val entity: List<AuditEventEntity>?
}

/**
 * AuditEvent
 *
 * SourceFileName: AuditEvent.kt
 *
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection
 * of intrusion attempts and monitoring for inappropriate usage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEvent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
@Serializable
@SerialName("AuditEvent")
data class AuditEvent(

    @SerialName("type")
    override val type: Coding,

    @SerialName("subtype")
    override val subtype: List<Coding>? = null,

    @SerialName("action")
    override val action: AuditEventAction? = null,

    @SerialName("recorded")
    override val recorded: Instant,

    @SerialName("outcome")
    override val outcome: String? = null,

    @SerialName("outcomeDesc")
    override val outcomeDesc: String? = null,

    @SerialName("purposeOfEvent")
    override val purposeOfEvent: List<CodeableConcept>? = null,

    @SerialName("agent")
    override val agent: List<AuditEventAgent>,

    @SerialName("source")
    override val source: AuditEventSource,

    @SerialName("entity")
    override val entity: List<AuditEventEntity>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirAuditEvent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AuditEvent"
    }
}

/**
 * FhirAuditEventAgent
 *
 * An actor taking an active role in the event or activity that is logged.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventAgent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
interface FhirAuditEventAgent : FhirBackboneElement {

    /**
     * Agent role in the event.
     */
    val role: List<CodeableConcept>?

    /**
     * Direct reference to resource.
     */
    val reference: Reference?

    /**
     * Unique identifier for the user.
     */
    val userId: Identifier?

    /**
     * Alternative User id e.g. authentication.
     */
    val altId: String?

    /**
     * Human-meaningful name for the agent.
     */
    val name: String?

    /**
     * Whether user is initiator.
     */
    val requestor: Bool

    /**
     * Where.
     */
    val location: Reference?

    /**
     * Policy that authorized event.
     */
    val policy: List<String>?

    /**
     * Type of media.
     */
    val media: Coding?

    /**
     * Logical network location for application activity.
     */
    val network: AuditEventAgentNetwork?

    /**
     * Reason given for this user.
     */
    val purposeOfUse: List<CodeableConcept>?
}

/**
 * AuditEventAgent
 *
 * SourceFileName: AuditEvent.kt
 *
 * An actor taking an active role in the event or activity that is logged.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventAgent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
@Serializable
@SerialName("AuditEventAgent")
data class AuditEventAgent(

    @SerialName("role")
    override val role: List<CodeableConcept>? = null,

    @SerialName("reference")
    override val reference: Reference? = null,

    @SerialName("userId")
    override val userId: Identifier? = null,

    @SerialName("altId")
    override val altId: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("requestor")
    override val requestor: Bool,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("policy")
    override val policy: List<String>? = null,

    @SerialName("media")
    override val media: Coding? = null,

    @SerialName("network")
    override val network: AuditEventAgentNetwork? = null,

    @SerialName("purposeOfUse")
    override val purposeOfUse: List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAuditEventAgent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AuditEventAgent"
    }
}

/**
 * FhirAuditEventAgentNetwork
 *
 * Logical network location for application activity, if the activity has a network location.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventAgentNetwork</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
interface FhirAuditEventAgentNetwork : FhirBackboneElement {

    /**
     * Identifier for the network access point of the user device.
     */
    val address: String?

    /**
     * The type of network access point.
     */
    val type: String?
}

/**
 * AuditEventAgentNetwork
 *
 * SourceFileName: AuditEvent.kt
 *
 * Logical network location for application activity, if the activity has a network location.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventAgentNetwork</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
@Serializable
@SerialName("AuditEventAgentNetwork")
data class AuditEventAgentNetwork(

    @SerialName("address")
    override val address: String? = null,

    @SerialName("type")
    override val type: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAuditEventAgentNetwork {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AuditEventAgentNetwork"
    }
}

/**
 * FhirAuditEventEntity
 *
 * Specific instances of data or objects that have been accessed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventEntity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
interface FhirAuditEventEntity : FhirBackboneElement {

    /**
     * Specific instance of object.
     */
    val identifier: Identifier?

    /**
     * Specific instance of resource.
     */
    val reference: Reference?

    /**
     * Type of entity involved.
     */
    val type: Coding?

    /**
     * What role the entity played.
     */
    val role: Coding?

    /**
     * Life-cycle stage for the entity.
     */
    val lifecycle: Coding?

    /**
     * Security labels on the entity.
     */
    val securityLabel: List<Coding>?

    /**
     * Descriptor for entity.
     */
    val name: String?

    /**
     * Descriptive text.
     */
    val description: String?

    /**
     * Query parameters.
     */
    val query: String?

    /**
     * Additional Information about the entity.
     */
    val detail: List<AuditEventEntityDetail>?
}

/**
 * AuditEventEntity
 *
 * SourceFileName: AuditEvent.kt
 *
 * Specific instances of data or objects that have been accessed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventEntity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
@Serializable
@SerialName("AuditEventEntity")
data class AuditEventEntity(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("reference")
    override val reference: Reference? = null,

    @SerialName("type")
    override val type: Coding? = null,

    @SerialName("role")
    override val role: Coding? = null,

    @SerialName("lifecycle")
    override val lifecycle: Coding? = null,

    @SerialName("securityLabel")
    override val securityLabel: List<Coding>? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("query")
    override val query: String? = null,

    @SerialName("detail")
    override val detail: List<AuditEventEntityDetail>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAuditEventEntity {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AuditEventEntity"
    }
}

/**
 * FhirAuditEventEntityDetail
 *
 * Tagged value pairs for conveying additional information about the entity.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventEntityDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
interface FhirAuditEventEntityDetail : FhirBackboneElement {

    /**
     * Name of the property.
     */
    val type: String

    /**
     * Property value.
     */
    val value: String
}

/**
 * AuditEventEntityDetail
 *
 * SourceFileName: AuditEvent.kt
 *
 * Tagged value pairs for conveying additional information about the entity.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventEntityDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
@Serializable
@SerialName("AuditEventEntityDetail")
data class AuditEventEntityDetail(

    @SerialName("type")
    override val type: String,

    @SerialName("value")
    override val value: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAuditEventEntityDetail {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AuditEventEntityDetail"
    }
}

/**
 * FhirAuditEventSource
 *
 * The system that is reporting the event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventSource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
interface FhirAuditEventSource : FhirBackboneElement {

    /**
     * Logical source location within the enterprise.
     */
    val site: String?

    /**
     * The identity of source detecting the event.
     */
    val identifier: Identifier

    /**
     * The type of source where event originated.
     */
    val type: List<Coding>?
}

/**
 * AuditEventSource
 *
 * SourceFileName: AuditEvent.kt
 *
 * The system that is reporting the event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AuditEvent">AuditEventSource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AuditEvent)
 */
@Serializable
@SerialName("AuditEventSource")
data class AuditEventSource(

    @SerialName("site")
    override val site: String? = null,

    @SerialName("identifier")
    override val identifier: Identifier,

    @SerialName("type")
    override val type: List<Coding>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAuditEventSource {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AuditEventSource"
    }
}
