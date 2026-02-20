package com.example.lib

// EJERCICIO 7: Contador de caracteres
// ========================================
// Dada una palabra, cuenta cuantas veces aparece cada vocal.
//
// Salida esperada:
// Palabra: "murcielago"
// a: 1
// e: 1
// i: 1
// o: 1
// u: 1

fun main() {
    val palabra = "murcielago"

    var a = 0
    var e = 0
    var i = 0
    var o = 0
    var u = 0

    // TODO: Recorre cada caracter de la palabra con un for
    // Usa when para incrementar el contador de la vocal correspondiente
    for (c in palabra.lowercase()) {
        when (c) {
            'a' -> a++
            'e' -> e++
            'i' -> i++
            'o' -> o++
            'u' -> u++
            // Completa las demas vocales
        }
    }

    println("Palabra: \"$palabra\"")
    println("a: $a")
    println("e: $e")
    println("i: $i")
    println("o: $o")
    println("u: $u")
}
