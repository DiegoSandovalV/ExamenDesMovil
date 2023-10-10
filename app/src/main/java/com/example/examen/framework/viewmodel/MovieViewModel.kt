package com.example.examen.framework.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examen.domain.model.movie.Movie
import com.example.examen.domain.model.movie.MovieContainer
import com.example.examen.domain.usecase.MovieRequirement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieViewModel: ViewModel() {
    val movieLiveData = MutableLiveData<MovieContainer>()
    private val movieRequirement = MovieRequirement()

    fun getMovies() {
        viewModelScope.launch(Dispatchers.IO) {

            CoroutineScope(Dispatchers.Main).launch {
                val result: MovieContainer? = movieRequirement()
                Log.d("Result Movies", result.toString())
                movieLiveData.postValue(result!!)
            }
        }
    }
}