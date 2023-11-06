package com.devfranz.brunoflix.ui

import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.devfranz.brunoflix.R
import com.devfranz.brunoflix.data.DataSource
import com.devfranz.brunoflix.databinding.ActivityMovieDescriptionBinding
import com.devfranz.brunoflix.models.MoviesAdapter

class MovieDescriptionActivity : AppCompatActivity() {

    private var binding: ActivityMovieDescriptionBinding? = null
    private lateinit var moviesAdapter: MoviesAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val safeBinding = ActivityMovieDescriptionBinding.inflate(layoutInflater)
        binding = safeBinding
        setContentView(safeBinding.root)

        initialize()
    }

    private fun initialize() {
        setupRecyclerView()
        setupDetailsMovie()
        setupbtnTrailler()
    }

    private fun setupRecyclerView() {
        this.moviesAdapter = MoviesAdapter()

        val category = intent.getStringExtra("category")

        if (category != null) {
            val dataSource = DataSource.createDataSet()

            // Filtra a lista de filmes para mostrar apenas os da categoria recebida
            val filteredMovies = dataSource.filter { it.category == category }

            // Agrupa os filmes filtrados por categoria
            val moviesByCategory = filteredMovies.groupBy { it.category }

            // Lista de categorias a partir das chaves do mapa
            val categories = moviesByCategory.keys.toList()

            moviesAdapter.setCategoriesAndMovies(categories, moviesByCategory)

            binding?.rvSugestions?.layoutManager = LinearLayoutManager(this@MovieDescriptionActivity)
            binding?.rvSugestions?.adapter = this.moviesAdapter
        }
    }



    private fun setupbtnTrailler() {
        val webSettings: WebSettings = binding?.webView!!.settings
        webSettings.javaScriptEnabled = true
        binding?.webView?.webChromeClient = WebChromeClient()
        binding?.webView?.webViewClient = WebViewClient()

        val videoUrl = "https://www.youtube.com/watch?v=jCCGGYvFjlw"

        binding?.btnTrailler?.setOnClickListener {
            binding?.webView?.loadUrl(videoUrl)
            binding?.webView?.visibility = View.VISIBLE

        }

    }


    private fun setupDetailsMovie() {
        val thumbnailUrl = intent.getStringExtra("thumbnailUrl")
        val title = intent.getStringExtra("title")
        val category = intent.getStringExtra("category")
        val description = intent.getStringExtra("description")
        val author = intent.getStringExtra("author")

        //Imagem
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            binding?.movieImage?.let {
                Glide.with(this)
                    .applyDefaultRequestOptions(requestOptions)
                    .load(thumbnailUrl)
                    .into(it)

                // Define os valores nos TextViews usando ViewBinding
                binding?.movieTitle?.text = "$title"
                binding?.movieCategory?.text = "$category"
                binding?.movieDescription?.text = "$description"
                binding?.movieAuthor?.text = "$author"
            }


    }


}