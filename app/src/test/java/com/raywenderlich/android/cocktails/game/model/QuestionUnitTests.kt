package com.raywenderlich.android.cocktails.game.model

import org.junit.*
import java.lang.IllegalArgumentException

class QuestionUnitTests {
    private lateinit var question: Question

    @Before
    fun setup() {
        question = Question("CORRECT", "INCORRECT")
    }

    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption() {
        Assert.assertNull(question.answeredOption)
    }

    @Test
    fun whenAnswering_shouldHaveAnsweredOption() {
        question.answer("INCORRECT")

        Assert.assertEquals("INCORRECT", question.answeredOption)
    }

    @Test
    fun whenAnswering_withCorrectOption_shouldReturnTrue() {
        val result = question.answer("CORRECT")

        Assert.assertTrue("Result Should Be 'true'", result)
    }

    @Test
    fun whenAnswering_withIncorrectOption_shouldReturnFalse() {
        val result = question.answer("INCORRECT")

        Assert.assertFalse("Result should be 'false'", result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun whenAnswering_withInvalidOption_shouldThrowException() {
        question.answer("INVALID")
    }

    @Test
    fun whenCreatingQuestion_shouldReturnOptionsWIthCustomSOrt() {
        val options = question.getOptions { it.reversed() }
        Assert.assertEquals(listOf("INCORRECT", "CORRECT"), options)
    }
}