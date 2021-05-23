package com.abrar.moviecatalogue.tvshows.detailtvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.tvshows.data.TvShowRepository
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.abrar.moviecatalogue.utils.Dummy

class DetailTvShowViewModel constructor(private val tvShowRepository: TvShowRepository): ViewModel() {
    private lateinit var tvShowId: String

    fun getTvShowDetail(tvShowId: Int): LiveData<TvShowModel> = tvShowRepository.getDetailTvShow(tvShowId)
}