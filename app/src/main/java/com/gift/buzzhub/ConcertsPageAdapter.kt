package com.gift.buzzhub

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ConcertsPageAdapter(var nameList:ArrayList<String>,
                            var detailsList:ArrayList<String>,
                            var context: Context): RecyclerView.Adapter<ConcertsPageAdapter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var textViewName: TextView = itemView.findViewById(R.id.concertsRecycleViewName)
        var textViewDetail: TextView = itemView.findViewById(R.id.concertsRecycleViewDetails)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.concerts_recycle_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textViewName.text = nameList.get(position)
        holder.textViewDetail.text = detailsList.get(position)
    }
}