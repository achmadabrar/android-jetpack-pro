package com.abrar.moviecatalogue.tvshows.presentation

import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.abrar.moviecatalogue.utils.Dummy

class TvShowViewModel: ViewModel() {
    fun getTvShow(): List<TvShowModel> = Dummy.generateDataTvShowDummy()
}