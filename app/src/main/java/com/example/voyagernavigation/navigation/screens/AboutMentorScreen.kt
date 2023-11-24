package com.example.voyagernavigation.navigation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.example.voyagernavigation.R

data class AboutMentorScreen(val mentor: Mentor) : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
        ) {
            Image(
                painter = painterResource(id = mentor.mentorImage),
                contentDescription = null,
                modifier = Modifier.height(300.dp).fillMaxWidth().clip(RoundedCornerShape(6.dp)),
                contentScale = ContentScale.Crop,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp)
            ){
                Text(text = "Mentor's name is: ${mentor.name}")
                Text(text = "Mentor's gender is: ${mentor.gender}")
                Text(text = "Mentor's stack is: ${mentor.stack}")
                Text(text = "Mentor's github handle is: ${mentor.githubProfile}")
            }
        }
    }

}
