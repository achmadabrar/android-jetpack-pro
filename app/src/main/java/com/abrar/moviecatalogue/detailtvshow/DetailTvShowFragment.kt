package com.abrar.moviecatalogue.detailtvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.abrar.moviecatalogue.R
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail_tv_show.image_poster_movie
import kotlinx.android.synthetic.main.fragment_detail_tv_show.text_desc_movie
import kotlinx.android.synthetic.main.fragment_detail_tv_show.text_title_movie
import kotlinx.android.synthetic.main.fragment_detail_tv_show.toolbar

private const val TVSHOW = "tv_show"

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

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailTvShowViewModel::class.java]

        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.title =
            resources.getString(R.string.Detail)

        if (arguments?.getString(TVSHOW) != null) {

            arguments?.getString(TVSHOW).let {
                viewModel.setTvShowId(it!!)
            }
            Glide.with(this)
                .load(resources.getDrawable(viewModel.getDetailTvShowById().poster))
                .into(image_poster_movie)

            text_title_movie.text = viewModel.getDetailTvShowById().title
            text_desc_movie.text = viewModel.getDetailTvShowById().desc

        }
    }

    companion object {

        fun newInstance(idSelected: String?) =
            DetailTvShowFragment().apply {
                arguments = Bundle().apply {
                    putString(TVSHOW, idSelected)
                }
            }
    }
}