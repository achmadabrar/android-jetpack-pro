package com.abrar.moviecatalogue.movies.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieModel(
    val id: String,
    val title: String,
    val desc: String,
    val poster: Int,
    val image_priview: String,
    val releaseDate: String,
    val genre: String,
    val duration: String,
    val userScore: String,
    val language: String,
    val director: String,
    val screenplay: String,
    val stories: String,
    val budget: String,
    val income: String,
    val status: String
) : Parcelable