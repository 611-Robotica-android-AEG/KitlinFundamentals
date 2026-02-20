package com.example.lib

// EJERCICIO 6: Separar pares e impares
// ========================================
// Dada una lista de numeros, separa los pares y los impares
// en dos listas diferentes e imprime ambas.
//
// Salida esperada:
// Pares: [4, 12, 8, 22, 6]
// Impares: [7, 15, 3, 11, 9]

fun main() {
    val numeros = listOf(4, 7, 12, 15, 8, 3, 22, 11, 6, 9)

    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()

    // TODO: Recorre la lista y agrega cada numero a pares o impares segun corresponda
    for (num in numeros) {
        if (num % 2 == 0) {
            pares.add(num)
        } else {
            impares.add(num)
        }
        // Usa num % 2 para determinar si es par o impar
        // Usa .add() para agregar a la lista correspondiente
    }

    println("Pares: $pares")
    println("Impares: $impares")
}
