package com.devfranz.brunoflix.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.devfranz.brunoflix.data.DataSource
import com.devfranz.brunoflix.databinding.ActivityMainBinding
import com.devfranz.brunoflix.models.MoviesAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var moviesAdapter: MoviesAdapter
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val safeBinding = ActivityMainBinding.inflate(layoutInflater)
        binding = safeBinding
        setContentView(safeBinding.root)

        initialize()
    }

    private fun initialize() {
        setupRecyclerView()
        setupDataSource()
    }

    private fun setupDataSource() {
        val dataSource = DataSource.createDataSet()

        // Agrupa os filmes por categoria
        val moviesByCategory = dataSource.groupBy { it.category }

        // Cria uma lista de categorias
        val categories = ArrayList<String>()
        categories.addAll(moviesByCategory.keys)

        moviesAdapter.setCategoriesAndMovies(categories, moviesByCategory)
    }


    private fun setupRecyclerView() {
        this.moviesAdapter = MoviesAdapter()
        binding?.rvCategories?.layoutManager = LinearLayoutManager(this@MainActivity)
        binding?.rvCategories?.adapter = this.moviesAdapter
    }
}