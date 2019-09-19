package com.example.RecyclerViewKotlinDemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_row.view.*

class MyAdapter(val names: List<String>, val context: Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.single_row, parent, false))
    }


    override fun getItemCount(): Int = names.size


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name = names[position]
        holder.txtName.text = name
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtName: TextView = view.txtName
    }
}