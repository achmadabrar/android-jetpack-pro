package com.abrar.moviecatalogue.movies.presentation

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MoviesViewModelTest {

    private lateinit var viewModel: MoviesViewModel

    @Before
    fun setUp() {
        viewModel = MoviesViewModel()
    }

    @Test
    fun getMovies() {
        val moviesEntities = viewModel.getMovies()
        assertNotNull(moviesEntities)
        assertEquals(10, moviesEntities.size)
    }
}