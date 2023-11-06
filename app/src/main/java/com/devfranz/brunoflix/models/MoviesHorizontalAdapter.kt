package com.devfranz.brunoflix.models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.devfranz.brunoflix.R

typealias ClickItem = (Movies) -> Unit

class MoviesHorizontalAdapter(
    private val context: Context,
    private val clickItem: ClickItem
) : ListAdapter<Movies, MoviesHorizontalAdapter.MoviesViewHolder>(DiffCallback()) {

    private var selectedMovie: Movies? = null

    inner class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val thumbnail = itemView.findViewById<ImageView>(R.id.moviePoster)

        fun bind(movie: Movies) {
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(context)
                .applyDefaultRequestOptions(requestOptions)
                .load(movie.thumbnailUrl)
                .into(thumbnail)


            itemView.setOnClickListener {
                clickItem(movie)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie)
        holder.itemView.isSelected = (selectedMovie == movie)
        holder.itemView.setOnClickListener {
            clickItem(movie)
        }
    }


    class DiffCallback : DiffUtil.ItemCallback<Movies>() {
        override fun areItemsTheSame(oldItem: Movies, newItem: Movies) =
            oldItem.thumbnailUrl == newItem.thumbnailUrl

        override fun areContentsTheSame(oldItem: Movies, newItem: Movies) =
            oldItem == newItem
    }
}
