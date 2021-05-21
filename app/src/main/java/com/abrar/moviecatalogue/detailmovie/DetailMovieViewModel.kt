package com.abrar.moviecatalogue.detailmovie

import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.abrar.moviecatalogue.utils.Dummy

class DetailMovieViewModel: ViewModel() {
    private lateinit var movieId: String

    fun getMovies(): List<MovieModel> = Dummy.generateDataMovieDummy()

    fun setMovieId(movieId: String) {
        this.movieId = movieId
    }

    fun getDetailMovieById(): MovieModel {
        lateinit var result: MovieModel
        val listMovie = getMovies()
        for (movie in listMovie) {
            if (movie.id == movieId) {
                result = movie
                break
            }
        }
        return  result
    }
}