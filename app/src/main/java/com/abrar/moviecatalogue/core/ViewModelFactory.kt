package com.abrar.moviecatalogue.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.abrar.moviecatalogue.core.di.Injection
import com.abrar.moviecatalogue.movies.data.MoviesRepository
import com.abrar.moviecatalogue.movies.detailmovie.DetailMovieViewModel
import com.abrar.moviecatalogue.movies.presentation.MoviesViewModel
import com.abrar.moviecatalogue.tvshows.data.TvShowRepository
import com.abrar.moviecatalogue.tvshows.detailtvshow.DetailTvShowViewModel
import com.abrar.moviecatalogue.tvshows.presentation.TvShowViewModel

class ViewModelFactory private constructor(private val moviesRepository: MoviesRepository, private val tvShowRepository: TvShowRepository): ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideMovieRepository(), Injection.provideTvShowRepository())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MoviesViewModel::class.java) -> {
                MoviesViewModel(moviesRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                TvShowViewModel(tvShowRepository) as T
            }
            modelClass.isAssignableFrom(DetailTvShowViewModel::class.java) -> {
                DetailTvShowViewModel(tvShowRepository) as T
            }
            modelClass.isAssignableFrom(DetailMovieViewModel::class.java) -> {
                DetailMovieViewModel(moviesRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }

    }
}