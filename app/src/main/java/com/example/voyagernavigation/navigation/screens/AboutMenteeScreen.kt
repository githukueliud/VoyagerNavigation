package com.example.voyagernavigation.navigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen


//object AboutMenteeScreen : Screen {
//    @Composable
//    override fun Content() {
//        TODO("Not yet implemented")
//    }
//
//}


@Composable
fun AboutMenteeScreen(name: String) {
    Column {
        Text(text = "Thank you for showing interest in our android mentees.")
        Text(text = "Mentee name is: $name")
        Text(text = "Mentee gender is: $name")
        Text(text = "Mentee stack is: $name")
        Text(text = "Mentee github profile is: $name")
    }
}