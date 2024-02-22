package com.example.lab1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.databinding.ItemFoodBinding
import com.example.lab1.model.Food

class FoodAdapter (
    private val onFoodClick: (Food) -> Unit
) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private val foodList: ArrayList<Food> = ArrayList()

    fun setData(foods: ArrayList<Food>){
        foodList.clear()
        foodList.addAll(foods)

        /**
         * Метод для обновления списка элементов
         */
        notifyDataSetChanged()
    }

    /**
     * Метод который будет создавать view для каждого обьекта
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemFoodBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    /**
     * Метод для определения количества элементов списка
     */
    override fun getItemCount() = foodList.size

    /**
     * для вызова метода Viewholder
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(foodList[position])
    }

    inner class ViewHolder(
        private val binding: ItemFoodBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(food: Food) {
            with(binding){
                foodImage.setImageResource(food.imageRes)
                foodTitle.text = food.title
                foodDescription.text = food.description
                foodPrice.text = "${food.price}₸"

                root.setOnClickListener{
                    onFoodClick(food)
                }
            }
        }
    }


}