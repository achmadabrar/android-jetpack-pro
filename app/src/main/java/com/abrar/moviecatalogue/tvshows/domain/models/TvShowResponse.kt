package com.abrar.moviecatalogue.tvshows.domain.models

import com.google.gson.annotations.SerializedName
import java.util.*

data class TvShowResponse (
    @SerializedName("poster_path")
    val posterPath: String,
    val id: Long,
    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("original_name")
    val title: String?,
    @SerializedName("vote_average")
    val vote: Double,
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: Date,
    @SerializedName("original_title")
    val titleDetail: String?
)