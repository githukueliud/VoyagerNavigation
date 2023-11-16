package com.example.voyagernavigation.navigation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow


object HomeScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Text(
            text = "Hello this is a list of Android mentees in the Mentorlst mentorship program first cohort for the period between November 2023 to January 2024. Want to learn more about them? Click on the card to learn more")

        Text(text = "To have an idea of who our mentees are, kindly click on their card to learn more about them")

        Button(onClick = { navigator.push(MenteeList) }) {
            Text(text = "Click to view the full list")
        }
    }


}


object MenteeList: Screen {
    @Composable
    override fun Content() {
        TODO("Not yet implemented")
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MenteeListScreen(
        mentee: Mentee,
        navigateToMenteeDetailsScreen: (name: String) -> Unit
    ) {
        val mentees: List<Mentee> = listOf(
            Mentee(
                name = "Eliud Githuku",
                gender = "Male",
                githubProfile = "github.com/githukueliud",
                stack = "Native Android Development"
            ),
            Mentee(
                name = "Eliud Githuku",
                gender = "Male",
                githubProfile = "github.com/githukueliud",
                stack = "Native Android Development"
            ),
            Mentee(
                name = "Eliud Githuku",
                gender = "Male",
                githubProfile = "github.com/githukueliud",
                stack = "Native Android Development"
            ),
            Mentee(
                name = "Eliud Githuku",
                gender = "Male",
                githubProfile = "github.com/githukueliud",
                stack = "Native Android Development"
            ),
            Mentee(
                name = "Eliud Githuku",
                gender = "Male",
                githubProfile = "github.com/githukueliud",
                stack = "Native Android Development"
            )
        )

        LazyColumn {
            items(mentees) {
                Card(
                    onClick = { navigateToMenteeDetailsScreen(mentee.name) }
                ) {
                    Text(text = "Mentee name is: ${mentee.name}")
                    Text(text = "Mentee stack is: ${mentee.stack}")
                }
            }
        }

    }
}

