package com.example.examen.domain.usecase

import com.example.examen.data.repository.MovieRepository
import com.example.examen.domain.model.movie.MovieContainer

/**
 * Clase que obtiene la lista de peliculas
 */
class MovieRequirement {
    private val movieRepository = MovieRepository()

    suspend operator fun invoke(): MovieContainer? = movieRepository.getMovies()
}