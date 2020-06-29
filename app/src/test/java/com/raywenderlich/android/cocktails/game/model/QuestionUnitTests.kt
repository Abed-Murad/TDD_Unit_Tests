package com.raywenderlich.android.cocktails.game.model

import org.junit.*

class QuestionUnitTests {
    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption() {

        val question = Question("CORRECT", "INCORRECT")

        Assert.assertNull(question.answeredOption)
    }

    @Test
    fun whenAnswering_shouldHaveAnsweredOption() {

        val question = Question("CORRECT", "INCORRECT")

        question.answer("INCORRECT")

        Assert.assertEquals("INCORRECT", question.answeredOption)
    }

    @Test
    fun whenAnswering_withCorrectOption_shouldReturnTrue() {

        val question = Question("CORRECT", "INCORRECT")

        val result = question.answer("CORRECT")

        Assert.assertTrue("Result Should Be 'true'", result)
    }

    @Test
    fun whenAnswering_withIncorrectOption_shouldReturnFalse() {
        val question = Question("CORRECT", "INCORRECT")

        val result = question.answer("INCORRECT")

        Assert.assertFalse("Result should be 'false'", result)
    }
}