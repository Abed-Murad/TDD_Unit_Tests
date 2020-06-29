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

        Assert.assertEquals("Answer should be 'INCORRECT'", "INCORRECT", question.answeredOption)
    }
}