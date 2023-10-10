package com.example.examen.framework.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examen.domain.model.movie.MovieContainer
import com.example.examen.domain.usecase.MovieRequirement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {
    val movieLiveData = MutableLiveData<MovieContainer>()
    private val movieRequirement = MovieRequirement()

    /**
     * Funcion que obtiene la lista de peliculas
     */
    fun getMovies() {
        viewModelScope.launch(Dispatchers.IO) {

            CoroutineScope(Dispatchers.Main).launch {
                val result: MovieContainer? = MovieRequirement().invoke()
                Log.d("Result Movies", result.toString())
                movieLiveData.postValue(result!!)
            }
        }
    }
}