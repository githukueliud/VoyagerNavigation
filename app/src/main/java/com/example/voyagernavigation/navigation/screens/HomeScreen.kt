package com.example.voyagernavigation.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow


object HomeScreen: Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Hello this is a list of Android mentees in the Mentorlst mentorship program first cohort for the period between November 2023 to January 2024. Want to learn more about them? Click on the card to learn more"
            )

            Text(text = "To have an idea of who our mentees are, kindly click on their card to learn more about them")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ){
                Button(
                    onClick = { navigator.push(MenteeList) },
                    modifier = Modifier
                        .height(40.dp)
                        .width(180.dp),
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text(text = "Mentees")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    onClick = { navigator.push(MentorList) },
                    modifier = Modifier
                        .height(40.dp)
                        .width(180.dp),
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text(text = "Mentors")
                }
            }
        }
    }


}


object MentorList: Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Here is a list of our Android Mentors")
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.LightGray,
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .height(120.dp)
                    .width(300.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Name: Rachel",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Start
                    )
                    Text(
                        text = "Github: TBD",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Start
                    )
                    Text(
                        text = "Gender: Female",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Start
                    )
                    Text(
                        text = "Stack: Native Android",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }

}


object MenteeList: Screen {
    val allMentees = Data.mentees
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Here is a list of the Android team mentees")
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn{
                items(allMentees) {mentee ->
                    Card {
                        Text(text = "Name: ${mentee.name}")
                        Text(text = "Gender: ${mentee.gender}")
                        Text(text = "Github: ${mentee.githubProfile}")
                        Text(text = "Stack: ${mentee.stack}")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }

            }
        }
    }


//    @OptIn(ExperimentalMaterial3Api::class)
//    @Composable
//    fun MenteeListScreen(
//        mentee: Mentee,
//        navigateToMenteeDetailsScreen: (name: String) -> Unit
//    ) {
//        val mentees: List<Mentee> = listOf(
//            Mentee(
//                name = "Eliud Githuku",
//                gender = "Male",
//                githubProfile = "github.com/githukueliud",
//                stack = "Native Android Development"
//            ),
//            Mentee(
//                name = "Eliud Githuku",
//                gender = "Male",
//                githubProfile = "github.com/githukueliud",
//                stack = "Native Android Development"
//            ),
//            Mentee(
//                name = "Eliud Githuku",
//                gender = "Male",
//                githubProfile = "github.com/githukueliud",
//                stack = "Native Android Development"
//            ),
//            Mentee(
//                name = "Eliud Githuku",
//                gender = "Male",
//                githubProfile = "github.com/githukueliud",
//                stack = "Native Android Development"
//            ),
//            Mentee(
//                name = "Eliud Githuku",
//                gender = "Male",
//                githubProfile = "github.com/githukueliud",
//                stack = "Native Android Development"
//            )
//        )
//
//        LazyColumn {
//            items(mentees) {
//                Card(
//                    onClick = { navigateToMenteeDetailsScreen(mentee.name) }
//                ) {
//                    Text(text = "Mentee name is: ${mentee.name}")
//                    Text(text = "Mentee stack is: ${mentee.stack}")
//                }
//            }
//        }
//
//    }
}

