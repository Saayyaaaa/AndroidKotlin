package com.example.lab1.model

import com.example.lab1.R

object FoodDataSource {
    val foodList = arrayListOf<Food>(
        Food(
            title = "Наруто Пицца",
            description = "Куриные кусочкиб соус терияки",
            imageRes = R.drawable.pizza1,
            price = "1000",
            size = "30см"
        ),
        Food(
            title = "Вау! Кебаб",
            description = "Куриные кусочкиб соус терияки",
            imageRes = R.drawable.pizza2,
            price = "1000",
            size = "30см"
        ),
        Food(
            title = "Пепперони с грибами",
            description = "Куриные кусочкиб соус терияки",
            imageRes = R.drawable.pizza1,
            price = "1000",
            size = "30см"
        ),
        Food(
            title = "Ветчина и огурчики",
            description = "Куриные кусочкиб соус терияки",
            imageRes = R.drawable.pizza4,
            price = "1000",
            size = "30см"
        ),
        Food(
            title = "Миксик",
            description = "Куриные кусочкиб соус терияки",
            imageRes = R.drawable.pizza5,
            price = "1000",
            size = "30см"
        )
    )
}