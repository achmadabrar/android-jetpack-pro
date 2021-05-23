package com.abrar.moviecatalogue.tvshows.detailtvshow

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
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail_tv_show.*

private const val TVSHOW = "idTvShow"

class DetailTvShowFragment : Fragment() {

    lateinit var tvShow: TvShowModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_tv_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = ViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(
            this,
            factory
        )[DetailTvShowViewModel::class.java]

        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.title =
            resources.getString(R.string.Detail)

        if (arguments?.getInt(TVSHOW) != null) {

            arguments?.getInt(TVSHOW).let {
                viewModel.getTvShowDetail(it!!).observe(viewLifecycleOwner, Observer {
                    Glide.with(this)
                    .load("https://image.tmdb.org/t/p/original"+it.poster)
                    .into(image_poster_movie)

                    text_title_tvshow.text = it.title
                    text_desc_tvshow.text = it.desc
                })
            }
        }
    }

    companion object {

        fun newInstance(idSelected: Int?) =
            DetailTvShowFragment().apply {
                arguments = Bundle().apply {
                    putInt(TVSHOW, idSelected!!)
                }
            }
    }
}