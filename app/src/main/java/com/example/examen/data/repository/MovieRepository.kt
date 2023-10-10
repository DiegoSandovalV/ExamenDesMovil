package com.example.examen.data.repository

import com.example.examen.data.remote.MovieAPIClient
import com.example.examen.domain.model.movie.MovieContainer

class MovieRepository {
    private var apiMovie = MovieAPIClient()

    suspend fun getMovies(): MovieContainer? = apiMovie.getMovies()
}