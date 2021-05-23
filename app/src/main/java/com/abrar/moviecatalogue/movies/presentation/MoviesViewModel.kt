package com.abrar.moviecatalogue.movies.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.abrar.moviecatalogue.utils.Dummy

class MoviesViewModel : ViewModel() {

    val movies = MutableLiveData<MovieModel>()

    fun getMovies(): List<MovieModel> = Dummy.generateDataMovieDummy()

}