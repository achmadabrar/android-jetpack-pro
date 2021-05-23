package com.abrar.moviecatalogue.tvshows.data

import androidx.lifecycle.LiveData
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel

interface TvShowDataSource {
    fun getTvShows() : LiveData<List<TvShowModel>>
    fun getDetailTvShow(tvShowId:Int): LiveData<TvShowModel>
}