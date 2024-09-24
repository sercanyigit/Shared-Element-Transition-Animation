package com.sercan.yigit.sharedelementtransitionanimation.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Shoe(
    val id: Int,
    val name: String,
    val size: String,
    val price: String,
    val description: String,
    val ratings: Float,
    val image: Int
)