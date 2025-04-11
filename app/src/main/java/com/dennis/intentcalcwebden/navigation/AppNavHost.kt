package com.dennis.intentcalcwebden.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dennis.intentcalcwebden.ui.theme.screens.calc.Calc_Screen
import com.dennis.intentcalcwebden.ui.theme.screens.home.Home_Screen
import com.dennis.intentcalcwebden.ui.theme.screens.intend.Intent_Screen
import com.dennis.intentcalcwebden.ui.theme.screens.web.Web_Screen


@Composable


fun AppNavHost (modifier: Modifier=Modifier,


                navController:NavHostController= rememberNavController(),


                startDestination: String= ROUTE_HOME) {


    NavHost(
        navController = navController, modifier = modifier,


        startDestination = startDestination
    ) {


        //register home route


        composable(ROUTE_HOME) {


            Home_Screen(navController)


        }





        composable(ROUTE_CALC) {


            Calc_Screen(navController)


        }





        composable(ROUTE_WEB) {


            Web_Screen(navController)


        }



        composable(ROUTE_INTEND) {


            Intent_Screen(navController)


        }


    }
}

