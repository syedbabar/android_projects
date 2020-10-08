package com.example.boxesnew.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.databindingexample.Model.Listing
import com.example.databindingexample.R


public class HomeListingAdapter(
    val context: Context,
    private val flowerHomeArrayList: ArrayList<Listing>
) : RecyclerView.Adapter<HomeListingAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.list_flower_home, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context)
            .load(flowerHomeArrayList[position].image)
            .placeholder(R.drawable.boxes_logo)
            .fitCenter()
            .into(holder.ivImage)
//
        holder.tvName.text = flowerHomeArrayList[position].listing_name
        holder.tvDescription.text = flowerHomeArrayList[position].listing_caption
    }

    override fun getItemCount(): Int {
        return flowerHomeArrayList.size
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal val ivImage: ImageView = itemView.findViewById(R.id.iv_flower_home_icon)
        internal val tvName: TextView = itemView.findViewById(R.id.tv_flower_home_name)
        internal val tvDescription: TextView = itemView.findViewById(R.id.tv_flower_home_category)

    }
}