package com.example.lib

fun main() {
    val numeros = listOf(1,12,32,4,5,6,74,8,9,140) //val no cambia valor
    val numeroquecambia = mutableListOf<Int>()
    numeroquecambia.add(2)
    numeroquecambia.add(3)
    var numeromax = numeros[0]                      // var cambia su valor
    for(n in numeros){  //agarra los numeros de toda la lista
        if(n > numeromax){
            numeromax = n
        }
    }
    println(numeromax)
    val palindromo = "anita lava la tina"
    for(letra in palindromo){
        println(letra)
    }
}