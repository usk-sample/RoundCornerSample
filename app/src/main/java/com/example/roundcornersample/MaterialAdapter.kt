package com.example.roundcornersample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.roundcornersample.databinding.ItemCellBinding

class MaterialItemCellViewHolder(binding: ItemCellBinding) : RecyclerView.ViewHolder(binding.root)

class MaterialAdapter : RecyclerView.Adapter<MaterialItemCellViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MaterialItemCellViewHolder {
        val binding: ItemCellBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_cell, parent, false)
        return MaterialItemCellViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MaterialItemCellViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }
}