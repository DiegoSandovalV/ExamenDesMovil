package com.example.examen.framework.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examen.domain.model.movie.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieViewModel: ViewModel() {
    val movieLiveData = MutableLiveData<Movie>()

    fun getMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            val result: Movie? = movieListRequirement()
            CoroutineScope(Dispatchers.Main).launch {
                movieLiveData.postValue(result!!)
            }
        }
    }
}