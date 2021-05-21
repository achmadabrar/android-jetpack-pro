package com.abrar.moviecatalogue.detailtvshow

import androidx.lifecycle.ViewModel
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.abrar.moviecatalogue.utils.Dummy

class DetailTvShowViewModel: ViewModel() {
    private lateinit var tvShowId: String

    fun getTvShow(): List<TvShowModel> = Dummy.generateDataTvShowDummy()

    fun setTvShowId(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    fun getDetailTvShowById(): TvShowModel {
        lateinit var result: TvShowModel
        val listTvShow = getTvShow()
        for (tvShow in listTvShow) {
            if (tvShow.id == tvShowId) {
                result = tvShow
                break
            }
        }
        return result
    }
}