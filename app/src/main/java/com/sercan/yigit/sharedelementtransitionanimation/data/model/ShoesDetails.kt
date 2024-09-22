package com.sercan.yigit.sharedelementtransitionanimation.data.model

import androidx.compose.ui.graphics.Color

data class ShoesDetails(
    val size: Double,
    val price: Double,
    val description: String,
    val availableColors: List<Color>,
    val ratings: Float
)