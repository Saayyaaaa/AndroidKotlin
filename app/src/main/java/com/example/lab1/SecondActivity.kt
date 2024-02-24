package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab1.databinding.ActivitySecondBinding
import com.example.lab1.model.Food

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getSerializableExtra("pizza") as Food


        binding.food2Image.setImageResource(result.imageRes)
        binding.food2Description.text = result.description
        binding.food2Title.text = result.title
        binding.food2Price.text = "В корзину ${result.price}₸"
    }

    fun goBack(view: View){
        finish()
    }
}