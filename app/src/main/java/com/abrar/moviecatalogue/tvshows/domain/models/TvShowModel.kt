package com.abrar.moviecatalogue.tvshows.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowModel(
    val id: String,
    val title: String,
    val desc: String,
    val poster: Int
):Parcelable