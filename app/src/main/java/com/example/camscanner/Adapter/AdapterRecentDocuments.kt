package com.example.camscanner.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.camscanner.R

class AdapterRecentDocuments (val iamgeview:List<Int>):RecyclerView.Adapter<AdapterRecentDocuments.MyViewHolder>(){
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView:ImageView = itemView.findViewById(R.id.documentimage)
        val textViewTag:TextView=itemView.findViewById(R.id.TAGMAIN)
        val textViewdate:TextView=itemView.findViewById(R.id.DATEd)
        val textViewtime:TextView=itemView.findViewById(R.id.Timed)
        val sharebutton:ImageButton=itemView.findViewById(R.id.shared)
        val optionbutton:ImageButton=itemView.findViewById(R.id.optiond)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.viewholderrecentdocuments, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return iamgeview.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val imageResourceId = iamgeview[position]
        holder.imageView.setImageResource(imageResourceId)
        holder.textViewTag.text = "Tag Text"
        holder.textViewdate.text = "Date Text"
        holder.textViewtime.text = "Time Text"
        holder.sharebutton.setOnClickListener {
        }
        holder.optionbutton.setOnClickListener {
        }
    }
}