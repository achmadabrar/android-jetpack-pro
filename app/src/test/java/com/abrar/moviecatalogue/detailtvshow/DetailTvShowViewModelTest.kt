package com.abrar.moviecatalogue.detailtvshow

import com.abrar.moviecatalogue.utils.Dummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyData = Dummy.generateDataTvShowDummy()[0]
    private val tvShowId = dummyData.id

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel()
        viewModel.setTvShowId(tvShowId)
    }

    @Test
    fun getDetailTvShowById() {
        val detailTvShow = viewModel.getDetailTvShowById()
        assertNotNull(detailTvShow)
        assertEquals(dummyData.title, detailTvShow.title)
        assertEquals(dummyData.desc, detailTvShow.desc)
        assertEquals(dummyData.poster, detailTvShow.poster)
    }
}