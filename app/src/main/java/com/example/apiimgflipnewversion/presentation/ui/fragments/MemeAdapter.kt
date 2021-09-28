package com.example.apiimgflipnewversion.presentation.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.apiimgflipnewversion.domain.model.Meme
import com.example.apiimgflipnewversion.databinding.MemeItemLayoutBinding

class MemeAdapter : RecyclerView.Adapter<MemeAdapter.MemeViewHolder>() {

    var memes = mutableListOf<Meme>()

    fun setMemeList(memes: List<Meme>) {
        this.memes = memes.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemeViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = MemeItemLayoutBinding.inflate(inflater, parent, false)
        return MemeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MemeViewHolder, position: Int) {
        val meme = memes[position]

            holder.binding.tvName.text = memes[position].name

        Glide
            .with(holder.itemView.context)
            .load(meme.url)
            .centerCrop()
            .apply(RequestOptions().override(200, 200))
            .into(holder.binding.ivImage)

    }

    override fun getItemCount(): Int {
        return memes.size
    }

    inner class MemeViewHolder(val binding: MemeItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}