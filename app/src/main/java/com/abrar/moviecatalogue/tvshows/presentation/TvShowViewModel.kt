package com.abrar.moviecatalogue.tvshows.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.tvshows.data.TvShowRepository
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.abrar.moviecatalogue.utils.Dummy

class TvShowViewModel(private val tvShowRepository: TvShowRepository): ViewModel() {

    fun getTvShowRemote(): LiveData<List<TvShowModel>> = tvShowRepository.getTvShows()

}