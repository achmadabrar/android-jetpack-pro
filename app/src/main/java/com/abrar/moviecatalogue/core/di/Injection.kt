package com.abrar.moviecatalogue.core.di

import com.abrar.moviecatalogue.movies.data.MoviesRepository
import com.abrar.moviecatalogue.movies.data.remote.MovieRemoteDataSource
import com.abrar.moviecatalogue.tvshows.data.TvShowRepository
import com.abrar.moviecatalogue.tvshows.data.remote.TvRemoteDataSource

object Injection {

    fun provideMovieRepository(): MoviesRepository {
        val remoteDataSource = MovieRemoteDataSource.getInstance()
        return MoviesRepository.getInstance(remoteDataSource)
    }

    fun provideTvShowRepository(): TvShowRepository {
        val remoteDataSource = TvRemoteDataSource.getInstance()
        return TvShowRepository.getInstance(remoteDataSource)
    }
}