package com.exampleproject.netclan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import androidx.compose.ui.graphics.Shape as Shape
import androidx.compose.ui.platform.LocalContext as LocalContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Refinepage(navController : NavController){
    Surface(modifier = Modifier.fillMaxSize()) {
        ElevatedCard(modifier = Modifier.padding(20.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp)) {
            Column {
                TopAppBar(modifier = Modifier
                    .background(Color(0xFF6650a4))
                    .shadow(elevation = 5.dp),
                    colors = TopAppBarDefaults.largeTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary),
                    title = {
                        Text("Refine")
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            navController.navigate("Explore")
                        }) {
                            Icon(Icons.Filled.ArrowBack, null)
                        }
                    }
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(color = Color(0xFF6650a4),
                text ="Select Your Availability")
            Spacer(modifier = Modifier.height(10.dp))

            val context = LocalContext.current
            val coffeeDrinks = arrayOf("Available | Hey Let Us Connect", "Away | Stay Discrete And Watch",
                "Busy | Do Not Disturb | Will Catch Up Later", "SOS | Emergency! Need Assistance! HELP")
            var expanded by remember { mutableStateOf(false) }
            var selectedText by remember { mutableStateOf(coffeeDrinks[0]) }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ) {
                ExposedDropdownMenuBox(
                    expanded = expanded,
                    onExpandedChange = {
                        expanded = !expanded
                    }
                ) {
                    OutlinedTextField(
                        value = selectedText,
                        onValueChange = {},
                        readOnly = true,
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                        modifier = Modifier.menuAnchor()
                    )

                    ExposedDropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        coffeeDrinks.forEach { item ->
                            DropdownMenuItem(
                                text = { Text(text = item) },
                                onClick = {
                                    selectedText = item
                                    expanded = false
                                    Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                                }
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Add Your Status",
                color = Color(0xFF6650a4),
            )

            Spacer(modifier = Modifier.height(5.dp))

            var status by remember { mutableStateOf("") }
            OutlinedTextField(modifier = Modifier,
                value = status,
                onValueChange = { status = it }
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Select Hyper local Distance",
                color = Color(0xFF6650a4),
            )
            Spacer(modifier = Modifier.height(10.dp))

            var sliderValue :Int by remember {
                mutableStateOf(4) // pass the initial value
            }

            Slider(
                value = sliderValue.toFloat(),
                onValueChange = { sliderValue_ ->
                    sliderValue = sliderValue_.toInt()
                },
                onValueChangeFinished = {
                    Log.d("MainActivity", "sliderValue = $sliderValue")
                },
                valueRange = 0f..100f

            )

            Text(text = sliderValue.toString())

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Select Purpose",
                color = Color(0xFF6650a4),
            )
            Row {
                var buttonColor by remember { mutableStateOf(Color.Gray) }
                var isClicked by remember { mutableStateOf(false) }

                Button(
                    onClick = {
                        isClicked = true
                        buttonColor = Color.Green // Change to the color you want when clicked
                        // Delay to reset the color after a short time (optional)
                    },
                    modifier = Modifier
                        .background(buttonColor)
                        .clickable { /* No-op, the click behavior is handled in the onClick lambda */ }
                ) {
                    Text(
                        text = if (isClicked) "Clicked!" else "Click me",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate("Explore")
            }) {
                Text(text = "Save and continue")

            }

        }
    }

}





