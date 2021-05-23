package com.abrar.moviecatalogue.movies.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.movies.data.MoviesRepository
import com.abrar.moviecatalogue.movies.domain.models.MovieModel

class MoviesViewModel(private val moviesRepository: MoviesRepository) : ViewModel() {

    fun getMovies(): LiveData<List<MovieModel>> = moviesRepository.getMovies()

}