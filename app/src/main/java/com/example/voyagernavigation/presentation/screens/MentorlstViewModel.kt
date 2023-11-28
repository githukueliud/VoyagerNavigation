package com.example.voyagernavigation.presentation.screens

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
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

    private fun setTotalNumberOfPeople(): Int {
        return numberOfMentees + numberOfMentors
    }


    fun connectToInternet() {

        try {
            //connect to internet
            //tasks that require internet
            //example code that will fail
            throw IllegalStateException("Simulated failure")
        } catch (e: Exception) {
            Log.e("Internet permission", "internet permission not granted $e")
        }
    }


}