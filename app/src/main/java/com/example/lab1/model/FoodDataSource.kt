package com.example.lab1.model

import com.example.lab1.R

object FoodDataSource {
    val foodList = arrayListOf<Food>(
        Food(
            title = "Баварская",
            description = "Острые колбаски чоризо, маринованные огурчики, красный лук, томаты, горчичный соус, моцарелла, фирменный томатный соус",
            imageRes = R.drawable.pizza0,
            price = "2700",
            size = "30см",
            boolVal = false
        ),
        Food(
            title = "Наруто Пицца",
            description = "Куриные кусочки, соус терияки, ананасы, моцарелла, фирменный соус альфредо",
            imageRes = R.drawable.pizza1,
            price = "3900",
            size = "30см",
            boolVal = true
        ),
        Food(
            title = "Вау! Кебаб",
            description = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            imageRes = R.drawable.pizza2,
            price = "2900",
            size = "30см",
            boolVal = true
        ),
        Food(
            title = "Пепперони с грибами",
            description = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            imageRes = R.drawable.pizza1,
            price = "2000",
            size = "30см",
            boolVal = true
        ),
        Food(
            title = "Ветчина и огурчики",
            description = "Соус ранч, моцарелла, ветчина из цыпленка, маринованные огурчики, красный лук",
            imageRes = R.drawable.pizza4,
            price = "2000",
            size = "30см",
            boolVal = false
        ),
        Food(
            title = "Миксик",
            description = "Пицца четвертинками с ветчиной из цыпленка, томатами, брынзой, моцареллой, фирменным соусом альфредо. Набор юного садовода в подарок",
            imageRes = R.drawable.pizza5,
            price = "2200",
            size = "30см",
            boolVal = true
        ),
        Food(
            title = "Пицца Жюльен",
            description = "Цыпленок, шампиньоны, ароматный грибной соус, лук, сухой чеснок, моцарелла, смесь сыров чеддер и пармезан, фирменный соус альфредо",
            imageRes = R.drawable.pizza6,
            price = "2700",
            size = "30см",
            boolVal = true
        ),
        Food(
            title = "Сырная",
            description = "Моцарелла, сыры чеддер и пармезан, соус альфредо",
            imageRes = R.drawable.pizza7,
            price = "1900",
            size = "30см",
            boolVal = true
        ),
        Food(
            title = "Пепперони фреш",
            description = "Пикантная пепперони, мно-о-ого моцареллы, томаты и томатный соус",
            imageRes = R.drawable.pizza8,
            price = "1900",
            size = "30см",
            boolVal = true
        ),
        Food(
            title = "Двойной цыпленок",
            description = "Цыпленок, моцарелла, соус альфредо",
            imageRes = R.drawable.pizza9,
            price = "2100",
            size = "30см",
            boolVal = true
        ),
    )
}