package com.aistudioapp.dayswithoutbadhabits.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aistudioapp.dayswithoutbadhabits.android.ui.theme.Days_without_bad_habitsTheme
import com.aistudioapp.dayswithoutbadhabits.app.DaysWithoutBadHabitsViewModel
import org.koin.androidx.compose.get

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    Greeting( )
        }
    }
}

@Composable
fun CountDay(dayCount:String){
    Text(text = dayCount, color = Color.Blue)
}

@Composable
fun Greeting(vm:DaysWithoutBadHabitsViewModel = get()) {
    val day: String by vm.dayCount.collectAsState()

    val days = remember { mutableStateOf("0" )}
   Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
       days.value = day
       CountDay(dayCount = days.value)
       Button(onClick = {
           vm.startDay()
       },

       ) {

           Text(text = "Start", color = Color.White)
       }
       Button(onClick = {
           vm.deleteDayCount()

       },) {

           Text(text = "Stop", color = Color.White)
       }
   }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Days_without_bad_habitsTheme {
    }
}