package com.example.examen.framework.ui.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.databinding.MovieItemBinding
import com.example.examen.domain.model.movie.Movie
import com.example.examen.framework.ui.viewholders.MovieViewHolder

class MovieAdapter: RecyclerView.Adapter<MovieViewHolder>() {
    lateinit var context: Context
    var data: List<Movie> = ArrayList()

    @SuppressLint("NotConstructor")
    fun MovieAdapter(basicData: List<Movie>, context: Context) {
        this.data = basicData
        this.context = context
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}