package com.abrar.moviecatalogue.movies.presentation

import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.abrar.moviecatalogue.utils.Dummy

class MoviesViewModel : ViewModel() {
    fun getMovies(): List<MovieModel> = Dummy.generateDataMovieDummy()
}