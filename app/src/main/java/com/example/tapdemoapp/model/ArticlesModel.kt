package com.example.tapdemoapp.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class ArticlesModel (val status: String,
                     val totalResults: Int,
                     val articles: List<News>

) : Parcelable