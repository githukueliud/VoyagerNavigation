package com.example.voyagernavigation.navigation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen


//object HomeScreen : Screen {
//    val mentees: List<Mentee> = listOf(
//        Mentee(
//            name = "Eliud Githuku",
//            gender = "Male",
//            githubProfile = "github.com/githukueliud",
//            stack = "Native Android Development"
//        ),
//        Mentee(
//            name = "Eliud Githuku",
//            gender = "Male",
//            githubProfile = "github.com/githukueliud",
//            stack = "Native Android Development"
//        ),
//        Mentee(
//            name = "Eliud Githuku",
//            gender = "Male",
//            githubProfile = "github.com/githukueliud",
//            stack = "Native Android Development"
//        ),
//        Mentee(
//            name = "Eliud Githuku",
//            gender = "Male",
//            githubProfile = "github.com/githukueliud",
//            stack = "Native Android Development"
//        ),
//        Mentee(
//            name = "Eliud Githuku",
//            gender = "Male",
//            githubProfile = "github.com/githukueliud",
//            stack = "Native Android Development"
//        )
//    )
//
//    @Composable
//    override fun Content() {
//        Text(
//            text = "Hello this is a list of Android mentees in the Mentorlst mentorship program first cohort for the period between November 2023 to January 2024. Want to learn more about them? Click on the card to learn more")
//        Card {
//            Text(text = "Mentee name:")
//            Text(text = "Stack: ")
//            Text(text = "Github Profile: ")
//        }
//    }
//
//}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
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

    LazyColumn{
        items(mentees) {
            Card(
                onClick = {navigateToMenteeDetailsScreen(mentee.name)}
            ) {
                Text(text = "Mentee name is: ${mentee.name}")
                Text(text = "Mentee stack is: ${mentee.stack}")
            }
        }
    }

}

