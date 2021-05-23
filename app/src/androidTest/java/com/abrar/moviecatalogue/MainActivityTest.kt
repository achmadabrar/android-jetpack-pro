package com.abrar.moviecatalogue

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.abrar.moviecatalogue.utils.Dummy
import com.abrar.moviecatalogue.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
   
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

    //menampilkan data movie dan scroll ke posisi ke 7
    @Test
    fun loadMovies() {
        Espresso.onView(withId(R.id.recycler_movies)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.recycler_movies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                7
            )
        )
    }

    //menampilkan data movie dan cek terdapat data atau tidak dan scroll ke posisi ke 5 kemudian di klik kemudian cek view image berdasarkan id
    @Test
    fun loadDetailMovie() {
        Espresso.onView(withId(R.id.recycler_movies))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.recycler_movies))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(5))
        Espresso.onView(withId(R.id.recycler_movies))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(5,
                    ViewActions.click()
                ))
        Espresso.onView(withId(R.id.image_poster_movie))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.pressBack()
    }

    @Test
    fun loadTvShows() {
        Espresso.onView(withId(R.id.tvShowMenu)).perform(click())
        Espresso.onView(withId(R.id.recycler_tv_show)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.recycler_tv_show)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                4
            )
        )
    }

    @Test
    fun loadDetailTvShow() {
        Espresso.onView(withId(R.id.tvShowMenu)).perform(click())
        Espresso.onView(withId(R.id.recycler_tv_show))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.recycler_tv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(5))
        Espresso.onView(withId(R.id.recycler_tv_show))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(5,
                    ViewActions.click()
                ))
        Espresso.onView(withId(R.id.text_title_tvshow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.text_desc_tvshow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.pressBack()
    }

}