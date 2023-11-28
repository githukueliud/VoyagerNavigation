package com.example.voyagernavigation.presentation.screens

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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){

            Text(
                text = "Mentorlst is a mentorship program aimed at helping newbies get the bridge necessary for their career growth",
                fontSize = 22.sp
            )
            Text(text = "There are different tracks available for mentorship within the organization. In this app, we'll only focus on the android track",
                fontSize = 18.sp
            )
            Text(
                text = "To have an idea of who our mentees are, kindly click on their card to learn more about them",
                fontSize = 18.sp
            )

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
    private val allMentors = Mentors.mentors
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Here is a list of our Android Mentors")
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn{
                items(allMentors) { mentor ->
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color.LightGray,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier
                            .height(80.dp)
                            .width(300.dp),
                        onClick = { navigator.push(AboutMentorScreen(mentor)) }
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Name: ${mentor.name}",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Start
                            )
                            Text(
                                text = "Stack: ${mentor.stack}",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Start
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }
    }

}


object MenteeList: Screen {
    private val allMentees = Data.mentees
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Here is a list of the Android team mentees")
            Text(text = "To learn more about them, click on their cards")
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn{
                items(allMentees) { mentee ->
                    Card(
                        modifier = Modifier
                            .height(70.dp)
                            .width(300.dp),
                        onClick = {
                            navigator.push(AboutMenteeScreen(mentee))
                        }
                    ) {
                        Column(
                            modifier = Modifier.padding(5.dp)
                        ){
                            Text(text = "Name: ${mentee.name}")
                            Text(text = "Stack: ${mentee.stack}")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }

            }
        }
    }


}

