package com.sercan.yigit.sharedelementtransitionanimation.data.mock

import androidx.compose.ui.graphics.Color
import com.sercan.yigit.sharedelementtransitionanimation.R
import com.sercan.yigit.sharedelementtransitionanimation.data.model.Shoe
import com.sercan.yigit.sharedelementtransitionanimation.data.model.ShoesDetails

object MockData {

    val shoeList = listOf(
        Shoe(
            id = 1,
            name = "Air Max 1",
            color = Color(0xFF1D3557),
            details = ShoesDetails(
                size = 10.0,
                price = 150.0,
                description = "The Air Max 1 Description",
                availableColors = listOf(Color(0xFFE63946), Color(0xFF457B9D), Color(0xFFA8DADC)),
                ratings = 4.5f
            ),
            image = R.drawable.shoe1
        ),
        Shoe(
            id = 2,
            name = "Air Max 2",
            color = Color(0xFFFF9100),
            details = ShoesDetails(
                size = 9.0,
                price = 180.0,
                description = "The Air Max 2 Description",
                availableColors = listOf(Color(0xFF1D3557), Color(0xFFF1FAEE), Color(0xFF2A9D8F)),
                ratings = 4.7f
            ),
            image = R.drawable.shoe2
        ),
        Shoe(
            id = 3,
            name = "Air Max 3",
            color = Color(0xFF2A9D8F),
            details = ShoesDetails(
                size = 11.0,
                price = 110.0,
                description = "The Air Max 3 Description",
                availableColors = listOf(Color(0xFF2A9D8F), Color(0xFFE9C46A), Color(0xFF264653)),
                ratings = 4.3f
            ),
            image = R.drawable.shoe3
        ),
        Shoe(
            id = 4,
            name = "Air Max 4",
            color = Color(0xFFF4A261),
            details = ShoesDetails(
                size = 8.5,
                price = 130.0,
                description = "The Air Max 4 Description",
                availableColors = listOf(Color(0xFFF4A261), Color(0xFF264653), Color(0xFF2A9D8F)),
                ratings = 4.6f
            ),
            image = R.drawable.shoe4
        ),
        Shoe(
            id = 5,
            name = "Air Max 5",
            color = Color(0xFF023047),
            details = ShoesDetails(
                size = 10.5,
                price = 160.0,
                description = "The Air Max 5 Description",
                availableColors = listOf(Color(0xFF023047), Color(0xFF8ECAE6), Color(0xFFFB8500)),
                ratings = 4.8f
            ),
            image = R.drawable.shoe5
        )
    )

}