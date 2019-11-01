package com.example.tapdemoapp.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class Source (val id: String,
                   val name: String
) : Parcelable