package com.exampleproject.netclan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.exampleproject.netclanapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explorepage(navController:NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {

            TopAppBar(
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(all = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text("Howdy Aryan Raj", fontSize = 17.sp)
                            Row {
                                Icon(Icons.Filled.LocationOn, null)
                                Text("Location")
                            }
                        }
                        IconButton(onClick = {
                            navController.navigate("Refine")
                        }) {
                            Icon(
                                imageVector = Icons.Filled.AddCircle,
                                contentDescription = "Refine"
                            )
                        }

                    }


                },
                navigationIcon = {
                    IconButton(onClick = {/* Do Something*/ }) {
                        Icon(Icons.Filled.Menu, null)
                    }
                }
            )




            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                var text by remember { mutableStateOf("") }
                OutlinedTextField(
                    modifier = Modifier.padding(10.dp),
                    value = text, onValueChange = { text = it },
                    label = { Text(text = " \uD83D\uDD0D Search") },
                )

                Image(painter = painterResource(id = R.drawable.filter_control_adjustment_icon_on_white_background_free_vector), contentDescription =null,
                    modifier = Modifier
                        .height(80.dp)
                        .width(50.dp)
                        .padding(top = 20.dp),
                    Alignment.Center)

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier.verticalScroll(rememberScrollState()),
            )
            {
                Column(modifier = Modifier.padding(start = 78.dp)) {
//CARD 1
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Aryan Raj", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Bokaro | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 100 m")

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship", fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )


                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 2
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Arpan Dubey", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Oria | Student Intern    ")
                                Text(text = "Within 100 km")

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Dating",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )


                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 3
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Dheeraj S", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Chennai | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 1200 km")

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 4
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Ayush Singh", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Banglore | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 1900 km")

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 5
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Aryan Raj", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Bokaro | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 100 m")
                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 6
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Aryan Raj", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Bokaro | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 100 m")

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 7
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Aryan Raj", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Bokaro | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 100 m")

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 8
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Aryan Raj", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Bokaro | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 100 m")
                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 9
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Aryan Raj", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Bokaro | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 100 m")

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )


                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 10
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {

                            Column(modifier = Modifier.padding(start = 60.dp, top = 40.dp)) {
                                Text(text = "Aryan Raj", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color =Color(0xFF6650a4))

                                Text(text = "Bokaro | Student Intern",color =Color(0xFF6650a4))
                                Text(text = "Within 100 m")

                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, "Small floating action button.")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Coffee | Business | Friendship",fontWeight = FontWeight.Bold)
                        Text(
                            text = "Hi community! I am open to new connections \uD83D\uDE0A",
                            fontSize = 13.sp
                        )


                    }

                }
                Box(modifier = Modifier.fillMaxSize())
                {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(110.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.defaultsdv),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        repeat(9) {
                            Spacer(modifier = Modifier.height(90.dp))
                            Card(
                                modifier = Modifier
                                    .height(110.dp)
                                    .width(120.dp)
                                    .padding(start = 20.dp),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 10.dp
                                )
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.defaultsdv),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize()
                                )

                            }
                        }
                    }

                }
            }
        }
    }
}


