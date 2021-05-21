package com.abrar.moviecatalogue.tvshows.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.abrar.moviecatalogue.R
import com.abrar.moviecatalogue.detailtvshow.DetailTvShowFragment
import com.abrar.moviecatalogue.tvshows.domain.models.TvShowModel
import kotlinx.android.synthetic.main.fragment_tv_shows.*


class TvShowsFragment : Fragment(), TvShowViewHolder.Listener {

    lateinit var adapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_shows, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[TvShowViewModel::class.java]

        adapter = TvShowAdapter(viewModel.getTvShow(), this)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.title =
            resources.getString(R.string.TvShows)
        loadRecyclerView()
    }

    private fun loadRecyclerView() {
        recycler_tv_show.adapter = adapter
        recycler_tv_show.layoutManager =
            LinearLayoutManager(requireContext(), GridLayoutManager.VERTICAL, false)
    }


    override fun onClickTvShow(tvShowModel: TvShowModel?) {
        Toast.makeText(requireContext(), "dipilih ${tvShowModel?.title}", Toast.LENGTH_SHORT).show()
        fragmentManager!!.beginTransaction()
            .replace(R.id.frame_layout, DetailTvShowFragment.newInstance(tvShowModel?.id))
            .addToBackStack("tvShow").commit()
    }
}