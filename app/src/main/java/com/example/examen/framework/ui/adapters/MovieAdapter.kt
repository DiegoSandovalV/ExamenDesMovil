package com.example.examen.framework.ui.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.databinding.MovieItemBinding
import com.example.examen.domain.model.movie.Movie
import com.example.examen.framework.ui.viewholders.MovieViewHolder

/**
 * Clase que se encarga de manejar el adaptador de la lista de peliculas
 */
class MovieAdapter : RecyclerView.Adapter<MovieViewHolder>() {
    lateinit var context: Context
    var data: List<Movie> = ArrayList()

    /**
     * Constructor de la clase
     */
    @SuppressLint("NotConstructor")
    fun MovieAdapter(basicData: List<Movie>, context: Context) {
        this.data = basicData
        this.context = context
    }

    /**
     * Funcion que se encarga de actualizar la lista de peliculas
     * @param data Lista de peliculas
     */
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, context)
    }

    /**
     * Funcion que se encarga de crear el viewholder
     * @param parent Vista padre
     * @param viewType Tipo de vista
     * @return MovieViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    /**
     * Funcion que se encarga de obtener el tamaño de la lista de peliculas
     * @return Int
     */
    override fun getItemCount(): Int {
        return data.size
    }
}