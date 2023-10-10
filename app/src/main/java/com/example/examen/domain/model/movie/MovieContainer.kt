package com.example.examen.domain.model.movie

import com.google.gson.annotations.SerializedName

/**
 * Clase que contiene la lista de peliculas
 */
data class MovieContainer(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: List<Movie>,
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("total_results") val totalResults: Int
)