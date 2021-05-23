package com.abrar.moviecatalogue.detailmovie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.abrar.moviecatalogue.movies.data.MoviesRepository
import com.abrar.moviecatalogue.movies.detailmovie.DetailMovieViewModel
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.abrar.moviecatalogue.utils.Dummy
import com.nhaarman.mockitokotlin2.verify
import junit.framework.Assert
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailMovieViewModelTest {


    private val dummyMovie = Dummy.generateDataMovieDummy()[0]
    private val movieId = dummyMovie.id


    private lateinit var viewModel: DetailMovieViewModel

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogRepository: MoviesRepository

    @Mock
    private lateinit var observer: Observer<MovieModel>

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel(catalogRepository)
    }

    @Test
    fun getMovieDetail() {
        val movieDummy = MutableLiveData<MovieModel>()
        movieDummy.value = dummyMovie

        Mockito.`when`(catalogRepository.getDetailMovie(movieId.toInt())).thenReturn(movieDummy)

        val movieData = viewModel.getDetailMovieById(movieId.toInt()).value as MovieModel

        Assert.assertNotNull(movieData)
        assertEquals(dummyMovie.id, movieData.id)
        assertEquals(dummyMovie.image_preview, movieData.image_preview)
        assertEquals(dummyMovie.desc, movieData.desc)
        assertEquals(dummyMovie.poster, movieData.poster)

        viewModel.getDetailMovieById(movieId.toInt()).observeForever(observer)
        verify(observer).onChanged(dummyMovie)

    }

}