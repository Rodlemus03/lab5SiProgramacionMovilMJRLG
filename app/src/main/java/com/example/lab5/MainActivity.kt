package com.example.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5.ui.theme.Lab5Theme

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon

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

data class Evento(val nombre: String, val descripcion: String)


val eventos = listOf(
    Evento("Bad bunny", "Reguetón"),
    Evento("Los tigres del norte", "Banda"),
    Evento("Shakira", "Pop"),
    Evento("Romeo Santos", "Bachata"),
    Evento("Adele", "Pop"),
    Evento("Taylor Swift", "Pop"),
    Evento("Ed Sheeran", "Pop"),
    Evento("Beyoncé", "R&B"),
    Evento("Drake", "Hip-Hop"),
    Evento("Billie Eilish", "Pop"),
    Evento("Coldplay", "Pop/Rock"),
    Evento("Bruno Mars", "Pop"),
    Evento("Ariana Grande", "Pop"),
    Evento("Justin Bieber", "Pop"),
    Evento("Katy Perry", "Pop"),
    Evento("Rihanna", "Pop/R&B"),
    Evento("The Weeknd", "R&B")
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun contenido() {
    LazyColumn{
        items(eventos){
            item ->ListItem(item)
        }
    }
}


@Composable
fun ListItem(Evento: Evento, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(8.dp)
            .background(Color.LightGray)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = Evento.nombre,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            // Agregar el icono de tres puntos
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = null, // Puedes proporcionar una descripción
                tint = Color.Black
            )
        }

        Spacer(modifier = modifier.height(8.dp))

        LazyRow {
            items(1) {
                    item ->
                Text(text = Evento.descripcion, color = Color.Black)
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
