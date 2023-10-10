package com.example.examen.domain.model.movie

data class MovieContainer(
    val page: Int,
    val results: ArrayList<Movie>,
    val total_pages: Int,
    val total_results: Int
)