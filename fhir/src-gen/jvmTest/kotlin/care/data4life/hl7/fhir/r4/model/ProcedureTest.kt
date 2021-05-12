/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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
import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ProcedureTest.java
 *
 * An action that is being or was performed on a patient.
 *
 * An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ProcedureTest {

    val parser = FhirR4Parser()

    @Test
    fun testProcedure1() {
        val sourceJson = loadAsString("r4/procedure-example-f201-tpf.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("272676008", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Sphenoid bone", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("367336001", data.code?.coding?.get(0)?.code)
        assertEquals("Chemotherapy", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Roel's encounter on January 28th, 2013", data.encounter?.display)
        assertEquals("Encounter/f202", data.encounter?.reference)
        assertEquals("f201", data.id)
        assertEquals("PlanDefinition/KDN5", data.instantiatesCanonical?.get(0))
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Eerste neo-adjuvante TPF-kuur bij groot proces in sphenoid met intracraniale uitbreiding.", data.note?.get(0)?.text)
        assertEquals("2013-01-28T14:27:00+01:00", data.performedPeriod?.end?.value.toString(),)
        assertEquals("2013-01-28T13:31:00+01:00", data.performedPeriod?.start?.value.toString(),)
        assertEquals("Dokter Bronsig", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/f201", data.performer?.get(0)?.actor?.reference)
        assertEquals("310512001", data.performer?.get(0)?.function?.coding?.get(0)?.code)
        assertEquals("Medical oncologist", data.performer?.get(0)?.function?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.performer?.get(0)?.function?.coding?.get(0)?.system)
        assertEquals("DiagnosticReport/f201", data.reasonCode?.get(0)?.text)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure2() {
        val sourceJson = loadAsString("r4/procedure-example-ambulation.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("Maternity care plan", data.basedOn?.get(0)?.display)
        assertEquals("CarePlan/preg", data.basedOn?.get(0)?.reference)
        assertEquals("62013009", data.code?.coding?.get(0)?.code)
        assertEquals("Ambulating patient (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Ambulation", data.code?.text)
        assertEquals("ambulation", data.id)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals("http://example.org/protocol-for-hypertension-during-pregnancy", data.instantiatesUri?.get(0))
        assertEquals("Burgers University Medical Center, South Wing, second floor", data.location?.display)
        assertEquals("Location/1", data.location?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Carla Espinosa", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/f204", data.performer?.get(0)?.actor?.reference)
        assertEquals("University Medical Hospital", data.performer?.get(0)?.onBehalfOf?.display)
        assertEquals("Organization/f001", data.performer?.get(0)?.onBehalfOf?.reference)
        assertEquals("Blood Pressure", data.reasonReference?.get(0)?.display)
        assertEquals("Observation/blood-pressure", data.reasonReference?.get(0)?.reference)
        assertEquals(EventStatus.NOT_DONE, data.status)
        assertEquals("398254007", data.statusReason?.coding?.get(0)?.code)
        assertEquals("  Pre-eclampsia (disorder)", data.statusReason?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.statusReason?.coding?.get(0)?.system)
        assertEquals("Pre-eclampsia", data.statusReason?.text)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Ambulation procedure was not done</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure3() {
        val sourceJson = loadAsString("r4/procedure-example-implant.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("25267002", data.code?.coding?.get(0)?.code)
        assertEquals("Insertion of intracardiac pacemaker (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Implant Pacemaker", data.code?.text)
        assertEquals("implanted", data.focalDevice?.get(0)?.action?.coding?.get(0)?.code)
        assertEquals("http://hl7.org/fhir/device-action", data.focalDevice?.get(0)?.action?.coding?.get(0)?.system)
        assertEquals("Device/example-pacemaker", data.focalDevice?.get(0)?.manipulated?.reference)
        assertEquals("ROS 5 days  - 2013-04-10", data.followUp?.get(0)?.text)
        assertEquals("example-implant", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Routine Appendectomy. Appendix was inflamed and in retro-caecal position", data.note?.get(0)?.text)
        assertEquals("2015-04-05", data.performedDateTime?.value.toString(),)
        assertEquals("Dr Cecil Surgeon", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/example", data.performer?.get(0)?.actor?.reference)
        assertEquals("Bradycardia", data.reasonCode?.get(0)?.text)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure4() {
        val sourceJson = loadAsString("r4/procedure-example-colon-biopsy.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("76164006", data.code?.coding?.get(0)?.code)
        assertEquals("Biopsy of colon (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Biopsy of colon", data.code?.text)
        assertEquals("colon-biopsy", data.id)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals("Burgers University Medical Center, South Wing, second floor", data.location?.display)
        assertEquals("Location/1", data.location?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Colonoscopy", data.partOf?.get(0)?.display)
        assertEquals("Procedure/colonoscopy", data.partOf?.get(0)?.reference)
        assertEquals("Dr Adam Careful", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/example", data.performer?.get(0)?.actor?.reference)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Biopsy of colon, which was part of colonoscopy</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure5() {
        val sourceJson = loadAsString("r4/procedure-example-f004-tracheotomy.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("83030008", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Retropharyngeal area", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("48387007", data.code?.coding?.get(0)?.code)
        assertEquals("Tracheotomy", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Encounter/f003", data.encounter?.reference)
        assertEquals("described in care plan", data.followUp?.get(0)?.text)
        assertEquals("f004", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("removal of the retropharyngeal abscess", data.outcome?.text)
        assertEquals("2013-03-22T10:30:10+01:00", data.performedPeriod?.end?.value.toString(),)
        assertEquals("2013-03-22T09:30:10+01:00", data.performedPeriod?.start?.value.toString(),)
        assertEquals("A. Langeveld", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/f005", data.performer?.get(0)?.actor?.reference)
        assertEquals("01.000", data.performer?.get(0)?.function?.coding?.get(0)?.code)
        assertEquals("Arts", data.performer?.get(0)?.function?.coding?.get(0)?.display)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.15.111", data.performer?.get(0)?.function?.coding?.get(0)?.system)
        assertEquals("Care role", data.performer?.get(0)?.function?.text)
        assertEquals("ensure breathing during surgery", data.reasonCode?.get(0)?.text)
        assertEquals("???????????", data.report?.get(0)?.display)
        assertEquals("DiagnosticReport/f001", data.report?.get(0)?.reference)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure6() {
        val sourceJson = loadAsString("r4/procedure-example-education.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("Order for health education", data.basedOn?.get(0)?.display)
        assertEquals("ServiceRequest/education", data.basedOn?.get(0)?.reference)
        assertEquals("311401005", data.category?.coding?.get(0)?.code)
        assertEquals("Patient education (procedure)", data.category?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.coding?.get(0)?.system)
        assertEquals("Education", data.category?.text)
        assertEquals("48023004", data.code?.coding?.get(0)?.code)
        assertEquals("Breast self-examination technique education (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Health education - breast examination", data.code?.text)
        assertEquals("education", data.id)
        assertEquals("Southside Community Health Center", data.location?.display)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2014-08-16", data.performedDateTime?.value.toString(),)
        assertEquals("Pamela Educator, RN", data.performer?.get(0)?.actor?.display)
        assertEquals("early detection of breast mass", data.reasonCode?.get(0)?.text)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("Jane Doe", data.subject?.display)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Health education - breast examination for early detection of breast mass</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure7() {
        val sourceJson = loadAsString("r4/procedure-example-colonoscopy.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("73761001", data.code?.coding?.get(0)?.code)
        assertEquals("Colonoscopy (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Colonoscopy", data.code?.text)
        assertEquals("Perforated intestine condition", data.complicationDetail?.get(0)?.display)
        assertEquals("colonoscopy", data.id)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals("Burgers University Medical Center, South Wing, second floor", data.location?.display)
        assertEquals("Location/1", data.location?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Dr Adam Careful", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/example", data.performer?.get(0)?.actor?.reference)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Colonoscopy with complication</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("Colonoscope device", data.usedReference?.get(0)?.display)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure8() {
        val sourceJson = loadAsString("r4/procedure-example-physical-therapy.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("Order for the assessment of passive range of motion", data.basedOn?.get(0)?.display)
        assertEquals("ServiceRequest/physical-therapy", data.basedOn?.get(0)?.reference)
        assertEquals("36701003", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Both knees (body structure)", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("Both knees", data.bodySite?.get(0)?.text)
        assertEquals("386053000", data.category?.coding?.get(0)?.code)
        assertEquals("Evaluation procedure (procedure)", data.category?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.coding?.get(0)?.system)
        assertEquals("Evaluation", data.category?.text)
        assertEquals("710830005", data.code?.coding?.get(0)?.code)
        assertEquals("Assessment of passive range of motion (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Assessment of passive range of motion", data.code?.text)
        assertEquals("physical-therapy", data.id)
        assertEquals("Sawbones Orthopedic Clinic", data.location?.display)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2016-09-27", data.performedDateTime?.value.toString(),)
        assertEquals("Paul Therapist, PT", data.performer?.get(0)?.actor?.display)
        assertEquals("assessment of mobility limitations due to osteoarthritis", data.reasonCode?.get(0)?.text)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Assessment of passive range of motion for both knees on Sept 27, 2016 due to osteoarthritis</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure9() {
        val sourceJson = loadAsString("r4/procedure-example-f003-abscess.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("83030008", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Retropharyngeal area", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("172960003", data.code?.coding?.get(0)?.code)
        assertEquals("Incision of retropharyngeal abscess", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Encounter/f003", data.encounter?.reference)
        assertEquals("described in care plan", data.followUp?.get(0)?.text)
        assertEquals("f003", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("removal of the retropharyngeal abscess", data.outcome?.text)
        assertEquals("2013-03-24T10:30:10+01:00", data.performedPeriod?.end?.value.toString(),)
        assertEquals("2013-03-24T09:30:10+01:00", data.performedPeriod?.start?.value.toString(),)
        assertEquals("E.M.J.M. van den broek", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/f001", data.performer?.get(0)?.actor?.reference)
        assertEquals("01.000", data.performer?.get(0)?.function?.coding?.get(0)?.code)
        assertEquals("Arts", data.performer?.get(0)?.function?.coding?.get(0)?.display)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.15.111", data.performer?.get(0)?.function?.coding?.get(0)?.system)
        assertEquals("Care role", data.performer?.get(0)?.function?.text)
        assertEquals("abcess in retropharyngeal area", data.reasonCode?.get(0)?.text)
        assertEquals("Lab results blood test", data.report?.get(0)?.display)
        assertEquals("DiagnosticReport/f001", data.report?.get(0)?.reference)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testProcedure10() {
        val sourceJson = loadAsString("r4/procedure-example.json")

        val data = parser.toFhir(Procedure::class, sourceJson)

        assertEquals("Dr Cecil Surgeon", data.asserter?.display)
        assertEquals("Practitioner/example", data.asserter?.reference)
        assertEquals("80146002", data.code?.coding?.get(0)?.code)
        assertEquals("Appendectomy (Procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Appendectomy", data.code?.text)
        assertEquals("ROS 5 days  - 2013-04-10", data.followUp?.get(0)?.text)
        assertEquals("example", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Routine Appendectomy. Appendix was inflamed and in retro-caecal position", data.note?.get(0)?.text)
        assertEquals("2013-04-05", data.performedDateTime?.value.toString(),)
        assertEquals("Dr Cecil Surgeon", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/example", data.performer?.get(0)?.actor?.reference)
        assertEquals("Generalized abdominal pain 24 hours. Localized in RIF with rebound and guarding", data.reasonCode?.get(0)?.text)
        assertEquals("Dr Cecil Surgeon", data.recorder?.display)
        assertEquals("Practitioner/example", data.recorder?.reference)
        assertEquals(EventStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Routine Appendectomy</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
