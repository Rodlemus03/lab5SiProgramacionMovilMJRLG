package com.example.lab5
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5.ui.theme.Lab5Theme

class vista3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                ConcertDetailScreen("Bad bunny",
                    "El conejo malo viene a guatemala! no te pierdas al rey del trap y el regueton, con un buen ambiente y amigos",
                    "24/07/2023")
            }
        }
    }
}

@Composable
fun ConcertDetailScreen(
    concertTitle: String,
    concertDescription: String,
    concertDate: String,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bbb),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White)
                .padding(16.dp)
        ) {
            Text(
                text = concertTitle,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Fecha: $concertDate",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = concertDescription,
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewConcertScreen() {
    ConcertDetailScreen("Bad bunny",
        "El conejo malo viene a guatemala! no te pierdas al rey del trap y el regueton, con un buen ambiente y amigos",
        "24/07/2023")
}
