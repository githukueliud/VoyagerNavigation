package com.example.voyagernavigation


import com.example.voyagernavigation.presentation.screens.MentorlstViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import kotlin.test.assertFailsWith
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
    fun testPrivateMethod() {
        //set the number of members
        viewModel.numberOfMentees = 2
        viewModel.numberOfMentors = 2

        //make the private method accessible through reflection
        val method = viewModel::class.java.getDeclaredMethod("setTotalNumberOfPeople")
        method.isAccessible = true
        val result = method.invoke(viewModel)

        //perform the test
        assertEquals(4, result)
    }


    @Test
    fun testMethodWithException() {
        assertFailsWith<Exception> {
            viewModel.connectToInternet()
        }
    }


}