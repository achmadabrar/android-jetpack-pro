package com.abrar.moviecatalogue.movies.detailmovie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.abrar.moviecatalogue.R
import com.abrar.moviecatalogue.core.ViewModelFactory
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail.*

private const val MOVIE = "movie"

class DetailMovieFragment : Fragment() {
    lateinit var movie: MovieModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(
            this,
            factory
        )[DetailMovieViewModel::class.java]

        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.title =
            resources.getString(R.string.Detail)


        arguments?.getInt(MOVIE).let {
            viewModel.getDetailMovieById(it!!).observe(viewLifecycleOwner, Observer {
                Glide.with(this)
                    .load("https://image.tmdb.org/t/p/original"+it.image_preview)
                    .into(image_poster_movie)


                   text_title_movie.text = it.title
                   text_desc_movie.text = it.desc
                   text_release_genre_duration.text = resources.getString(
                       R.string.release_genre_duration,
                       it.releaseDate,
                       it.genre,
                       it.duration
                   )
                   text_status.text = resources.getString(R.string.status, it.status)
                   text_budget.text = resources.getString(R.string.budget, it.budget)
                   text_income.text = resources.getString(R.string.income, it.income)
                   text_director.text = resources.getString(R.string.director, it.director)
                   text_screenplay.text = resources.getString(R.string.screenplay, it.screenplay)
                   text_stories.text = resources.getString(R.string.stories, it.stories)
            })
        }
    }


    companion object {
        fun newInstance(movieIdSelected: Int?): DetailMovieFragment {
            return DetailMovieFragment().apply {
                arguments = Bundle().apply {
                    if (movieIdSelected != null) {
                        putInt(MOVIE, movieIdSelected)
                    }
                }
            }
        }
    }

}