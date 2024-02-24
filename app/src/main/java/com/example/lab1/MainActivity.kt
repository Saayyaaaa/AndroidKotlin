package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
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




        binding.editText.addTextChangedListener{
            val searchQuery = it.toString().lowercase()

            if (searchQuery.isEmpty()){
                adapter?.setData(FoodDataSource.foodList)
            }else{
                val list = FoodDataSource.foodList.filter {
                    it.title.lowercase().contains(searchQuery)
                }
                adapter?.setData(ArrayList(list))
            }
        }
    }




    private fun handleFoodClick(food: Food){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("pizza", food)
        startActivity(intent)
    }
}