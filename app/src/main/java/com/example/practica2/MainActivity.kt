package com.example.practica2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica2.ui.theme.Practica2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica2Theme {
                MiAplicacion()
            }
        }
    }
}
@Composable
fun MiAplicacion(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Curso de Android",
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = "¡ITMA II paps!",
                color = Color.Blue
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Esta es una descripción de lo que estamos aprendiendo hoy."
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /* Aquí va la lógica */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Empezar ahora")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VistaPrevia() {
    Practica2Theme {
        MiAplicacion()
    }
}