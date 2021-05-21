package com.abrar.moviecatalogue.tvshows.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abrar.moviecatalogue.R
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel

class TvShowAdapter(
    var listTvShow: List<TvShowModel>?,
    val listener: TvShowViewHolder.Listener
) : RecyclerView.Adapter<TvShowViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {

        return TvShowViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_tv_show, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        listTvShow?.get(position).let {
            holder.bind(it!!, listener)
        }
    }

    override fun getItemCount(): Int {
        return listTvShow?.size!!
    }
}