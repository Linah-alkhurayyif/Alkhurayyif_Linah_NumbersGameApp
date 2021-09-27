package com.example.alkhurayyif_linah_numbersgameapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view.view.*

class RecyclerViewAdapter(private val numbers:ArrayList<String>):RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
     return ItemViewHolder(
         LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false)
     )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val number = numbers[position]
        holder.itemView.apply{
            TaskRecyclerView.text = number.toString()
        }
    }

    override fun getItemCount() = numbers.size

}