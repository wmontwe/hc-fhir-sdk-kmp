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

import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.r4.codesystem.CarePlanActivityStatus
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CarePlanTest.java
 *
 * Healthcare plan for patient or group
 *
 * Describes the intention of how one or more practitioners intend to deliver care for a particular
 * patient, group or community for a period of time, possibly limited to care for a specific condition
 * or set of conditions.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CarePlanTest {

    val parser = FhirR4Parser()

    @Test
    fun testCarePlan01() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f002-lung.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "359615001",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Partial lobectomy of lung",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.activity?.get(0)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.SERVICEREQUEST,
            data.activity?.get(0)?.detail?.kind
        )
        assertEquals(
            "M.I.M. Versteegh",
            data.activity?.get(0)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "Practitioner/f003",
            data.activity?.get(0)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            "2011-07-07T09:30:10+01:00",
            data.activity?.get(0)?.detail?.scheduledString
        )
        assertEquals(
            CarePlanActivityStatus.COMPLETED,
            data.activity?.get(0)?.detail?.status
        )
        assertEquals(
            "?????",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "Condition/f201",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "#careteam",
            data.careTeam?.get(0)?.reference
        )
        assertEquals(
            "careteam",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "goal",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "#goal",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "f002",
            data.id
        )
        assertEquals(
            "http://www.bmc.nl/zorgportal/identifiers/careplans",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "CP2934",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2013-07-07",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2011-07-06",
            data.period?.start?.value.toString()
        )
        assertEquals(
            RequestStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "P. van de Heuvel",
            data.subject?.display
        )
        assertEquals(
            "Patient/f001",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan02() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f202-malignancy.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "367336001",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Chemotherapy",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(0)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.SERVICEREQUEST,
            data.activity?.get(0)?.detail?.kind
        )
        assertEquals(
            "#tpf",
            data.activity?.get(0)?.detail?.productReference?.reference
        )
        assertEquals(
            CarePlanActivityStatus.IN_PROGRESS,
            data.activity?.get(0)?.detail?.status
        )
        assertEquals(
            "Roel's Chemotherapy",
            data.activity?.get(0)?.outcomeReference?.get(0)?.display
        )
        assertEquals(
            "Procedure/f201",
            data.activity?.get(0)?.outcomeReference?.get(0)?.reference
        )
        assertEquals(
            "Roel's head-neck tumor",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "Condition/f202",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "#careteam",
            data.careTeam?.get(0)?.reference
        )
        assertEquals(
            "doce",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "cisp",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "fluo",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "tpf",
            data.contained?.get(3)?.id
        )
        assertEquals(
            "careteam",
            data.contained?.get(4)?.id
        )
        assertEquals(
            "goal",
            data.contained?.get(5)?.id
        )
        assertEquals(
            "#goal",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "f202",
            data.id
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Roel",
            data.subject?.display
        )
        assertEquals(
            "Patient/f201",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan03() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-obesity-narrative.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "obesity-narrative",
            data.id
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Peter James Chalmers",
            data.subject?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan04() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "3141-9",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Weight Measured",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "27113001",
            data.activity?.get(0)?.detail?.code?.coding?.get(1)?.code
        )
        assertEquals(
            "Body weight",
            data.activity?.get(0)?.detail?.code?.coding?.get(1)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(0)?.detail?.code?.coding?.get(1)?.system
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(0)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "Patient's home",
            data.activity?.get(0)?.detail?.location?.display
        )
        assertEquals(
            "Peter James Chalmers",
            data.activity?.get(0)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "Patient/example",
            data.activity?.get(0)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            "1".toLong(),
            data.activity?.get(0)?.detail?.scheduledTiming?.repeat?.frequency?.value
        )
        assertEquals(
            "1".toDouble(),
            data.activity?.get(0)?.detail?.scheduledTiming?.repeat?.period?.value
        )
        assertEquals(
            "d",
            data.activity?.get(0)?.detail?.scheduledTiming?.repeat?.periodUnit
        )
        assertEquals(
            CarePlanActivityStatus.COMPLETED,
            data.activity?.get(0)?.detail?.status
        )
        assertEquals(
            "Achieved weight loss to mitigate diabetes risk.",
            data.activity?.get(0)?.detail?.statusReason?.text
        )
        assertEquals(
            "161832001",
            data.activity?.get(0)?.outcomeCodeableConcept?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Progressive weight loss",
            data.activity?.get(0)?.outcomeCodeableConcept?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(0)?.outcomeCodeableConcept?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Weight Measured",
            data.activity?.get(0)?.outcomeReference?.get(0)?.display
        )
        assertEquals(
            "Observation/example",
            data.activity?.get(0)?.outcomeReference?.get(0)?.reference
        )
        assertEquals(
            "obesity",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "#p1",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "Dr Adam Careful",
            data.author?.display
        )
        assertEquals(
            "Practitioner/example",
            data.author?.reference
        )
        assertEquals(
            "Management of Type 2 Diabetes",
            data.basedOn?.get(0)?.display
        )
        assertEquals(
            "CareTeam/example",
            data.careTeam?.get(0)?.reference
        )
        assertEquals(
            "Weight management plan",
            data.category?.get(0)?.text
        )
        assertEquals(
            "p1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "2016-01-01",
            data.created?.value.toString()
        )
        assertEquals(
            "Manage obesity and weight loss",
            data.description
        )
        assertEquals(
            "Encounter/home",
            data.encounter?.reference
        )
        assertEquals(
            "Goal/example",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://example.org/protocol-for-obesity",
            data.instantiatesUri?.get(0)
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Overall wellness plan",
            data.partOf?.get(0)?.display
        )
        assertEquals(
            "2017-06-01",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "Plan from urgent care clinic",
            data.replaces?.get(0)?.display
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Peter James Chalmers",
            data.subject?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan05() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f201-renal.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "284093001",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Potassium supplementation",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "258718000",
            data.activity?.get(0)?.detail?.dailyAmount?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(0)?.detail?.dailyAmount?.system
        )
        assertEquals(
            "mmol",
            data.activity?.get(0)?.detail?.dailyAmount?.unit
        )
        assertEquals(
            "80".toDouble(),
            data.activity?.get(0)?.detail?.dailyAmount?.value?.value
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(0)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.NUTRITIONORDER,
            data.activity?.get(0)?.detail?.kind
        )
        assertEquals(
            "Potassium",
            data.activity?.get(0)?.detail?.productReference?.display
        )
        assertEquals(
            "Substance/f203",
            data.activity?.get(0)?.detail?.productReference?.reference
        )
        assertEquals(
            "daily",
            data.activity?.get(0)?.detail?.scheduledString
        )
        assertEquals(
            CarePlanActivityStatus.COMPLETED,
            data.activity?.get(0)?.detail?.status
        )
        assertEquals(
            "306005",
            data.activity?.get(1)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Echography of kidney",
            data.activity?.get(1)?.detail?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(1)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(1)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.SERVICEREQUEST,
            data.activity?.get(1)?.detail?.kind
        )
        assertEquals(
            CarePlanActivityStatus.COMPLETED,
            data.activity?.get(1)?.detail?.status
        )
        assertEquals(
            "Roel's renal insufficiency",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "Condition/f204",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "#careteam",
            data.careTeam?.get(0)?.reference
        )
        assertEquals(
            "careteam",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "goal",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "#goal",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "f201",
            data.id
        )
        assertEquals(
            RequestIntent.PROPOSAL,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2013-03-13",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2013-03-11",
            data.period?.start?.value.toString()
        )
        assertEquals(
            RequestStatus.DRAFT,
            data.status
        )
        assertEquals(
            "Roel",
            data.subject?.display
        )
        assertEquals(
            "Patient/f201",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan06() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-GPVisit.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "nursecon",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org/local",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Nurse Consultation",
            data.activity?.get(0)?.detail?.code?.text
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(0)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.APPOINTMENT,
            data.activity?.get(0)?.detail?.kind
        )
        assertEquals(
            "Nurse Nancy",
            data.activity?.get(0)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "Practitioner/13",
            data.activity?.get(0)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            "2013-01-01T10:50:00+00:00",
            data.activity?.get(0)?.detail?.scheduledPeriod?.end?.value.toString()
        )
        assertEquals(
            "2013-01-01T10:38:00+00:00",
            data.activity?.get(0)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.COMPLETED,
            data.activity?.get(0)?.detail?.status
        )
        assertEquals(
            "Encounter/example",
            data.activity?.get(0)?.outcomeReference?.get(0)?.reference
        )
        assertEquals(
            "doccon",
            data.activity?.get(1)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org/local",
            data.activity?.get(1)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Doctor Consultation",
            data.activity?.get(1)?.detail?.code?.text
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(1)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.APPOINTMENT,
            data.activity?.get(1)?.detail?.kind
        )
        assertEquals(
            "Doctor Dave",
            data.activity?.get(1)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "Practitioner/14",
            data.activity?.get(1)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            CarePlanActivityStatus.SCHEDULED,
            data.activity?.get(1)?.detail?.status
        )
        assertEquals(
            "obesity",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "#p1",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "#careteam",
            data.careTeam?.get(0)?.reference
        )
        assertEquals(
            "p1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "careteam",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "goal",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "#goal",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "gpvisit",
            data.id
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2013-01-01T10:30:00+00:00",
            data.period?.start?.value.toString()
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Peter James Chalmers",
            data.subject?.display
        )
        assertEquals(
            "Patient/100",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan07() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-integrated.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "Eve will review photos of high and low density foods and share with her parents",
            data.activity?.get(0)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(0)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(0)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(0)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g1",
            data.activity?.get(0)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(0)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.NOT_STARTED,
            data.activity?.get(0)?.detail?.status
        )
        assertEquals(
            "Eve eats one meal a day with her parents",
            data.activity?.get(0)?.progress?.get(0)?.text
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(0)?.progress?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Eve will ask her dad to asist her to put the head of her bed on blocks",
            data.activity?.get(1)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(1)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(1)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(1)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g1",
            data.activity?.get(1)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            ResourceType.COMMUNICATIONREQUEST,
            data.activity?.get(1)?.detail?.kind
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(1)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.NOT_STARTED,
            data.activity?.get(1)?.detail?.status
        )
        assertEquals(
            "Eve will sleep in her bed more often than the couch",
            data.activity?.get(1)?.progress?.get(0)?.text
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(1)?.progress?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Eve will reduce her intake of coffee and chocolate",
            data.activity?.get(2)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(2)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(2)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(2)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g2",
            data.activity?.get(2)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(2)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.IN_PROGRESS,
            data.activity?.get(2)?.detail?.status
        )
        assertEquals(
            "Eve will walk her friend's dog up and down a big hill 15-30 minutes 3 days a week",
            data.activity?.get(3)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(3)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(3)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(3)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g3",
            data.activity?.get(3)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-08-27",
            data.activity?.get(3)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.IN_PROGRESS,
            data.activity?.get(3)?.detail?.status
        )
        assertEquals(
            "Eve would like to try for 5 days a week.",
            data.activity?.get(3)?.progress?.get(0)?.text
        )
        assertEquals(
            "2012-08-27",
            data.activity?.get(3)?.progress?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Eve is still walking the dogs.",
            data.activity?.get(3)?.progress?.get(1)?.text
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(3)?.progress?.get(1)?.time?.value.toString()
        )
        assertEquals(
            "Eve will walk 3 blocks to her parents house twice a week",
            data.activity?.get(4)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(4)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(4)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(4)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g3",
            data.activity?.get(4)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-07-23",
            data.activity?.get(4)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.IN_PROGRESS,
            data.activity?.get(4)?.detail?.status
        )
        assertEquals(
            "Eve walked 4 times the last week.",
            data.activity?.get(4)?.progress?.get(0)?.text
        )
        assertEquals(
            "2012-08-13",
            data.activity?.get(4)?.progress?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Eve did not walk to her parents the last week, but has plans to start again",
            data.activity?.get(4)?.progress?.get(1)?.text
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(4)?.progress?.get(1)?.time?.value.toString()
        )
        assertEquals(
            "Eve will use a calendar to check off after medications are taken",
            data.activity?.get(5)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(5)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(5)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-08-13",
            data.activity?.get(5)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g4",
            data.activity?.get(5)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-07-23",
            data.activity?.get(5)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.IN_PROGRESS,
            data.activity?.get(5)?.detail?.status
        )
        assertEquals(
            "Eve will use her lights MWF after her shower for 3 minutes",
            data.activity?.get(6)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(6)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(6)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-08-27",
            data.activity?.get(6)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g5",
            data.activity?.get(6)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-07-23",
            data.activity?.get(6)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.IN_PROGRESS,
            data.activity?.get(6)?.detail?.status
        )
        assertEquals(
            "After restarting the vinegar soaks the psoriasis is improved and Eve plans to treat the remainder with light treatments.  She plans to start this week.",
            data.activity?.get(6)?.progress?.get(0)?.text
        )
        assertEquals(
            "2012-08-13",
            data.activity?.get(6)?.progress?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Since her skin is improved Eve has not been using the light treatment as often, maybe once a week.  She would like to increase to 3 times a week again",
            data.activity?.get(6)?.progress?.get(1)?.text
        )
        assertEquals(
            "2012-08-27",
            data.activity?.get(6)?.progress?.get(1)?.time?.value.toString()
        )
        assertEquals(
            "Eve will use a calendar of a chart to help her remember when to take her medications",
            data.activity?.get(7)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(7)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(7)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-09-10",
            data.activity?.get(7)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g4",
            data.activity?.get(7)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-07-10",
            data.activity?.get(7)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.IN_PROGRESS,
            data.activity?.get(7)?.detail?.status
        )
        assertEquals(
            "Eve created a chart as a reminer to take the medications that do not fit in her pill box",
            data.activity?.get(7)?.progress?.get(0)?.text
        )
        assertEquals(
            "2012-07-23",
            data.activity?.get(7)?.progress?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Eve will start using stretch bands and one step 2 days a week Mon/Wed 6-7am and maybe Friday afternoon",
            data.activity?.get(8)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(8)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(8)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-08-23",
            data.activity?.get(8)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g3",
            data.activity?.get(8)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-07-23",
            data.activity?.get(8)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.ON_HOLD,
            data.activity?.get(8)?.detail?.status
        )
        assertEquals(
            "Will be able to esume exercise.",
            data.activity?.get(8)?.progress?.get(0)?.text
        )
        assertEquals(
            "2012-07-30",
            data.activity?.get(8)?.progress?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Eve prefers to focus on walking at this time",
            data.activity?.get(8)?.progress?.get(1)?.text
        )
        assertEquals(
            "2012-08-13",
            data.activity?.get(8)?.progress?.get(1)?.time?.value.toString()
        )
        assertEquals(
            "Eve will match a printed medication worksheet with the medication bottles at home",
            data.activity?.get(9)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(9)?.detail?.doNotPerform?.value
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/RevisionDate",
            data.activity?.get(9)?.detail?.extension?.get(0)?.url
        )
        assertEquals(
            "2012-07-23",
            data.activity?.get(9)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "#g4",
            data.activity?.get(9)?.detail?.goal?.get(0)?.reference
        )
        assertEquals(
            "2012-07-10",
            data.activity?.get(9)?.detail?.scheduledPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.COMPLETED,
            data.activity?.get(9)?.detail?.status
        )
        assertEquals(
            "GERDS",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "#p1",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "Obesity",
            data.addresses?.get(1)?.display
        )
        assertEquals(
            "#p2",
            data.addresses?.get(1)?.reference
        )
        assertEquals(
            "Psoriasis",
            data.addresses?.get(2)?.display
        )
        assertEquals(
            "#p3",
            data.addresses?.get(2)?.reference
        )
        assertEquals(
            "p1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "p2",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "p3",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "g1",
            data.contained?.get(3)?.id
        )
        assertEquals(
            "g2",
            data.contained?.get(4)?.id
        )
        assertEquals(
            "g3",
            data.contained?.get(5)?.id
        )
        assertEquals(
            "g4",
            data.contained?.get(6)?.id
        )
        assertEquals(
            "g5",
            data.contained?.get(7)?.id
        )
        assertEquals(
            "#g1",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "#g2",
            data.goal?.get(1)?.reference
        )
        assertEquals(
            "#g3",
            data.goal?.get(2)?.reference
        )
        assertEquals(
            "#g4",
            data.goal?.get(3)?.reference
        )
        assertEquals(
            "#g5",
            data.goal?.get(4)?.reference
        )
        assertEquals(
            "integrate",
            data.id
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Patient family is not ready to commit to goal setting at this time.  Goal setting will be addressed in the future",
            data.note?.get(0)?.text
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Eve Everywoman",
            data.subject?.display
        )
        assertEquals(
            "Patient/1",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan08() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f003-pharynx.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "172960003",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Incision of retropharyngeal abscess",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.activity?.get(0)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.SERVICEREQUEST,
            data.activity?.get(0)?.detail?.kind
        )
        assertEquals(
            "E.M. van den broek",
            data.activity?.get(0)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "Practitioner/f001",
            data.activity?.get(0)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            "2011-06-27T09:30:10+01:00",
            data.activity?.get(0)?.detail?.scheduledString
        )
        assertEquals(
            CarePlanActivityStatus.COMPLETED,
            data.activity?.get(0)?.detail?.status
        )
        assertEquals(
            "?????",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "Condition/f201",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "#careteam",
            data.careTeam?.get(0)?.reference
        )
        assertEquals(
            "careteam",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "goal",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "#goal",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "f003",
            data.id
        )
        assertEquals(
            "http://www.bmc.nl/zorgportal/identifiers/careplans",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "CP3953",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2013-03-08T09:30:10+01:00",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2013-03-08T09:00:10+01:00",
            data.period?.start?.value.toString()
        )
        assertEquals(
            RequestStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "P. van de Heuvel",
            data.subject?.display
        )
        assertEquals(
            "Patient/f001",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan09() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f001-heart.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "64915003",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Operation on heart",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.activity?.get(0)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.SERVICEREQUEST,
            data.activity?.get(0)?.detail?.kind
        )
        assertEquals(
            "P. Voigt",
            data.activity?.get(0)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "Practitioner/f002",
            data.activity?.get(0)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            "2011-06-27T09:30:10+01:00",
            data.activity?.get(0)?.detail?.scheduledString
        )
        assertEquals(
            CarePlanActivityStatus.COMPLETED,
            data.activity?.get(0)?.detail?.status
        )
        assertEquals(
            "?????",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "Condition/f201",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "#careteam",
            data.careTeam?.get(0)?.reference
        )
        assertEquals(
            "careteam",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "goal",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "#goal",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "f001",
            data.id
        )
        assertEquals(
            "http://www.bmc.nl/zorgportal/identifiers/careplans",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "CP2903",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2011-06-27",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2011-06-26",
            data.period?.start?.value.toString()
        )
        assertEquals(
            RequestStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "P. van de Heuvel",
            data.subject?.display
        )
        assertEquals(
            "Patient/f001",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCarePlan10() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-pregnancy.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertEquals(
            "Prenatal vitamin MedicationRequest",
            data.activity?.get(0)?.reference?.display
        )
        assertEquals(
            "1an",
            data.activity?.get(1)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org/mySystem",
            data.activity?.get(1)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "First Antenatal encounter",
            data.activity?.get(1)?.detail?.code?.text
        )
        assertEquals(
            "The first antenatal encounter. This is where a detailed physical examination is performed.             and the pregnanacy discussed with the mother-to-be.",
            data.activity?.get(1)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(1)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.APPOINTMENT,
            data.activity?.get(1)?.detail?.kind
        )
        assertEquals(
            "Mavis Midwife",
            data.activity?.get(1)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "#pr1",
            data.activity?.get(1)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            "2013-02-28",
            data.activity?.get(1)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.end?.value.toString()
        )
        assertEquals(
            "2013-02-14",
            data.activity?.get(1)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.SCHEDULED,
            data.activity?.get(1)?.detail?.status
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/careplan#andetails",
            data.activity?.get(1)?.extension?.get(0)?.url
        )
        assertEquals(
            "http://orionhealth.com/fhir/careplan/1andetails",
            data.activity?.get(1)?.extension?.get(0)?.valueUri
        )
        assertEquals(
            "an",
            data.activity?.get(2)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org/mySystem",
            data.activity?.get(2)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Follow-up Antenatal encounter",
            data.activity?.get(2)?.detail?.code?.text
        )
        assertEquals(
            "The second antenatal encounter. Discuss any issues that arose from the first antenatal encounter",
            data.activity?.get(2)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(2)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.APPOINTMENT,
            data.activity?.get(2)?.detail?.kind
        )
        assertEquals(
            "Mavis Midwife",
            data.activity?.get(2)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "#pr1",
            data.activity?.get(2)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            "2013-03-14",
            data.activity?.get(2)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.end?.value.toString()
        )
        assertEquals(
            "2013-03-01",
            data.activity?.get(2)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.NOT_STARTED,
            data.activity?.get(2)?.detail?.status
        )
        assertEquals(
            "del",
            data.activity?.get(3)?.detail?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org/mySystem",
            data.activity?.get(3)?.detail?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Delivery",
            data.activity?.get(3)?.detail?.code?.text
        )
        assertEquals(
            "The delivery.",
            data.activity?.get(3)?.detail?.description
        )
        assertEquals(
            "False".toBoolean(),
            data.activity?.get(3)?.detail?.doNotPerform?.value
        )
        assertEquals(
            ResourceType.APPOINTMENT,
            data.activity?.get(3)?.detail?.kind
        )
        assertEquals(
            "Mavis Midwife",
            data.activity?.get(3)?.detail?.performer?.get(0)?.display
        )
        assertEquals(
            "#pr1",
            data.activity?.get(3)?.detail?.performer?.get(0)?.reference
        )
        assertEquals(
            "2013-09-14",
            data.activity?.get(3)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.end?.value.toString()
        )
        assertEquals(
            "2013-09-01",
            data.activity?.get(3)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            CarePlanActivityStatus.NOT_STARTED,
            data.activity?.get(3)?.detail?.status
        )
        assertEquals(
            "pregnancy",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "#p1",
            data.addresses?.get(0)?.reference
        )
        assertEquals(
            "#careteam",
            data.careTeam?.get(0)?.reference
        )
        assertEquals(
            "p1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "pr1",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "pr2",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "careteam",
            data.contained?.get(3)?.id
        )
        assertEquals(
            "goal",
            data.contained?.get(4)?.id
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/careplan#lmp",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "2013-01-01",
            data.extension?.get(0)?.valueDateTime?.value.toString()
        )
        assertEquals(
            "#goal",
            data.goal?.get(0)?.reference
        )
        assertEquals(
            "preg",
            data.id
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2013-10-01",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2013-01-01",
            data.period?.start?.value.toString()
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Eve Everywoman",
            data.subject?.display
        )
        assertEquals(
            "Patient/1",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
