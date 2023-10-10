package com.example.examen.data.repository

import com.example.examen.data.remote.MovieAPIClient

class MovieRepository {
    private var apiMovie = MovieAPIClient()

    suspend fun getMovies() = apiMovie.getMovies()
}