package com.example.weatherapp

data class DayItem(
    val city: String,
    val date: String,
    val condition: String,
    val imgUrl: String,
    val tempNow: String,
    val tempMin: String,
    val tempMax: String,
    val hours: String
)
