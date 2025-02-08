package org.example.exercicios

fun main () {
    print("Insira a unidade inicial da temperatura:")
    var un = readln()
     un = un.lowercase()
    if (un == "celsius" || un == "c") {
        print("Insira a temperatura em Celsius:")
        val tmp = readln().toFloat()
        print("Insira a unidade que deseja converter para:")
        val un2 = readln().lowercase()
        if (un2 == "fahrenheit" || un2 == "f") {
            val tot = tmp * 1.8 + 32
            println("Valor em Fahrenheit: $tot")
        } else if (un2 == "kelvin" || un2 == "k") {
            val tot = tmp + 273.15
            println("Valor em Kelvin: $tot")
        } else {
            println("Unidade não reconhecida ou identica!")
        }
    } else if (un == "fahrenheit" || un == "f") {
        print("Insira a temperatura em Fahrenheit:")
        val tmp = readln().toFloat()
        print("Insira a unidade que deseja converter para:")
        val un2 = readln().lowercase()
        if (un2 == "celsius" || un2 == "c") {
            val tot = (tmp - 32)/1.8
            println("Valor em Celsius: $tot")
        } else if (un2 == "kelvin" || un2 == "k") {
            val tot = ((tmp - 32)/1.8) + 273.15
            println("Valor em Kelvin: $tot")
        } else {
            println("Unidade não reconhecida ou identica!")
        }
    } else if (un == "kelvin" || un == "k") {
        print("Insira a temperatura em Kelvin:")
        val tmp = readln().toFloat()
        print("Insira a unidade que deseja converter para:")
        val un2 = readln().lowercase()
        if (un2 == "celsius" || un2 == "c") {
            val tot = tmp - 273.15
            println("Valor em Celsius: $tot")
        } else if (un2 == "fahrenheit" || un2 == "f") {
            val tot = (tmp - 273.15) * 1.8 + 32
            println("Valor em Fahrenheit: $tot")
        } else {
            println("Unidade não reconhecida ou identica!")
        }
    }
}