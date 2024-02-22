package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab1.adapter.FoodAdapter
import com.example.lab1.databinding.ActivityMainBinding
import com.example.lab1.model.Food
import com.example.lab1.model.FoodDataSource

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = FoodAdapter(
            onFoodClick = {
                handleFoodClick(it)
            }
        )

        binding.resyclerView.adapter = adapter

        adapter.setData(FoodDataSource.foodList)
    }

    private fun handleFoodClick(food: Food){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(SecondActivity.KEY_RESULT, food.title)
        startActivity(intent)
    }
}