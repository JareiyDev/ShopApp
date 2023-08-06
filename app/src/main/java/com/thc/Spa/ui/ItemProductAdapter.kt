package com.thc.Spa.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thc.Spa.R

class ItemProductAdapter(private val mList: List<ItemsProductModel>) : RecyclerView.Adapter<ItemProductAdapter.ViewHolder>() {
  
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view 
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
  
        return ViewHolder(view)
    }
  
    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
  
        val ItemsViewModel = mList[position]
  
        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.image)
  
        // sets the text to the textview from our itemHolder class
        holder.tit.text = ItemsViewModel.tit
        holder.dess.text = ItemsViewModel.des
        holder.prices.text = ItemsViewModel.prices
        holder.rate.text = ItemsViewModel.rate
        holder.other.text = ItemsViewModel.other

    }
  
    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }
  
    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image)
        val tit: TextView = itemView.findViewById(R.id.title)
        val dess: TextView = itemView.findViewById(R.id.dess)
        val prices: TextView = itemView.findViewById(R.id.prices)
        val rate: TextView = itemView.findViewById(R.id.rate)
        val other: TextView = itemView.findViewById(R.id.other)
    }
}