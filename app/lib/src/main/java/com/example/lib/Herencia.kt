package com.example.lib
open class Animal (val nombre: String, val edad: Int) {
    open fun hacerSonido () {
        println ("Sonido generico.")
    }

    fun describirse () {
        println ("Soy un $nombre, y tengo $edad años.")
    }
}

class Perro (nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println ("Guau!!!!")
    }
}

class Gato (nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println ("Miau!!!")
    }
}

class Vaca (nombre: String, edad: Int) : Animal (nombre, edad) {
    override fun hacerSonido() {
        println (" Waaaaa!!!!")
    }
}

fun main () {
    val perro  = Perro ("Max" , 3)
    val gato = Gato ("Felino", 8)
    val perico = Vaca ("Manchas" , 2)


    perro.describirse()
    perro.hacerSonido()
    println ("----------")

    gato.describirse()
    gato.hacerSonido()
    println ("----------")

    perico.describirse()
    perico.hacerSonido()

}