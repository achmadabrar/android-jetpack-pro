package com.abrar.moviecatalogue.detailmovie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.abrar.moviecatalogue.R
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

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailMovieViewModel::class.java]

        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.title =
            resources.getString(R.string.Detail)


        arguments?.getString(MOVIE).let {
            viewModel.setMovieId(it!!)
        }

        Glide.with(this)
            .load(resources.getDrawable(viewModel.getDetailMovieById().poster))
            .into(image_poster_movie)

        text_title_movie.text = viewModel.getDetailMovieById().title
        text_desc_movie.text = viewModel.getDetailMovieById().desc
        text_release_genre_duration.text = resources.getString(
            R.string.release_genre_duration,
            viewModel.getDetailMovieById().releaseDate,
            viewModel.getDetailMovieById().genre,
            viewModel.getDetailMovieById().duration
        )
        text_status.text = resources.getString(R.string.status, viewModel.getDetailMovieById().status)
        text_budget.text = resources.getString(R.string.budget, viewModel.getDetailMovieById().budget)
        text_income.text = resources.getString(R.string.income, viewModel.getDetailMovieById().income)
        text_director.text = resources.getString(R.string.director, viewModel.getDetailMovieById().director)
        text_screenplay.text = resources.getString(R.string.screenplay, viewModel.getDetailMovieById().screenplay)
        text_stories.text = resources.getString(R.string.stories, viewModel.getDetailMovieById().stories)


    }


    companion object {
        fun newInstance(movieIdSelected: String?): DetailMovieFragment {
            return DetailMovieFragment().apply {
                arguments = Bundle().apply {
                    if (movieIdSelected != null) {
                        putString(MOVIE, movieIdSelected)
                    }
                }
            }
        }
    }

}