package com.example.examen.framework.ui.viewholders

import android.content.Context
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.examen.databinding.MovieItemBinding
import com.example.examen.domain.model.movie.Movie

class MovieViewHolder (private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie, context: Context){
        binding.TVName.text = movie.original_title
        binding.TVLanguage.text = movie.original_language

        Glide.with(context)
            .load("https://image.tmdb.org/t/p/w500/${movie.poster_path}")
            .into(binding.IVPhoto)
    }
}