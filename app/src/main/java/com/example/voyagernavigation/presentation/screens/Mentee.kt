package com.example.voyagernavigation.presentation.screens

data class Mentee(
    val name: String,
    val gender: String,
    val githubProfile: String,
    val stack: String
)

object Data{
    val mentees = listOf(
        Mentee(
            name = "Eliud Githuku",
            gender = "male",
            githubProfile = "github.com/githukueliud",
            stack = "Android"
        ),
        Mentee(
            name = "Stevie Wonder",
            gender = "male",
            githubProfile = "github.com/githukueliud",
            stack = "Android"
        ),
        Mentee(
            name = "Jake Harper",
            gender = "male",
            githubProfile = "github.com/githukueliud",
            stack = "Android"
        ),
        Mentee(
            name = "Abel Tesfaye",
            gender = "male",
            githubProfile = "github.com/githukueliud",
            stack = "Android"
        ),
        Mentee(
            name = "Nyashinski",
            gender = "male",
            githubProfile = "github.com/githukueliud",
            stack = "Android"
        ),
        Mentee(
            name = "Thomas Shelby",
            gender = "male",
            githubProfile = "github.com/githukueliud",
            stack = "Android"
        )
    )
}


