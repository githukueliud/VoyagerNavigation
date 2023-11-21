package com.example.voyagernavigation.navigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen

data class AboutMentorScreen(val mentor: Mentor) : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Hello from Mentors")
        }
    }

}
