package org.example.exercicios

fun main() {
    print("Insira o valor em Reais:")
    val BRL = readln().toFloat()

    print("Insira a moeda desejada entre Dólar ou Euro:")
    val moe = readln()

    if (moe == "Dólar" || moe == "Dolar" || moe == "dolar" || moe == "dólar" || moe == "DOLAR" || moe == "DÓLAR") {
        val USD = BRL * 5.7991
        println("Valor em Dólar: $USD")
    } else if (moe == "Euro" || moe == "euro" || moe == "EURO") {
        val EUR = BRL * 6.0432
        println("Valor em Euro: $EUR")
    } else {
        println("Moeda não reconhecida")
    }
}