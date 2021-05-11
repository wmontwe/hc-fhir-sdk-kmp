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

import care.data4life.hl7.fhir.stu3.FhirStu3Parser
import care.data4life.hl7.fhir.stu3.codesystem.*
import care.data4life.hl7.fhir.stu3.primitive.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * QuestionnaireResponseTest.java
 *
 * A structured set of questions and their answers.
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class QuestionnaireResponseTest {

    val parser = FhirStu3Parser()

    @Test
    fun testQuestionnaireResponse1() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaireresponse-example.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then

        assertEquals("#questauth", data.author?.reference)
        assertEquals("2013-02-19T14:15:00-05:00", data.authored?.value.toString())
        assertEquals("#order", data.basedOn?.get(0)?.reference)
        assertEquals("patsub", data.contained?.get(0)?.id)
        assertEquals("order", data.contained?.get(1)?.id)
        assertEquals("questauth", data.contained?.get(2)?.id)
        assertEquals("Encounter/example", data.context?.reference)
        assertEquals("3141", data.id)
        assertEquals(
            "http://example.org/fhir/NamingSystem/questionnaire-ids",
            data.identifier?.system
        )
        assertEquals("Q12349876", data.identifier?.value)
        assertEquals(
            "1",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.code
        )
        assertEquals(
            "http://cancer.questionnaire.org/system/code/yesno",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.system
        )
        assertEquals(
            "1.1.1.1",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "1",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(
                0
            )?.valueCoding?.code
        )
        assertEquals(
            "http://cancer.questionnaire.org/system/code/yesno",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(
                0
            )?.valueCoding?.system
        )
        assertEquals(
            "1.1.1.2",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
        )
        assertEquals(
            "0",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(
                0
            )?.valueCoding?.code
        )
        assertEquals(
            "http://cancer.questionnaire.org/system/code/yesno",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(
                0
            )?.valueCoding?.system
        )
        assertEquals(
            "1.1.1.3",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.linkId
        )
        assertEquals("1.1.1", data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.linkId)
        assertEquals("1", data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code)
        assertEquals("Yes", data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display)
        assertEquals(
            "http://cancer.questionnaire.org/system/code/yesno",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals("1.1", data.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals("1", data.item?.get(0)?.linkId)
        assertEquals("Procedure/f201", data.parent?.get(0)?.reference)
        assertEquals(QuestionnaireResponseStatus.COMPLETED, data.status)
        assertEquals("#patsub", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testQuestionnaireResponse2() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaireresponse-example-ussg-fht-answers.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then

        assertEquals("2008-01-17", data.authored?.value.toString())
        assertEquals("ussg-fht-answers", data.id)
        assertEquals(
            "2008-01-17",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDate?.value.toString()
        )
        assertEquals("0.1", data.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals("Date Done", data.item?.get(0)?.item?.get(0)?.text)
        assertEquals("0", data.item?.get(0)?.linkId)
        assertEquals("http://loinc.org/fhir/DataElement/54126-8", data.item?.get(1)?.definition)
        assertEquals(
            "Annie Proband",
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54125-0",
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("1.1.1", data.item?.get(1)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals("Name", data.item?.get(1)?.item?.get(0)?.item?.get(0)?.text)
        assertEquals(
            "LA3-6",
            data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Female",
            data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54131-8",
            data.item?.get(1)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("1.1.2", data.item?.get(1)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Gender", data.item?.get(1)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "1966-04-04",
            data.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueDate?.value.toString()
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/21112-8",
            data.item?.get(1)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("1.1.3", data.item?.get(1)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Date of Birth", data.item?.get(1)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54132-6",
            data.item?.get(1)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("1.1.4", data.item?.get(1)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Were you born a twin?", data.item?.get(1)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54128-4",
            data.item?.get(1)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("1.1.5", data.item?.get(1)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals("Were you adopted?", data.item?.get(1)?.item?.get(0)?.item?.get(4)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54135-9",
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("1.1.6", data.item?.get(1)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Are your parents related to each other in any way other than marriage?",
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals(
            "[in_i]",
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.code
        )
        assertEquals(
            "inches",
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.display
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.system
        )
        assertEquals(
            "1.1.7.1.1",
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "Units",
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "1.1.7.1",
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "63".toDouble(),
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/8302-2",
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.definition
        )
        assertEquals("1.1.7", data.item?.get(1)?.item?.get(0)?.item?.get(6)?.linkId)
        assertEquals("Height", data.item?.get(1)?.item?.get(0)?.item?.get(6)?.text)
        assertEquals(
            "lb",
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.code
        )
        assertEquals(
            "pounds",
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.display
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.system
        )
        assertEquals(
            "1.1.8.1.1",
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "Units",
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "1.1.8.1",
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "127".toDouble(),
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/29463-7",
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.definition
        )
        assertEquals("1.1.8", data.item?.get(1)?.item?.get(0)?.item?.get(7)?.linkId)
        assertEquals("Weight", data.item?.get(1)?.item?.get(0)?.item?.get(7)?.text)
        assertEquals(
            "22.5".toDouble(),
            data.item?.get(1)?.item?.get(0)?.item?.get(8)?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/39156-5",
            data.item?.get(1)?.item?.get(0)?.item?.get(8)?.definition
        )
        assertEquals("1.1.9", data.item?.get(1)?.item?.get(0)?.item?.get(8)?.linkId)
        assertEquals(
            "Body mass index (BMI) [Ratio]",
            data.item?.get(1)?.item?.get(0)?.item?.get(8)?.text
        )
        assertEquals(
            "LA4457-3",
            data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "White",
            data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54134-2",
            data.item?.get(1)?.item?.get(0)?.item?.get(9)?.definition
        )
        assertEquals("1.1.10", data.item?.get(1)?.item?.get(0)?.item?.get(9)?.linkId)
        assertEquals("Race", data.item?.get(1)?.item?.get(0)?.item?.get(9)?.text)
        assertEquals("1.1", data.item?.get(1)?.item?.get(0)?.linkId)
        assertEquals("1", data.item?.get(1)?.linkId)
        assertEquals("Your health information", data.item?.get(1)?.text)
        assertEquals("http://loinc.org/fhir/DataElement/54114-4", data.item?.get(2)?.definition)
        assertEquals(
            "LA10405-1",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Daughter",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Susan",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA3-6",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Female",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "17".toDouble(),
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54141-7",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.2.2",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Age",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "2.1.1.4.2",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA33-6",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Yes",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals("2.1", data.item?.get(2)?.item?.get(0)?.linkId)
        assertEquals(
            "LA10415-0",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Brother",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Brian",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA2-8",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Male",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "32".toDouble(),
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54141-7",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.2.2",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Age",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "2.1.1.4.2",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA33-6",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Yes",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(1)?.item?.get(0)?.linkId)
        assertEquals(
            "LA10550-4",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "-- Other Cancer",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals("2.1.2.1", data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.linkId)
        assertEquals(
            "Disease or Condition",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.text
        )
        assertEquals(
            "LA10397-0",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "30-39",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals("2.1.2.2", data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.linkId)
        assertEquals(
            "Age at Diagnosis",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.text
        )
        assertEquals("2.1.2", data.item?.get(2)?.item?.get(1)?.item?.get(1)?.linkId)
        assertEquals(
            "This family member's history of disease",
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.text
        )
        assertEquals("2.1", data.item?.get(2)?.item?.get(1)?.linkId)
        assertEquals(
            "LA10418-4",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Sister",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Janet",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA3-6",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Female",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "36".toDouble(),
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54141-7",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.2.2",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Age",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "2.1.1.4.2",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA33-6",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Yes",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(2)?.item?.get(0)?.linkId)
        assertEquals(
            "LA10536-3",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "-- Breast Cancer",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals("2.1.2.1", data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.linkId)
        assertEquals(
            "Disease or Condition",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.text
        )
        assertEquals(
            "LA10397-0",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "30-39",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals("2.1.2.2", data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.linkId)
        assertEquals(
            "Age at Diagnosis",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.text
        )
        assertEquals("2.1.2", data.item?.get(2)?.item?.get(2)?.item?.get(1)?.linkId)
        assertEquals(
            "This family member's history of disease",
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.text
        )
        assertEquals("2.1", data.item?.get(2)?.item?.get(2)?.linkId)
        assertEquals(
            "LA10419-2",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Nephew",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Ian",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA2-8",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Male",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "16".toDouble(),
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54141-7",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.2.2",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Age",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "2.1.1.4.2",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA33-6",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Yes",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(3)?.item?.get(0)?.linkId)
        assertEquals("2.1", data.item?.get(2)?.item?.get(3)?.linkId)
        assertEquals(
            "LA10420-0",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Niece",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Helen",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA3-6",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Female",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "15".toDouble(),
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54141-7",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.2.2",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Age",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "2.1.1.4.2",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA33-6",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Yes",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(4)?.item?.get(0)?.linkId)
        assertEquals("2.1", data.item?.get(2)?.item?.get(4)?.linkId)
        assertEquals(
            "LA10416-8",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Father",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Donald",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA2-8",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Male",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "52".toDouble(),
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54141-7",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.2.2",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Age",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "2.1.1.4.2",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA33-6",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Yes",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(5)?.item?.get(0)?.linkId)
        assertEquals("2.1", data.item?.get(2)?.item?.get(5)?.linkId)
        assertEquals(
            "LA10425-9",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Paternal Uncle",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Eric",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA2-8",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Male",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "56".toDouble(),
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54141-7",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.2.2",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Age",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "2.1.1.4.2",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA33-6",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Yes",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(6)?.item?.get(0)?.linkId)
        assertEquals("2.1", data.item?.get(2)?.item?.get(6)?.linkId)
        assertEquals(
            "LA10421-8",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Paternal Aunt",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Fiona",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA3-6",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Female",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "57".toDouble(),
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54141-7",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.2.2",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Age",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "2.1.1.4.2",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA33-6",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Yes",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(7)?.item?.get(0)?.linkId)
        assertEquals(
            "LA10543-9",
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "-- Skin Cancer",
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals("2.1.2.1", data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.linkId)
        assertEquals(
            "Disease or Condition",
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.text
        )
        assertEquals("2.1.2", data.item?.get(2)?.item?.get(7)?.item?.get(1)?.linkId)
        assertEquals(
            "This family member's history of disease",
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.text
        )
        assertEquals("2.1", data.item?.get(2)?.item?.get(7)?.linkId)
        assertEquals(
            "LA10423-4",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Paternal Grandfather",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Bob",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA2-8",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Male",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "LA10537-1",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "-- Colon Cancer",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54112-8",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.1.1",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Cause of Death",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "LA10400-2",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "OVER 60",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54113-6",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.definition
        )
        assertEquals(
            "2.1.1.4.1.2",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.linkId
        )
        assertEquals(
            "Age at Death",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.text
        )
        assertEquals(
            "2.1.1.4.1",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(8)?.item?.get(0)?.linkId)
        assertEquals(
            "LA10537-1",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "-- Colon Cancer",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals("2.1.2.1", data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.linkId)
        assertEquals(
            "Disease or Condition",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.text
        )
        assertEquals(
            "LA10400-2",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "OVER 60",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals("2.1.2.2", data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.linkId)
        assertEquals(
            "Age at Diagnosis",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.text
        )
        assertEquals("2.1.2", data.item?.get(2)?.item?.get(8)?.item?.get(1)?.linkId)
        assertEquals(
            "This family member's history of disease",
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.text
        )
        assertEquals("2.1", data.item?.get(2)?.item?.get(8)?.linkId)
        assertEquals(
            "LA10424-2",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Paternal Grandmother",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54136-7",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.definition
        )
        assertEquals("2.1.1.1", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "Relationship to you",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "Claire",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54138-3",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.definition
        )
        assertEquals("2.1.1.2", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Name", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals(
            "LA3-6",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "Female",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54123-5",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.definition
        )
        assertEquals("2.1.1.3", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.linkId)
        assertEquals("Gender", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.text)
        assertEquals(
            "Lou Gehrigs",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString
        )
        assertEquals(
            "2.1.1.4.1.1.1",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "Please specify",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "LA10589-2",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "-- Other/Unexpected",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54112-8",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.definition
        )
        assertEquals(
            "2.1.1.4.1.1",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId
        )
        assertEquals(
            "Cause of Death",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text
        )
        assertEquals(
            "LA10400-2",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "OVER 60",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54113-6",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.definition
        )
        assertEquals(
            "2.1.1.4.1.2",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.linkId
        )
        assertEquals(
            "Age at Death",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.text
        )
        assertEquals(
            "2.1.1.4.1",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54139-1",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.definition
        )
        assertEquals("2.1.1.4", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.linkId)
        assertEquals("Living?", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.text)
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54121-9",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.definition
        )
        assertEquals("2.1.1.5", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.linkId)
        assertEquals(
            "Was this person born a twin?",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.text
        )
        assertEquals(
            "LA32-8",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "No",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
        )
        assertEquals(
            "http://loinc.org/fhir/DataElement/54122-7",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.definition
        )
        assertEquals("2.1.1.6", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.linkId)
        assertEquals(
            "Was this person adopted?",
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.text
        )
        assertEquals("2.1.1", data.item?.get(2)?.item?.get(9)?.item?.get(0)?.linkId)
        assertEquals("2.1", data.item?.get(2)?.item?.get(9)?.linkId)
        assertEquals("2", data.item?.get(2)?.linkId)
        assertEquals("Patient/pat1", data.item?.get(2)?.subject?.reference)
        assertEquals("Family member health information", data.item?.get(2)?.text)
        assertEquals("Questionnaire/ussg-fht", data.questionnaire?.reference)
        assertEquals(QuestionnaireResponseStatus.IN_PROGRESS, data.status)
        assertEquals("http://hl7.org/fhir/Patient/proband", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testQuestionnaireResponse3() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaireresponse-example-f201-lifelines.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then

        assertEquals("Practitioner/f201", data.author?.reference)
        assertEquals("2013-06-18T00:00:00+01:00", data.authored?.value.toString())
        assertEquals("f201", data.id)
        assertEquals(
            "I am allergic to house dust",
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString
        )
        assertEquals("1.1", data.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals("Do you have allergies?", data.item?.get(0)?.item?.get(0)?.text)
        assertEquals("1", data.item?.get(0)?.linkId)
        assertEquals("Male", data.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueString)
        assertEquals("2.1", data.item?.get(1)?.item?.get(0)?.linkId)
        assertEquals("What is your gender?", data.item?.get(1)?.item?.get(0)?.text)
        assertEquals(
            "1960-03-13",
            data.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueDate?.value.toString()
        )
        assertEquals("2.2", data.item?.get(1)?.item?.get(1)?.linkId)
        assertEquals("What is your date of birth?", data.item?.get(1)?.item?.get(1)?.text)
        assertEquals(
            "The Netherlands",
            data.item?.get(1)?.item?.get(2)?.answer?.get(0)?.valueString
        )
        assertEquals("2.3", data.item?.get(1)?.item?.get(2)?.linkId)
        assertEquals("What is your country of birth?", data.item?.get(1)?.item?.get(2)?.text)
        assertEquals("married", data.item?.get(1)?.item?.get(3)?.answer?.get(0)?.valueString)
        assertEquals("2.4", data.item?.get(1)?.item?.get(3)?.linkId)
        assertEquals("What is your marital status?", data.item?.get(1)?.item?.get(3)?.text)
        assertEquals("2", data.item?.get(1)?.linkId)
        assertEquals("General questions", data.item?.get(1)?.text)
        assertEquals("No", data.item?.get(2)?.item?.get(0)?.answer?.get(0)?.valueString)
        assertEquals("3.1", data.item?.get(2)?.item?.get(0)?.linkId)
        assertEquals("Do you smoke?", data.item?.get(2)?.item?.get(0)?.text)
        assertEquals(
            "No, but I used to drink",
            data.item?.get(2)?.item?.get(1)?.answer?.get(0)?.valueString
        )
        assertEquals("3.2", data.item?.get(2)?.item?.get(1)?.linkId)
        assertEquals("Do you drink alchohol?", data.item?.get(2)?.item?.get(1)?.text)
        assertEquals("3", data.item?.get(2)?.linkId)
        assertEquals("Intoxications", data.item?.get(2)?.text)
        assertEquals("Practitioner/f201", data.source?.reference)
        assertEquals(QuestionnaireResponseStatus.COMPLETED, data.status)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testQuestionnaireResponse4() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaireresponse-example-bluebook.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then

        assertEquals("http://hl7.org/fhir/Practitioner/example", data.author?.reference)
        assertEquals("2013-02-19T14:15:00+10:00", data.authored?.value.toString())
        assertEquals("bb", data.id)
        assertEquals(
            "Cathy Jones",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString
        )
        assertEquals("nameOfChild", data.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals("Name of child", data.item?.get(0)?.item?.get(0)?.item?.get(0)?.text)
        assertEquals(
            "f",
            data.item?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals("sex", data.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Sex", data.item?.get(0)?.item?.get(0)?.item?.get(1)?.text)
        assertEquals("group", data.item?.get(0)?.item?.get(0)?.linkId)
        assertEquals(
            "3.25".toDouble(),
            data.item?.get(0)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals("birthWeight", data.item?.get(0)?.item?.get(1)?.item?.get(0)?.linkId)
        assertEquals("Birth weight (kg)", data.item?.get(0)?.item?.get(1)?.item?.get(0)?.text)
        assertEquals(
            "44.3".toDouble(),
            data.item?.get(0)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueDecimal?.value
        )
        assertEquals("birthLength", data.item?.get(0)?.item?.get(1)?.item?.get(1)?.linkId)
        assertEquals("Birth length (cm)", data.item?.get(0)?.item?.get(1)?.item?.get(1)?.text)
        assertEquals(
            "1972-11-30",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueDate?.value.toString()
        )
        assertEquals(
            "vitaminKDose1",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "1st dose",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "1972-12-11",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(
                0
            )?.valueDate?.value.toString()
        )
        assertEquals(
            "vitaminKDose2",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
        )
        assertEquals(
            "2nd dose",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.text
        )
        assertEquals(
            "vitaminKgivenDoses",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "INJECTION",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
        )
        assertEquals("vitaminKgiven", data.item?.get(0)?.item?.get(1)?.item?.get(2)?.linkId)
        assertEquals("Vitamin K given", data.item?.get(0)?.item?.get(1)?.item?.get(2)?.text)
        assertEquals(
            "1972-12-04",
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueDate?.value.toString()
        )
        assertEquals(
            "hepBgivenDate",
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "Date given",
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.valueBoolean?.value
        )
        assertEquals("hepBgiven", data.item?.get(0)?.item?.get(1)?.item?.get(3)?.linkId)
        assertEquals("Hep B given y / n", data.item?.get(0)?.item?.get(1)?.item?.get(3)?.text)
        assertEquals(
            "Already able to speak Chinese",
            data.item?.get(0)?.item?.get(1)?.item?.get(4)?.answer?.get(0)?.valueString
        )
        assertEquals("abnormalitiesAtBirth", data.item?.get(0)?.item?.get(1)?.item?.get(4)?.linkId)
        assertEquals(
            "Abnormalities noted at birth",
            data.item?.get(0)?.item?.get(1)?.item?.get(4)?.text
        )
        assertEquals("neonatalInformation", data.item?.get(0)?.item?.get(1)?.linkId)
        assertEquals("Neonatal Information", data.item?.get(0)?.item?.get(1)?.text)
        assertEquals("birthDetails", data.item?.get(0)?.linkId)
        assertEquals(
            "Birth details - To be completed by health professional",
            data.item?.get(0)?.text
        )
        assertEquals(QuestionnaireResponseStatus.COMPLETED, data.status)
        assertEquals("http://hl7.org/fhir/Patient/1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testQuestionnaireResponse5() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaireresponse-example-gcs.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then

        assertEquals("2014-12-11T04:44:16Z", data.authored?.value.toString())
        assertEquals("gcs", data.id)
        assertEquals("LA6560-2", data.item?.get(0)?.answer?.get(0)?.valueCoding?.code)
        assertEquals("Confused", data.item?.get(0)?.answer?.get(0)?.valueCoding?.display)
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/iso21090-CO-value",
            data.item?.get(0)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url
        )
        assertEquals(
            "4".toDouble(),
            data.item?.get(0)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal?.value
        )
        assertEquals("http://loinc.org", data.item?.get(0)?.answer?.get(0)?.valueCoding?.system)
        assertEquals("1.1", data.item?.get(0)?.linkId)
        assertEquals("LA6566-9", data.item?.get(1)?.answer?.get(0)?.valueCoding?.code)
        assertEquals("Localizing pain", data.item?.get(1)?.answer?.get(0)?.valueCoding?.display)
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/iso21090-CO-value",
            data.item?.get(1)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url
        )
        assertEquals(
            "5".toDouble(),
            data.item?.get(1)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal?.value
        )
        assertEquals("http://loinc.org", data.item?.get(1)?.answer?.get(0)?.valueCoding?.system)
        assertEquals("1.2", data.item?.get(1)?.linkId)
        assertEquals("LA6556-0", data.item?.get(2)?.answer?.get(0)?.valueCoding?.code)
        assertEquals(
            "Eyes open spontaneously",
            data.item?.get(2)?.answer?.get(0)?.valueCoding?.display
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/iso21090-CO-value",
            data.item?.get(2)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url
        )
        assertEquals(
            "4".toDouble(),
            data.item?.get(2)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal?.value
        )
        assertEquals("http://loinc.org", data.item?.get(2)?.answer?.get(0)?.valueCoding?.system)
        assertEquals("1.3", data.item?.get(2)?.linkId)
        assertEquals("Questionnaire/gcs", data.questionnaire?.reference)
        assertEquals("Practitioner/f007", data.source?.reference)
        assertEquals(QuestionnaireResponseStatus.COMPLETED, data.status)
        assertEquals("Peter James Chalmers", data.subject?.display)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
