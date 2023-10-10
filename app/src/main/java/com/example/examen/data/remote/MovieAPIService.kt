package com.example.examen.data.remote

import com.example.examen.domain.model.movie.MovieContainer
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.HeaderMap

/**
 * Servicio que obtiene la lista de peliculas
 */
interface MovieAPIService {
    @GET("movie/popular")
    suspend fun getMovies(@HeaderMap headers: Map<String, String>): MovieContainer
}

