package com.abrar.moviecatalogue.tvshows.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.abrar.moviecatalogue.tvshows.data.TvShowRepository
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
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
class TvShowViewModelTest {

    private val dummyTvShow = Dummy.generateDataTvShowDummy()
    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var tvShowRepository: TvShowRepository

    @Mock
    private lateinit var observer: Observer<List<TvShowModel>>

    @Before
    fun setUp() {
        viewModel = TvShowViewModel(tvShowRepository)
    }

    @Test
    fun getTvShows() {
        val tvShow = MutableLiveData<List<TvShowModel>>()
        tvShow.value = dummyTvShow

        Mockito.`when`(tvShowRepository.getTvShows()).thenReturn(tvShow)

        val dataListTvShow = viewModel.getTvShowRemote().value

        verify(tvShowRepository).getTvShows()
        Assert.assertNotNull(dataListTvShow)
        Assert.assertEquals(10, dataListTvShow?.size)

        viewModel.getTvShowRemote().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}