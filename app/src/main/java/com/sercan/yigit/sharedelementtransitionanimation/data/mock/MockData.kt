package com.sercan.yigit.sharedelementtransitionanimation.data.mock

import com.sercan.yigit.sharedelementtransitionanimation.R
import com.sercan.yigit.sharedelementtransitionanimation.data.model.Shoe

object MockData {

    val shoeList = listOf(
        Shoe(
            id = 1,
            name = "Air Max 1",
            size = "10.0",
            price = "150.0",
            description = "The Air Max 1 Description",
            ratings = 4.5f,
            image = R.drawable.shoe1
        ),
        Shoe(
            id = 2,
            name = "Air Max 2",
            size = "9.0",
            price = "180.0",
            description = "The Air Max 2 Description",
            ratings = 4.7f,
            image = R.drawable.shoe2
        ),
        Shoe(
            id = 3,
            name = "Air Max 3",
            size = "11.0",
            price = "110.0",
            description = "The Air Max 3 Description",
            ratings = 4.3f,
            image = R.drawable.shoe3
        ),
        Shoe(
            id = 4,
            name = "Air Max 4",
            size = "8.5",
            price = "130.0",
            description = "The Air Max 4 Description",
            ratings = 4.6f,
            image = R.drawable.shoe4
        ),
        Shoe(
            id = 5,
            name = "Air Max 5",
            size = "10.5",
            price = "160.0",
            description = "The Air Max 5 Description",
            ratings = 4.8f,
            image = R.drawable.shoe5
        )
    )

}