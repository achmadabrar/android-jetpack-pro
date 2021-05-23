package com.abrar.moviecatalogue.movies.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.abrar.moviecatalogue.movies.data.remote.MovieRemoteDataSource
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.abrar.moviecatalogue.movies.domain.models.MovieResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class MoviesRepository constructor(val moviesDataSource: MovieRemoteDataSource) : MovieDataSource {

    companion object {
        @Volatile
        private var instance: MoviesRepository? = null
        fun getInstance(moviesRemoteData: MovieRemoteDataSource): MoviesRepository =
            instance ?: synchronized(this) {
                instance ?: MoviesRepository(moviesRemoteData)
            }
    }

    override fun getMovies(): LiveData<List<MovieModel>> {
        val listMovieResult = MutableLiveData<List<MovieModel>>()
        CoroutineScope(IO).launch {
            moviesDataSource.getMovies(object : MovieRemoteDataSource.LoadNowPlayingMoviesCallback{
                override fun onAllMoviesReceived(movieResponse: List<MovieResponse>) {
                    val movieList = ArrayList<MovieModel>()
                    for (movieResponse in movieResponse){
                        val movie = MovieModel(
                            movieResponse.id,
                            movieResponse.title!!,
                            movieResponse.overview,
                            movieResponse.posterPath,
                            movieResponse.posterPath,
                            movieResponse.releaseDate,
                            null,
                            null,
                            movieResponse.vote,
                            null, null, null, null, null, null,  null
                        )
                        movieList.add(movie)
                    }
                    Log.d("list_movie", movieList.toString())
                    listMovieResult.postValue(movieList)
                }
            })
        }
        return listMovieResult
    }

    override fun getDetailMovie(movieId: Int): LiveData<MovieModel> {
        val movieResult = MutableLiveData<MovieModel>()
        CoroutineScope(IO).launch {
            moviesDataSource.getMovieDetail(movieId, object : MovieRemoteDataSource.LoadMovieDetailCallback{
                override fun onMovieDetailReceived(movieResponse: MovieResponse) {
                    val movie = MovieModel(
                        movieResponse.id,
                        movieResponse.title!!,
                        movieResponse.overview,
                        movieResponse.posterPath,
                        movieResponse.posterPath,
                        movieResponse.releaseDate,
                        null,
                        null,
                        movieResponse.vote,
                        null, null, null, null, null, null,  null
                    )
                    Log.d("detail_movie", movie.toString())
                    movieResult.postValue(movie)
                }
            })
        }
        return movieResult
    }


}