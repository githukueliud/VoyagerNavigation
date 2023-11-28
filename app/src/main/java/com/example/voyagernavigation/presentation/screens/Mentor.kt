package com.example.voyagernavigation.presentation.screens

import androidx.annotation.DrawableRes
import com.example.voyagernavigation.R

data class Mentor(
    val name: String,
    val gender: String,
    val githubProfile: String,
    val stack: String,
    @DrawableRes val mentorImage: Int
)

object Mentors {
    val mentors = listOf(
        Mentor(
            name = "Rachel",
            gender = "Female",
            githubProfile = "TBD",
            stack = "Android",
            mentorImage = R.drawable.mboto_2
        ),
        Mentor(
            name = "Fred",
            gender = "Male",
            githubProfile = "TBD",
            stack = "Backend",
            mentorImage = R.drawable.mboto_2
        ),
        Mentor(
            name = "Eliud",
            gender = "Male",
            githubProfile = "TBD",
            stack = "Android",
            mentorImage = R.drawable.mboto_2
        ),
        Mentor(
            name = "Jake Harper",
            gender = "Male",
            githubProfile = "TBD",
            stack = "Android",
            mentorImage = R.drawable.mboto_2
        ),
        Mentor(
            name = "Chandler Bing",
            gender = "Male",
            githubProfile = "TBD",
            stack = "Android",
            mentorImage = R.drawable.mboto_2
        ),
        Mentor(
            name = "Thomas Shelby",
            gender = "Male",
            githubProfile = "TBD",
            stack = "Android",
            mentorImage = R.drawable.mboto_2
        )
    )
}
