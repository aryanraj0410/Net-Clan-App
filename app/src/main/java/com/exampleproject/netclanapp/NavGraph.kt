package com.exampleproject.netclanapp

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.exampleproject.netclan.Explorepage
import com.exampleproject.netclan.Refinepage

@SuppressLint("SuspiciousIndentation")
@Composable
fun Nav(){
 val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Explore"){
        composable(route = "Explore"){
            Explorepage(navController)
        }
        composable(route = "Refine"){
            Refinepage(navController)
        }

    }
}