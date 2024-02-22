package com.example.lab1.model

import java.util.UUID

data class Food(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String,
    val imageRes: Int,
    val price: String,
    val size: String
)
