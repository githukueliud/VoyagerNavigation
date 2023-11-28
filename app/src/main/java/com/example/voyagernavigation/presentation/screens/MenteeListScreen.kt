package com.example.voyagernavigation.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

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