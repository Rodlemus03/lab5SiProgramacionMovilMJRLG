package com.example.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    contenido()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun contenido() {
    Column {
        TopAppBar(
            title = { Text(text = "TodoEventos") },
            actions = {
                IconButton(onClick = { /* TODO */ }) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Options")
                }
            }
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(2) { rowIndex ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {



                    repeat(2) { columnIndex ->
                        val index = rowIndex * 2 + columnIndex
                        if (index < 4) {

                            BotonCuadrado(nombre = "Concierto ${index + 1}",index)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BotonCuadrado(nombre: String,seleccion:Int) {
    Card(
        modifier = Modifier
            .size(185.dp)
            .clip(MaterialTheme.shapes.medium),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(text = nombre, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            if(seleccion==0){
                Image(

                    painter = painterResource(id = R.drawable.btr),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }else if(seleccion==1){
                Image(

                    painter = painterResource(id = R.drawable.bbb),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }else if(seleccion==2){
                Image(

                    painter = painterResource(id = R.drawable.bm),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            else if(seleccion==3){
                Image(

                    painter = painterResource(id = R.drawable.ltdn),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }





        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Lab5Theme {
        contenido()
    }
}
