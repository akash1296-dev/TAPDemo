package com.example.tapdemoapp.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class News(val source: Source,
                val author: String,
                val title: String,
                val urlToImage: String,
                val description: String
                ) : Parcelable