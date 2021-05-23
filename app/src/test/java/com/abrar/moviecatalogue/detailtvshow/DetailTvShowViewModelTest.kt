package com.abrar.moviecatalogue.detailtvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.abrar.moviecatalogue.tvshows.data.TvShowRepository
import com.abrar.moviecatalogue.tvshows.detailtvshow.DetailTvShowViewModel
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.abrar.moviecatalogue.utils.Dummy
import com.nhaarman.mockitokotlin2.verify
import junit.framework.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailTvShowViewModelTest {
    
    private val dummyTvShow = Dummy.generateDataTvShowDummy()[0]
    private val tvShowId = dummyTvShow.id

    private lateinit var viewModel: DetailTvShowViewModel

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogRepository: TvShowRepository

    @Mock
    private lateinit var observer: Observer<TvShowModel>

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel(catalogRepository)
    }

    @Test
    fun getDetailTvShow() {
        val movieDummy = MutableLiveData<TvShowModel>()
        movieDummy.value = dummyTvShow

        Mockito.`when`(catalogRepository.getDetailTvShow(tvShowId.toInt())).thenReturn(movieDummy)

        val movieData = viewModel.getTvShowDetail(tvShowId.toInt()).value as TvShowModel

        Assert.assertNotNull(movieData)
        assertEquals(dummyTvShow.id, movieData.id)
        assertEquals(dummyTvShow.title, movieData.title)
        assertEquals(dummyTvShow.desc, movieData.desc)
        assertEquals(dummyTvShow.poster, movieData.poster)

        viewModel.getTvShowDetail(tvShowId.toInt()).observeForever(observer)
        verify(observer).onChanged(dummyTvShow)

    }

    @Test
    fun getTvShowDetail() {
        val tvShowDummy = MutableLiveData<TvShowModel>()
        tvShowDummy.value = dummyTvShow

        Mockito.`when`(catalogRepository.getDetailTvShow(tvShowId.toInt())).thenReturn(tvShowDummy)

        val tvShowData = viewModel.getTvShowDetail(tvShowId.toInt()).value as TvShowModel

        Assert.assertNotNull(tvShowData)
        assertEquals(dummyTvShow.id, tvShowData.id)
        assertEquals(dummyTvShow.title, tvShowData.title)
        assertEquals(dummyTvShow.desc, tvShowData.desc)
        assertEquals(dummyTvShow.poster, tvShowData.poster)

        viewModel.getTvShowDetail(tvShowId.toInt()).observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}