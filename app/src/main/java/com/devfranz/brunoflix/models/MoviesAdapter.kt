package com.devfranz.brunoflix.models

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devfranz.brunoflix.R
import com.devfranz.brunoflix.ui.MovieDescriptionActivity

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.CategoryViewHolder>() {

    private var categories: List<String> = ArrayList()
    private var moviesByCategory: Map<String, List<Movies>> = HashMap()

    fun setCategoriesAndMovies(categories: List<String>, moviesByCategory: Map<String, List<Movies>>) {
        this.categories = categories
        this.moviesByCategory = moviesByCategory
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categories[position], moviesByCategory[categories[position]])
    }

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val categoryName = itemView.findViewById<TextView>(R.id.categoryName)
        private val moviesRecyclerView = itemView.findViewById<RecyclerView>(R.id.moviesRecyclerView)

        fun bind(category: String, movies: List<Movies>?) {
            categoryName.text = category

            // Configura o adaptador horizontal de filmes
            val moviesAdapter = MoviesHorizontalAdapter(itemView.context) { movie ->
                // Lide com o clique aqui, passando o objeto Movies completo
                val intent = Intent(itemView.context, MovieDescriptionActivity::class.java)
                intent.putExtra("thumbnailUrl", movie.thumbnailUrl)
                intent.putExtra("category", category)
                intent.putExtra("description", movie.description)
                intent.putExtra("author", movie.author)
                intent.putExtra("title", movie.title)
                itemView.context.startActivity(intent)
            }

            moviesRecyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            moviesRecyclerView.adapter = moviesAdapter

            moviesAdapter.submitList(movies ?: emptyList())
        }
    }
}
