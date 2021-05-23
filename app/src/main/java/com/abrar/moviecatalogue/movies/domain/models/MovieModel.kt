package com.abrar.moviecatalogue.movies.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class MovieModel(
    val id: Long,
    val title: String,
    val desc: String,
    val poster: String,
    val image_preview: String,
    val releaseDate: Date?,
    val genre: String?,
    val duration: String?,
    val userScore: Double,
    val language: String?,
    val director: String?,
    val screenplay: String?,
    val stories: String?,
    val budget: String?,
    val income: String?,
    val status: String?
) : Parcelable