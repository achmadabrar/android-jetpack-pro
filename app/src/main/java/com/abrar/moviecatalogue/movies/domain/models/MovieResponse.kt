package com.abrar.moviecatalogue.movies.domain.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class MovieResponse (
    @SerializedName("poster_path")
    val posterPath: String,
    val id: Long,
    @SerializedName("backdrop_path")
    val backdropPath: String,
    val title: String?,
    @SerializedName("vote_average")
    val vote: Double,
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: Date?,
    @SerializedName("original_title")
    val titleDetail: String?
): Parcelable