package com.abrar.moviecatalogue.tvshows.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.abrar.moviecatalogue.tvshows.data.remote.TvRemoteDataSource
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class TvShowRepository constructor(val tvRemoteDataSource: TvRemoteDataSource): TvShowDataSource {

    companion object {
        @Volatile
        private var instance: TvShowRepository? = null
        fun getInstance(tvShowRemoteData: TvRemoteDataSource): TvShowRepository =
            instance ?: synchronized(this) {
                instance ?: TvShowRepository(tvShowRemoteData)
            }
    }

    override fun getTvShows(): LiveData<List<TvShowModel>> {
        val listTvShow = MutableLiveData<List<TvShowModel>>()
        CoroutineScope(IO).launch {
            tvRemoteDataSource.getTvShow(object : TvRemoteDataSource.TvShowCallback{
                override fun onAllTvShowsReceived(tvShowResponse: List<TvShowResponse>) {
                    val tvShowList = ArrayList<TvShowModel>()
                    for (response in tvShowResponse){
                        val tvShow = TvShowModel(
                            response.id,
                            response.title!!,
                            response.overview,
                            response.posterPath
                        )
                        tvShowList.add(tvShow)
                    }
                    Log.d("list_tvshow", tvShowList.toString())
                    listTvShow.postValue(tvShowList)
                }
            })
        }
        return listTvShow
    }

    override fun getDetailTvShow(tvShowId: Int): LiveData<TvShowModel> {
        val tvShowResult = MutableLiveData<TvShowModel>()
        CoroutineScope(IO).launch {
            tvRemoteDataSource.getTvShowDetail(tvShowId, object : TvRemoteDataSource.TvShowDetailCallback{
                override fun onTvShowDetailReceived(tvShowResponse: TvShowResponse) {
                    val tvShow = TvShowModel(
                        tvShowResponse.id,
                        tvShowResponse.title!!,
                        tvShowResponse.overview,
                        tvShowResponse.posterPath
                    )
                    Log.d("detail_tvshow", tvShow.toString())
                    tvShowResult.postValue(tvShow)
                }
            })
        }
        return tvShowResult
    }
}