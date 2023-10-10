package com.example.examen.framework.ui.viewholders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.examen.databinding.MovieItemBinding
import com.example.examen.domain.model.movie.Movie

class MovieViewHolder (private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie, context: Context){
        binding.TVName.text = movie.original_title
        binding.TVLanguage.text = if (movie.original_language.equals("en")) "English" else "Spanish"
        binding.TVRating.text = movie.vote_average.toString()

        Glide.with(context)
            .load("https://image.tmdb.org/t/p/w500/${movie.poster_path}")
            .into(binding.IVPhoto)
    }
}