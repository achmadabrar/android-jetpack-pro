package com.abrar.moviecatalogue.movies.data

import androidx.lifecycle.LiveData
import com.abrar.moviecatalogue.movies.domain.models.MovieModel

interface MovieDataSource {
    fun getMovies(): LiveData<List<MovieModel>>
    fun getDetailMovie(tvShowId: Int): LiveData<MovieModel>
}