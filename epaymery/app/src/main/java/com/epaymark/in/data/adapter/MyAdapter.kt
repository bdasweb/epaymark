package com.epaymark.`in`.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.epaymark.`in`.data.model.ListIcon
import com.epaymark.`in`.databinding.ExpenceListBinding


class MyAdapter(data: List<ListIcon>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    private val data: List<ListIcon>

    init {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ExpenceListBinding = ExpenceListBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: ListIcon = data[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(binding: ExpenceListBinding) :
        RecyclerView.ViewHolder(binding.getRoot()) {
        private val binding: ExpenceListBinding

        init {
            this.binding = binding
        }

        fun bind(item: ListIcon) {
            // Bind data to the ViewBinding instance
            binding.tvTitle.setText(item.title)
            binding.img.setImageResource(item.image)
        }
    }
}