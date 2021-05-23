package com.abrar.moviecatalogue.tvshows.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowModel(
    val id: Long,
    val title: String,
    val desc: String,
    val poster: String?
):Parcelable