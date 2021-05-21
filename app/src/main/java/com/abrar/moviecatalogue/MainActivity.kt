package com.abrar.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.abrar.moviecatalogue.movies.presentation.MoviesFragment
import com.abrar.moviecatalogue.tvshows.presentation.TvShowsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, MoviesFragment(), "movies")
        transaction.commit()

        btm_nav.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.moviesMenu -> {
                    val transaction = supportFragmentManager.beginTransaction()
                    //transaction.addToBackStack("popular")
                    transaction.replace(R.id.frame_layout, MoviesFragment(), "movies")
                    transaction.commit()
                }
                R.id.tvShowMenu -> {
                    val transaction = supportFragmentManager.beginTransaction()
                    //transaction.addToBackStack("popular")
                    transaction.replace(R.id.frame_layout, TvShowsFragment(), "tvShows")
                    transaction.commit()
                }
            }
            true
        }
    }

}