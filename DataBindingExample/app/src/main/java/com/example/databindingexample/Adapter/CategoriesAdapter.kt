package com.example.databindingexample.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.databindingexample.Model.Category

import com.example.databindingexample.R

import de.hdodenhof.circleimageview.CircleImageView
import java.util.*

class CategoriesAdapter(
    val context: Context,
    var categories: ArrayList<Category>
    /*var listener: HomeFragment.CategoryClickListener*/
) : RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.horizontal_category_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context)
            .load(categories.get(position).image)
            .placeholder(R.drawable.boxes_logo)
            .fitCenter()
            .into(holder.ivCategory)

        holder.tvCategoryName.text = categories[position].type_name

        /*  holder.llItem.setOnClickListener {
              listener.onItemClick(position, categories[position])
          }*/
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var ivCategory: CircleImageView =
            itemView.findViewById(R.id.iv_horizontal_category)
        internal var tvCategoryName: TextView = itemView.findViewById(R.id.tv_home_category_text)
        internal var llItem: LinearLayout = itemView.findViewById(R.id.ll_item)
    }
}