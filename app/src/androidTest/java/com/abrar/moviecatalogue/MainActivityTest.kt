package com.abrar.moviecatalogue

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.abrar.moviecatalogue.utils.Dummy
import com.abrar.moviecatalogue.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    private val dummyMovie = Dummy.generateDataMovieDummy()
    private val dummyTvShow = Dummy.generateDataTvShowDummy()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        IdlingRegistry.getInstance().register(EspressoIdlingResource.espressoTestIdlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.espressoTestIdlingResource)
    }

    //menampilkan data movie dan scroll ke posisi ke 10
    @Test
    fun loadMovies() {
        onView(withId(R.id.recycler_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.recycler_movies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }

    //menampilkan data movie dan cek terdapat data atau tidak dan scroll ke posisi akhir dari dummy kemudian di klik pada data pertama.  Kemudian memastikan image poster, title dan deskripsi tampil sesuai yang diharapkan.
    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.recycler_movies))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.recycler_movies))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
        onView(withId(R.id.recycler_movies))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    0,
                    ViewActions.click()
                )
            )
        onView(withId(R.id.image_poster_movie))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_title_movie))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_desc_movie))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        pressBack()
    }


    //klik tvshow menu, cek data recycler tampil, scroll ke posisi akhir dari data dummy
    @Test
    fun loadTvShows() {
        onView(withId(R.id.tvShowMenu)).perform(click())
        onView(withId(R.id.recycler_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.recycler_tv_show)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyTvShow.size
            )
        )
    }

    //menampilkan data tvShow dan cek terdapat data atau tidak dan scroll ke posisi ke akhir dari dummy kemudian di klik pada data pertama. Kemudian memastikan image poster, title dan deskripsi tampil sesuai yang diharapkan.

    @Test
    fun loadDetailTvShow() {
        onView(withId(R.id.tvShowMenu)).perform(click())
        onView(withId(R.id.recycler_tv_show))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.recycler_tv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
        onView(withId(R.id.recycler_tv_show))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    0,
                    ViewActions.click()
                )
            )
        onView(withId(R.id.image_poster_tvshow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_title_tvshow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.text_desc_tvshow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        pressBack()
    }

}