package com.gift.buzzhub

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class festivalsAdapter(

    var festivalsNames: ArrayList<String>,
    var festivalsDetailsList: ArrayList<String>,
    var imagesFestivals: ArrayList<Int>,
    var context: Context,
) : RecyclerView.Adapter<festivalsAdapter.festivalViewHolder>(){


    class festivalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var cottonFestHeading : TextView = itemView.findViewById(R.id.txtEventName)
        var cottonFestDescription : TextView = itemView.findViewById(R.id.txtEventDetails)
        var imageView : ImageView = itemView.findViewById((R.id.txtPrice))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): festivalViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_design,parent,false)
        return festivalViewHolder(view)
    }

    override fun getItemCount(): Int {

        return festivalsDetailsList.size
    }

    override fun onBindViewHolder(holder: festivalViewHolder, position: Int) {

        holder.cottonFestHeading.text = festivalsNames.get(position)
        holder.cottonFestDescription.text = festivalsDetailsList.get(position)
        holder.imageView.setImageResource(imagesFestivals.get(position))
    }
}