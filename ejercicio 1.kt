package com.example.lib

// EJERCICIO 1: Variables y Tipos de Datos
// ==========================================
// Declara las siguientes variables con los valores indicados:
// - nombre: "Carlos" (String)
// - edad: 21 (Int)
// - estatura: 1.78 (Double)
// - esEstudiante: true (Boolean)
//
// Imprime un mensaje que diga:
// "Me llamo Carlos, tengo 21 años, mido 1.78m y es true que soy estudiante."
// Usa string templates ($variable) para construir el mensaje.

fun main() {
    val nombre: String = "Antonio"
    val edad: Int = 20
    val estatura: Double = 1.80
    val esEstudiante: Boolean = true

    println("Me llamo $nombre, tengo $edad anos, mido $estatura metros y es $esEstudiante que soy estudiante")
    // TODO: Usa println con string templates para imprimir el mensaje
}
