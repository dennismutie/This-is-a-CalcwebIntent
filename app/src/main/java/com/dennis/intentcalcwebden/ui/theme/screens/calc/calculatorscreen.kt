package com.dennis.intentcalcwebden.ui.theme.screens.calc





import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable


fun Calc_Screen(navController: NavController) {


    var firstnum by remember { mutableStateOf(TextFieldValue(""))}


    var secondnum by remember { mutableStateOf(TextFieldValue(""))}


    var  text by remember { mutableStateOf("")}


    Column (verticalArrangement = Arrangement.Top,


        horizontalAlignment = Alignment.CenterHorizontally,


        modifier = Modifier


            .fillMaxSize()


            .padding(16.dp)


            .background(color = Color.White)){


        Text("Answer",


            fontSize = 30.sp,


            color = Color.Green,


            fontFamily = FontFamily.Cursive


        )


        Spacer(modifier= Modifier.height(30.dp))


        OutlinedTextField(value = firstnum,


            onValueChange = {firstnum=it},


            label = {Text("Enter First NO",


                fontSize = 30.sp,


                fontFamily = FontFamily.Monospace,


                color = Color.Blue)},


            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)


        )


        Spacer(modifier= Modifier.height(15.dp))


        OutlinedTextField(value = secondnum,


            onValueChange = {secondnum=it},


            label = {Text("Enter Second NO",


                fontSize = 30.sp)},


            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)


        )


        Spacer(modifier= Modifier.height(15.dp))


        Button(onClick ={/*TODO*/},


            modifier = Modifier.width(300.dp),


            colors = ButtonDefaults.buttonColors(),


            shape = RoundedCornerShape(16.dp))


        {


            Text("+",


                fontSize = 30.sp,


                color = Color.Blue


            )


        }


    }


}





@Preview





@Composable





private fun Calc_prev() {





    Calc_Screen(rememberNavController())}

