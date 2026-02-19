package com.example.lib

fun main (){

    //comentar ctrl k + ctrl c
    //comentar ctrl k + ctrl u



    //variables inmutables
    val name : String = "juan"


//variable mutable
    var age : Int? = null
    age = 20


// Tipos de datos: int, string, double, float, char, array, bpplean
    val isOld : Boolean = false
    val height : Double = 1.65
    //string interpolation
    println("El nombre es: $name, con edad $age y altura $height m")
    println(name + " " + age + " " + height)
    println(age)
    println(height)

    if(age > 18){
        println("es mayor")
    }
    else {
        println("morrito")
    }

//ciclos con for

    for(i in 0..10){
        println(i)
    }

    //ciclo for para abajo
    for(i in 10 downTo 0){
        println(i)
    }

    //ciclo for para abajo de dos en dos
    for(i in 10 downTo 0 step 2){
        println(i)
    }


    //switch - case
    val dayOfWeek = 4
    when(dayOfWeek){
        1 -> println("lunes")
        2 -> println("martes")
        6, 7 -> println("fin de semana")
        else -> println("es un dia cualquiera")

    }

    //escribir un programa que calcule el area de un rectangulo, donde el usuario proporcione
    //la base y altura y se muestre en pantalla el resultado



    //kotlin es un lenguaje null safety (significa que no se le puede poner mas
    // informacion a la derecha) en dicho caso agregar el ? para seguir poniendo y parar

//    val base : Double = 0.0
//    val height2 : Double = 0.0
//
//    println("digita la base del rectangulo")
//    val baseInput = readlnOrNull()
//    val baseAuxiliar = baseInput?.toDoubleOrNull() //todouble al agregar palabra rompe, y si se le pone toDoubleOrNull solo dirá null
//    println(baseInput)
//
//

    //operador Elvis ?: para poner datos de izquierda o derecha, si no es un valo nulo
    //pone el de la izquierda, si es un valor nulo, escribe la derecha (valor mencionado ahi mismo)

    var base : Double? = 0.0
    var height2 : Double? = 0.0

    println("digita la base del rectangulo")
    val baseInput = readlnOrNull()
    base = baseInput?.toDoubleOrNull() ?: 0.0
    println("digita la altura del rectangulo")
    val height2Input = readlnOrNull()
    height2 = height2Input?.toDoubleOrNull() ?: 0.0//todouble al agregar palabra rompe, y si se le pone toDoubleOrNull solo dirá null
    val area = base * height2
    println("el area es: $area") //signo $ para mandar a llamar a imprimir area
    if(area == 0.0){
        println("escribe un dato correcto")
        }




}

class MyClass {
}