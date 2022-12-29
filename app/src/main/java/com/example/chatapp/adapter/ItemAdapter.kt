package com.example.chatapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chatapp.R
import com.example.chatapp.model.Affirmation


class ItemAdapter(private val myContext: Context, val dataset: List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val myView: View):RecyclerView.ViewHolder(myView) {
        val myTextView:TextView = myView.findViewById(R.id.item_title)
        val myImageView: ImageView = myView.findViewById(R.id.item_image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)


    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.myTextView.text = myContext.resources.getString(item.stringResourceId)
        holder.myImageView.setImageResource(item.imageResourceId)

    }

    override fun getItemCount(): Int {
      return dataset.size
    }
}