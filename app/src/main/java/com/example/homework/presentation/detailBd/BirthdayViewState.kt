package com.example.homework.presentation.detailBd


data class BirthdayViewState(
    val date: String = "",
    val user: String = "",
    val description: String = "",
    val errorText: String = "",
    val exit: Boolean = false
)