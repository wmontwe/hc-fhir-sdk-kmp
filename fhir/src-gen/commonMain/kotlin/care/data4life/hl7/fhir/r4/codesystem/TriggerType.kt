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

package care.data4life.hl7.fhir.r4.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Code System: TriggerType
 *
 * The type of trigger.
 *
 * @see <a href="http://hl7.org/fhir/trigger-type">TriggerType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/trigger-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class TriggerType {

    /**
     * The trigger occurs in response to a specific named event, and no other
     * information about the trigger is specified. Named events are completely pre-
     * coordinated, and the formal semantics of the trigger are not provided.
     */
    @SerialName("named-event")
    NAMED_EVENT,

    /**
     * The trigger occurs at a specific time or periodically as described by a timing
     * or schedule. A periodic event cannot have any data elements, but may have a name
     * assigned as a shorthand for the event.
     */
    @SerialName("periodic")
    PERIODIC,

    /**
     * The trigger occurs whenever data of a particular type is changed in any way,
     * either added, modified, or removed.
     */
    @SerialName("data-changed")
    DATA_CHANGED,

    /**
     * The trigger occurs whenever data of a particular type is added.
     */
    @SerialName("data-added")
    DATA_ADDED,

    /**
     * The trigger occurs whenever data of a particular type is modified.
     */
    @SerialName("data-modified")
    DATA_MODIFIED,

    /**
     * The trigger occurs whenever data of a particular type is removed.
     */
    @SerialName("data-removed")
    DATA_REMOVED,

    /**
     * The trigger occurs whenever data of a particular type is accessed.
     */
    @SerialName("data-accessed")
    DATA_ACCESSED,

    /**
     * The trigger occurs whenever access to data of a particular type is completed.
     */
    @SerialName("data-access-ended")
    DATA_ACCESS_ENDED,
}
