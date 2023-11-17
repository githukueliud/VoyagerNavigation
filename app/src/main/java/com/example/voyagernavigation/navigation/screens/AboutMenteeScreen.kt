package com.example.voyagernavigation.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen


data class AboutMenteeScreen(val mentee: Mentee) : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Mentee name is: ${mentee.name}")
            Text(text = "Mentee github profile is: ${mentee.githubProfile}")
            Text(text = "Mentee gender is: ${mentee.gender}")
            Text(text = "Mentee stack is: ${mentee.stack}")
        }
    }


}

