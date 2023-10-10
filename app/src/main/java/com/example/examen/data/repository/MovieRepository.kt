package com.example.examen.data.repository

import com.example.examen.data.remote.MovieAPIClient
import com.example.examen.domain.model.movie.MovieContainer

/**
 * Clase que obtiene la lista de peliculas
 */
class MovieRepository {
    private var apiMovie = MovieAPIClient()

    suspend fun getMovies(): MovieContainer? = apiMovie.getMovies()
}