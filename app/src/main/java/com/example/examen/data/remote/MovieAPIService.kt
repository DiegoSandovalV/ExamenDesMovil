package com.example.examen.data.remote

import com.example.examen.domain.model.movie.MovieContainer
import retrofit2.http.GET
import retrofit2.http.Header

interface MovieAPIService {
    @GET("movie/popular")
    suspend fun getMovies(@Header("Authorization") authorizationHeader: String): MovieContainer
}

