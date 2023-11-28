package com.example.voyagernavigation.presentation.screens

import androidx.lifecycle.ViewModel

class MentorlstViewModel: ViewModel() {
    var numberOfMentors = 0
    var numberOfMentees = 0

    fun setNumberOfMentors() {
        numberOfMentors++
    }

    fun setNumberOfMentees() {
        numberOfMentees++
    }

    private fun setTotalNumberOfPeople() {
        numberOfMentees + numberOfMentors
    }
}