package com.abrar.moviecatalogue.movies.data.remote

import com.abrar.moviecatalogue.core.api.ApiClient
import com.abrar.moviecatalogue.movies.domain.models.MovieResponse
import com.abrar.moviecatalogue.utils.EspressoIdlingResource
import retrofit2.await

class MovieRemoteDataSource {

    companion object {
        @Volatile
        private var instance: MovieRemoteDataSource? = null

        fun getInstance(): MovieRemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: MovieRemoteDataSource()
            }
    }

    suspend fun getMovies(
        callback: LoadNowPlayingMoviesCallback
    ) {
        EspressoIdlingResource.increment()
        ApiClient.instance.getMovies().await().result?.let { listMovie ->
            callback.onAllMoviesReceived(
                listMovie
            )
            EspressoIdlingResource.decrement()
        }
    }

    suspend fun getMovieDetail(movieId: Int, callback: LoadMovieDetailCallback) {
        EspressoIdlingResource.increment()
        ApiClient.instance.getDetailMovie(movieId).await().let { movie ->
            callback.onMovieDetailReceived(
                movie
            )
            EspressoIdlingResource.decrement()
        }
    }

    interface LoadNowPlayingMoviesCallback {
        fun onAllMoviesReceived(movieResponse: List<MovieResponse>)
    }

    interface LoadMovieDetailCallback {
        fun onMovieDetailReceived(movieResponse: MovieResponse)
    }
}