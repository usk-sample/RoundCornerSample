package com.example.roundcornersample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.roundcornersample.databinding.RoundCellBinding

class RoundCellViewHolder(val binding: RoundCellBinding) : RecyclerView.ViewHolder(binding.root)

class RoundAdapter(private val isCircle: Boolean) : RecyclerView.Adapter<RoundCellViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoundCellViewHolder {
        val binding: RoundCellBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.round_cell, parent, false)
        return RoundCellViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RoundCellViewHolder, position: Int) {
        if (isCircle) {
            holder.binding.imageView.outlineProvider = CircleOutlineProvider()
        } else {
            holder.binding.imageView.outlineProvider = RoundOutlineProvider()

        }
    }

    override fun getItemCount(): Int {
        return 10
    }
}