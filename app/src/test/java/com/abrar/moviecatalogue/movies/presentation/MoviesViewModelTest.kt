package com.abrar.moviecatalogue.movies.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.abrar.moviecatalogue.movies.data.MoviesRepository
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.abrar.moviecatalogue.utils.Dummy
import com.nhaarman.mockitokotlin2.verify
import junit.framework.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MoviesViewModelTest {

    private val dummyMovie = Dummy.generateDataMovieDummy()
    private lateinit var viewModel: MoviesViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var moviesRepository: MoviesRepository

    @Mock
    private lateinit var observer: Observer<List<MovieModel>>

    @Before
    fun setUp() {
        viewModel = MoviesViewModel(moviesRepository)
    }

    @Test
    fun getListNowPlayingMovies() {
        val movie = MutableLiveData<List<MovieModel>>()
        movie.value = dummyMovie

        Mockito.`when`(moviesRepository.getMovies()).thenReturn(movie)

        val dataListMovie = viewModel.getMovies().value

        verify(moviesRepository).getMovies()
        Assert.assertNotNull(dataListMovie)
        Assert.assertEquals(10, dataListMovie?.size)

        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

}