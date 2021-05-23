package com.abrar.moviecatalogue.movies.detailmovie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.movies.data.MoviesRepository
import com.abrar.moviecatalogue.movies.domain.models.MovieModel

class DetailMovieViewModel(private val moviesRepository: MoviesRepository) : ViewModel() {

    fun getDetailMovieById(movieId: Int): LiveData<MovieModel> =
        moviesRepository.getDetailMovie(movieId)
}