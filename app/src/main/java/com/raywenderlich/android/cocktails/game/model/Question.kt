package com.raywenderlich.android.cocktails.game.model

class Question(val correctOption: String, val incorrectOption: String) {
    fun answer(option: String):Boolean {
        answeredOption = option
        return correctOption == option
    }

    var answeredOption: String? = null
        private set
}