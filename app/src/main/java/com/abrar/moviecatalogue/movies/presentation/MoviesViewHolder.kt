package com.abrar.moviecatalogue.movies.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.abrar.moviecatalogue.movies.domain.models.MovieModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list_movie.view.*

class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(movieModel: MovieModel, listener: Listener?) {
        with(itemView) {

            Glide.with(this)
                .load("https://image.tmdb.org/t/p/original"+movieModel.image_preview)
                .into(imageViewMovie)

            textViewTitle.text = movieModel.title
            textViewDesc.text = movieModel.desc

            itemView.setOnClickListener {
                listener?.onClickMovie(movieModel)
            }
        }
    }

    interface Listener {
        fun onClickMovie(movieModel: MovieModel?)
    }
}