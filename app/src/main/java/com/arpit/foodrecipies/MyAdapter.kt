package com.arpit.foodrecipies

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_view.view.*

class ViewAdapter(private val recipes: List<ResultsItem>): RecyclerView.Adapter<ViewAdapter.ViewHolder>() {
    class ViewHolder(itemView :View): RecyclerView.ViewHolder(itemView) {
        var ivThumbnail :ImageView = itemView.ivThumbnail
        var tvIngredient :TextView = itemView.tvIngredients
        var tvRecipeLink :TextView = itemView.tvRecipeLink
        var tvTitle :TextView = itemView.tvTitle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent , false)
        return  ViewHolder(view)
    }

    override fun getItemCount() = recipes.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipes[position]

        Picasso.get().load(recipe.href).into(holder.ivThumbnail)
        holder.tvIngredient.text = recipe.ingredients
        holder.tvRecipeLink.text = recipe.href
        holder.tvTitle.text = recipe.title
    }
}