package com.abrar.moviecatalogue.movies.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.abrar.moviecatalogue.R
import com.abrar.moviecatalogue.detailmovie.DetailMovieFragment
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import kotlinx.android.synthetic.main.fragment_movies.*


class MoviesFragment : Fragment(), MoviesViewHolder.Listener {

    lateinit var adapter: MoviesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[MoviesViewModel::class.java]

        (activity as AppCompatActivity).setSupportActionBar(toolbar_main)
        (activity as AppCompatActivity).supportActionBar?.title =
            resources.getString(R.string.Movies)
        adapter = MoviesAdapter(viewModel.getMovies(), this)
        loadRecyclerView()
    }

    private fun loadRecyclerView() {
        recycler_movies.adapter = adapter
        recycler_movies.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    override fun onClickMovie(movieModel: MovieModel?) {
        Toast.makeText(requireContext(), "dipilih ${movieModel?.title}", Toast.LENGTH_SHORT).show()
        fragmentManager!!.beginTransaction()
            .replace(R.id.frame_layout, DetailMovieFragment.newInstance(movieModel?.id))
            .addToBackStack("movie").commit()
    }
}