package com.abrar.moviecatalogue.tvshows.data.remote

import com.abrar.moviecatalogue.core.api.ApiClient
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowResponse
import com.abrar.moviecatalogue.utils.EspressoIdlingResource
import retrofit2.await

class TvRemoteDataSource {

    companion object {
        @Volatile
        private var instance:TvRemoteDataSource? = null

        fun getInstance():TvRemoteDataSource =
            instance ?: synchronized(this) {
                instance ?:TvRemoteDataSource()
            }
    }



    suspend fun getTvShow(callback: TvShowCallback) {
        EspressoIdlingResource.increment()
        ApiClient.instance.getTvShow().await().result?.let { listTvShow ->
            callback.onAllTvShowsReceived(
                listTvShow
            )
            EspressoIdlingResource.decrement()
        }
    }

    suspend fun getTvShowDetail(tvShowId: Int, callback: TvShowDetailCallback) {
        EspressoIdlingResource.increment()
        ApiClient.instance.getDetailTvShow(tvShowId).await().let { tvShow ->
            callback.onTvShowDetailReceived(
                tvShow
            )
            EspressoIdlingResource.decrement()
        }
    }


    interface TvShowCallback {
        fun onAllTvShowsReceived(tvShowResponse: List<TvShowResponse>)
    }

    interface TvShowDetailCallback {
        fun onTvShowDetailReceived(tvShowResponse: TvShowResponse)
    }
}