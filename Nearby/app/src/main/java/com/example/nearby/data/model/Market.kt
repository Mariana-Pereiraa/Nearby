package com.example.nearby.data.model

data class Market(
    val id: String,
    val categoryId: String,
    val name: String,
    val description: String,
    val cupons: Int,
    val rules: List<Rule> = emptyList(),
    val latitude: Double,
    val longitude: Double,
    val adress: String,
    val phone: String,
    val cover: String,
)