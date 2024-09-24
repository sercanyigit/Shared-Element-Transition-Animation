package com.sercan.yigit.sharedelementtransitionanimation.ui

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sercan.yigit.sharedelementtransitionanimation.data.mock.MockData
import com.sercan.yigit.sharedelementtransitionanimation.data.model.Shoe

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.ListScreen(
    animatedVisibilityScope: AnimatedVisibilityScope,
    onItemClick: (Shoe) -> Unit
) {
    val shoesList by remember { mutableStateOf(MockData.shoeList) }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            Text("Shoes List", modifier = Modifier.fillMaxSize().padding(20.dp), fontSize = 30.sp)
            HorizontalDivider(modifier = Modifier.fillMaxWidth())
        }
        itemsIndexed(shoesList) { index, shoe ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onItemClick(shoe)
                    }
            ) {
                Image(
                    painter = painterResource(id = shoe.image),
                    contentDescription = null,
                    modifier = Modifier
                        .aspectRatio(16 / 9f)
                        .weight(1f)
                        .sharedElement(
                            state = rememberSharedContentState(key = "image/${shoe.id}"),
                            animatedVisibilityScope = animatedVisibilityScope,
                            boundsTransform = { _, _ ->
                                tween(durationMillis = 500)
                            }
                        )
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = shoe.name,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .sharedElement(
                                state = rememberSharedContentState(key = "text/${shoe.id}"),
                                animatedVisibilityScope = animatedVisibilityScope,
                                boundsTransform = { _, _ ->
                                    tween(durationMillis = 500)
                                }
                            )
                    )
                    Text(
                        text = shoe.description,
                        modifier = Modifier
                            .sharedElement(
                                state = rememberSharedContentState(key = "description/${shoe.id}"),
                                animatedVisibilityScope = animatedVisibilityScope,
                                boundsTransform = { _, _ ->
                                    tween(durationMillis = 500)
                                }
                            )
                    )
                    Text(
                        text = shoe.ratings.toString(),
                        modifier = Modifier
                            .sharedElement(
                                state = rememberSharedContentState(key = "ratings/${shoe.id}"),
                                animatedVisibilityScope = animatedVisibilityScope,
                                boundsTransform = { _, _ ->
                                    tween(durationMillis = 500)
                                }
                            )
                    )
                }
            }
        }
    }
}