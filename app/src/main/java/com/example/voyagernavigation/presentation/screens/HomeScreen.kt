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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow


object HomeScreen: Screen {
    val viewModel = MentorlstViewModel()
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

                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Number of mentors is: ${viewModel.numberOfMentors}")
                Text(text = "Number of mentees is: ${viewModel.numberOfMentees}")
                Text(text = "To add a mentor, just click on the button")
                Button(onClick = { viewModel.setNumberOfMentors() }) {
                    Text(text = "Add a mentor")
                }
                Text(text = "To add a mentee, just click on the button")
                Button(onClick = { viewModel.setNumberOfMentees() }) {
                    Text(text = "Add a mentee")
                }
            }

        }
    }


}







