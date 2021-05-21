package com.abrar.moviecatalogue

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.abrar.moviecatalogue.utils.Dummy
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    private val dummyMovies = Dummy.generateDataMovieDummy()
    private val dummyTvShows = Dummy.generateDataTvShowDummy()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    //menampilkan data movie
    @Test
    fun loadMovies() {
        onView(withId(R.id.recycler_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.recycler_movies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovies.size
            )
        )
    }

    //menampilkan list movie, kemudian melakukan klik pada item ke 0 (a star is born) dan menampilkan halaman detail
    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.recycler_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.text_title_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title_movie)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.text_desc_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.text_desc_movie)).check(matches(withText(dummyMovies[0].desc)))
    }

    //menampilkan list tvshow
    @Test
    fun loadTvShows() {
        onView(withId(R.id.tvShowMenu)).perform(click())
        onView(withId(R.id.recycler_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.recycler_tv_show)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                10
            )
        )
    }

}