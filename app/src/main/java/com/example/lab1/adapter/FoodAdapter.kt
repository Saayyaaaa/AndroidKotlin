package com.example.lab1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.databinding.ItemFoodBinding
import com.example.lab1.databinding.LargePizzasBinding
import com.example.lab1.model.Food

class FoodAdapter(
    private val onFoodClick: (Food) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_LARGE_PIZZA -> {
                ViewHolder(
                    ItemFoodBinding.inflate(
                        LayoutInflater.from(parent.context), parent, false
                    )
                )
            }
            VIEW_TYPE_ITEM_FOOD -> {
                ViewHolder2(
                    LargePizzasBinding.inflate(
                        LayoutInflater.from(parent.context), parent, false
                    )
                )
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }



    /**
     * Метод для определения количества элементов списка
     */
    override fun getItemCount() = foodList.size



    /**
     * для вызова метода Viewholder
     */

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolder -> holder.bind(foodList[position])
            is ViewHolder2 -> holder.bind(foodList[position])
        }
    }

    companion object {
        private const val VIEW_TYPE_ITEM_FOOD = 1
        private const val VIEW_TYPE_LARGE_PIZZA = 2
    }

    override fun getItemViewType(position: Int): Int {
        val food = foodList[position]
        return if (!food.boolVal) VIEW_TYPE_ITEM_FOOD else VIEW_TYPE_LARGE_PIZZA
    }


        /**
         * связать представление с моделью
         * данных getItemCount : который вернет общее
         * количество представлений, которые должны отобразить
         */

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


    inner class ViewHolder2(
        private val binding: LargePizzasBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(food: Food) {
            with(binding){
                foodImage2.setImageResource(food.imageRes)
                foodTitle2.text = food.title
                foodDescription2.text = food.description
                foodPrice2.text = "${food.price}₸"

                root.setOnClickListener{
                    onFoodClick(food)
                }
            }
        }
    }
}