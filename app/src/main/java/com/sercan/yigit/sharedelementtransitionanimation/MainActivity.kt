package com.sercan.yigit.sharedelementtransitionanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.sercan.yigit.sharedelementtransitionanimation.data.model.Shoe
import com.sercan.yigit.sharedelementtransitionanimation.ui.DetailScreen
import com.sercan.yigit.sharedelementtransitionanimation.ui.ListScreen
import com.sercan.yigit.sharedelementtransitionanimation.ui.theme.SharedElementTransitionAnimationTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalSharedTransitionApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SharedElementTransitionAnimationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    SharedTransitionLayout {
                        NavHost(
                            navController = navController,
                            startDestination = HomeScreen
                        ) {
                            composable<HomeScreen> {
                                ListScreen(
                                    onItemClick = { shoe ->
                                        navController.navigate(shoe)
                                    },
                                    animatedVisibilityScope = this
                                )
                            }
                            composable<Shoe>{
                                val args = it.toRoute<Shoe>()
                                DetailScreen(
                                    args = args,
                                    animatedVisibilityScope = this
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Serializable
object HomeScreen