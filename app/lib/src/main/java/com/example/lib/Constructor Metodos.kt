package com.example.lib
class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0

    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Se han depositado $cantidad. Nuevo saldo: $saldo")
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Se han retirado $cantidad. Saldo restante: $saldo")
        } else {
            println("Error: Saldo insuficiente para retirar $cantidad. Saldo actual: $saldo")
        }
    }

    fun mostrarSaldo() {
        println("El saldo actual de $titular es: $saldo")
    }
}

fun main() {
    val cuenta = CuentaBancaria("Antonio González")

    // Prueba 1: Depositar
    cuenta.depositar(1000.0)

    // Prueba 2: Retirar cantidad válida
    cuenta.retirar(400.0)

    // Prueba 3: Intento de retiro excediendo el saldo (Debe fallar)
    cuenta.retirar(500.0)

    cuenta.mostrarSaldo()
}