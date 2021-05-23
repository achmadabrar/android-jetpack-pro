package com.abrar.moviecatalogue.core.api

import com.abrar.moviecatalogue.BuildConfig
import com.abrar.moviecatalogue.movies.domain.models.MovieResponse
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    companion object{
        const val MOVIES = "movie/now_playing"
        const val MOVIE_DETAILS = "movie/{movie_id}"
        const val TVHSOW = "tv/on_the_air"
        const val DETAIL_TVSHOW = "tv/{tv_id}"
    }

    @GET(MOVIES)
    fun getMovies(
        @Query("api_key") api_key: String = BuildConfig.API_KEY
    ) : Call<Response<MovieResponse>>

    @GET(MOVIE_DETAILS)
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") api_key: String = BuildConfig.API_KEY
    ) :  Call<MovieResponse>

    @GET(TVHSOW)
    fun getTvShow(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ) : Call<Response<TvShowResponse>>

    @GET(DETAIL_TVSHOW)
    fun getDetailTvShow(
        @Path("tv_id") tvShowId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ) : Call<TvShowResponse>
}