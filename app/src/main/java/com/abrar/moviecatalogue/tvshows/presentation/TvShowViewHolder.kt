package com.abrar.moviecatalogue.tvshows.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list_tv_show.view.imageViewMovie
import kotlinx.android.synthetic.main.item_list_tv_show.view.textViewTitle

class TvShowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(tvShowModel: TvShowModel, listener: Listener?) {
        with(itemView) {
            Glide.with(this)
                .load("https://image.tmdb.org/t/p/original/"+tvShowModel.poster)
                .into(imageViewMovie)
            textViewTitle.text = tvShowModel.title

            itemView.setOnClickListener {
                listener?.onClickTvShow(tvShowModel)
            }
        }
    }

    interface Listener {
        fun onClickTvShow(tvShowModel: TvShowModel?)
    }
}