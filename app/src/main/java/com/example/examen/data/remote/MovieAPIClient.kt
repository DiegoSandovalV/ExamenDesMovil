package com.example.examen.data.remote

import com.example.examen.domain.model.movie.MovieContainer

class MovieAPIClient {
    private lateinit var api: MovieAPIService

    suspend fun getMovies(): MovieContainer?{
        val mapHeaders = hashMapOf<String,String>()
        val token:String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJmZjhkZDc1NmUzMmI4YWNlZjYyZmQ2YzMwZmQwY2NmOSIsInN1YiI6IjY0ZWI5MzhiZTg5NGE2MDEzYmIxNjNjZiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.6cGDTI8wql15qnVZErrd_6QRNaiRAi74pRD0LfOzVZM"
        mapHeaders["Authorization"] = token
        api = NetworkModelDI()
        return try {
            api.getMovies(mapHeaders)
        } catch (e: Exception) {
            null
        }
    }

}