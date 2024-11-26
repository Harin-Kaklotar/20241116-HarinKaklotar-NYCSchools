package com.example.a20241116_harinkaklotar_nycschools.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/// for demo purpose I am using this much data only
@Parcelize
data class School(
    val school_name: String,
    val phone_number: String,
    val school_email: String,
    val city: String
): Parcelable
