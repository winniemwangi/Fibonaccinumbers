package com.winnie.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.winnie.fibonacci.R

class NumberRecyclerViewAdapter(var numberList:List<Int>):RecyclerView.Adapter<NumberRecyclerViewAdapter.NumberViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.number_item_list,parent,false)
        return NumberViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumber.text= numberList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return numberList.size

    }
    class NumberViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvNumber= itemView.findViewById<TextView>(R.id.tvNumber)
    }


}
