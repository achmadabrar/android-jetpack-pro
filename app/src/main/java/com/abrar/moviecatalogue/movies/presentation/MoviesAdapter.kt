package com.abrar.moviecatalogue.movies.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abrar.moviecatalogue.R
import com.abrar.moviecatalogue.movies.domain.models.MovieModel

class MoviesAdapter(
    var listMovie: List<MovieModel>?,
    val listener: MoviesViewHolder.Listener
) : RecyclerView.Adapter<MoviesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {

        return MoviesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_movie, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        listMovie?.get(position).let {
            holder.bind(it!!, listener)
        }
    }

    override fun getItemCount(): Int {
        return listMovie?.size!!
    }
}