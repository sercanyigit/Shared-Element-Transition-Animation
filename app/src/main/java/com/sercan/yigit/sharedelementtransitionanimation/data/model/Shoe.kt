package com.sercan.yigit.sharedelementtransitionanimation.data.model

import androidx.compose.ui.graphics.Color

data class Shoe(
    val id: Int,
    val name: String,
    val color: Color,
    val details: ShoesDetails,
    val image: Int
)