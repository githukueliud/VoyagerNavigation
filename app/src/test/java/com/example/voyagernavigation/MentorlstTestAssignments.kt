package com.example.voyagernavigation


import com.example.voyagernavigation.presentation.screens.MentorlstViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MentorlstTestAssignments {


    private lateinit var viewModel: MentorlstViewModel

    @Before
    fun setup() {
        // Initialize the ViewModel before each test
        viewModel = MentorlstViewModel()
    }

    //to test set number of mentors public method
    @Test
    fun testSetNumberOfMentors() {
        viewModel.setNumberOfMentors()

        assertEquals(1, viewModel.numberOfMentors)
    }


    @Test
    fun testSetNumberOfMentees() {
        viewModel.setNumberOfMentees()

        assertEquals(1, viewModel.numberOfMentees)
    }


    @Test
    fun testPrivateMethod() {}


    @Test
    fun testMethodWithException() {}


}