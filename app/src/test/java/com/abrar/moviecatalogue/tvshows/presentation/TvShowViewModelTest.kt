package com.abrar.moviecatalogue.tvshows.presentation

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val tvShowEntities = viewModel.getTvShow()
        //cek data tidak null
        assertNotNull(tvShowEntities)
        //cek jumlah data sama
        assertEquals(10, tvShowEntities.size)
    }
}