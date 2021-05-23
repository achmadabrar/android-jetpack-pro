package com.abrar.moviecatalogue.detailmovie

import com.abrar.moviecatalogue.utils.Dummy
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyData = Dummy.generateDataMovieDummy()[0]
    private val movieId = dummyData.id

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
        viewModel.setMovieId(movieId)
    }

    @Test
    fun getDetailMovieById() {
        val movieDetail = viewModel.getDetailMovieById()
        assertNotNull(movieDetail)
        assertEquals(dummyData.title, movieDetail.title)
        assertEquals(dummyData.desc, movieDetail.desc)
        assertEquals(dummyData.poster, movieDetail.poster)
        assertEquals(dummyData.releaseDate, movieDetail.releaseDate)
    }
}