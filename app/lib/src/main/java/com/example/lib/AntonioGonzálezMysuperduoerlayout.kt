package com.example.mysuperduperlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mysuperduperlayout.ui.theme.MysuperduperlayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MysuperduperlayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Referencia actualizada a ExamenProgramacion
                    ExamenProgramacion(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ExamenProgramacion(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        // Encabezado
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Cyan),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Encabezado",
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }

        // Fila de Cajas (Amarilla y Verde)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Yellow),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "BOX 1")
                Button(onClick = {}) {
                    Text(text = "Presiona Aquí")
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "BOX 2")
                Button(onClick = {}) {
                    Text(text = "Presiona Aquí")
                }
            }
        }

        // Título de la lista (Texto grande 24sp)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(horizontal = 10.dp, vertical = 8.dp)
        ) {
            Text(
                text = "Lista de elementos",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }

        // Lista de elementos (LazyColumn)
        val elementos = listOf(
            "Sushi", "KFC", "Papas", "Coca Cola"
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.LightGray)
                .padding(10.dp)
        ) {
            items(elementos) { elemento ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                        .background(Color.Gray)
                        .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Icono de Lista según tu imagen
                    Icon(
                        imageVector = Icons.Default.List,
                        contentDescription = "Lista",
                        modifier = Modifier.padding(end = 12.dp)
                    )
                    Text(text = elemento)
                }
            }
        }

        // Pie de página
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Magenta),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Pie de pagina",
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MysuperduperlayoutTheme {
        // Referencia actualizada en el Preview
        ExamenProgramacion()
    }
}