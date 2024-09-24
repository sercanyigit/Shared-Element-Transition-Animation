package com.sercan.yigit.sharedelementtransitionanimation.ui

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sercan.yigit.sharedelementtransitionanimation.data.model.Shoe

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.DetailScreen(
    args: Shoe,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement= Arrangement.Center
    ) {
        Text(
            text = args.name,
            fontSize = 40.sp,
            modifier = Modifier
                .sharedElement(
                    state = rememberSharedContentState(key = "name/${args.id}"),
                    animatedVisibilityScope = animatedVisibilityScope,
                    boundsTransform = { _, _ ->
                        tween(durationMillis = 500)
                    }
                )
        )
        Image(
            painter = painterResource(id = args.image),
            contentDescription = null,
            modifier = Modifier
                .aspectRatio(16 / 9f)
                .sharedElement(
                    state = rememberSharedContentState(key = "image/${args.id}"),
                    animatedVisibilityScope = animatedVisibilityScope,
                    boundsTransform = { _, _ ->
                        tween(durationMillis = 500)
                    }
                )
        )

        Spacer(modifier = Modifier.height(16.dp))

        DetailsText(
            id = args.id,
            text = args.description,
            animatedVisibilityScope = animatedVisibilityScope
        )
        DetailsText(
            id = args.id,
            text = args.ratings.toString(),
            animatedVisibilityScope = animatedVisibilityScope
        )
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.DetailsText(id: Int, text:String, animatedVisibilityScope: AnimatedVisibilityScope) {
    Text(
        text = text,
        modifier = Modifier
            .sharedElement(
                state = rememberSharedContentState(key = "${text}/${id}"),
                animatedVisibilityScope = animatedVisibilityScope,
                boundsTransform = { _, _ ->
                    tween(durationMillis = 500)
                }
            )
    )
}