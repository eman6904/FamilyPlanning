package com.example.familyplanning.ui.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import com.example.familyplanning.R
import com.example.familyplanning.databinding.Model1Binding

class Questionss(private val list:ArrayList<DataModel>):
    RecyclerView.Adapter<Questionss.ViewHolder>() {
    inner class ViewHolder(val binding:Model1Binding) :
        RecyclerView.ViewHolder(binding.root) {
        var text = binding.text
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            Model1Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=list[position]
        holder.text.text="${position + 1}-"+item.text
    }
    override fun getItemCount(): Int {
        return list.size
    }
}