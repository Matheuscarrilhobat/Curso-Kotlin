package org.example.exercicios

fun main() {
    print("Insira o Primeiro Número:")
    val n1 = readln().toInt()
    print("Insira o Segundo Número:")
    val n2 = readln().toInt()
    println("Escolha o Operador: Somar, Subtrair, Multiplicar, Dividir")
    val op = readln()

    if(op == "Somar" || op == "somar" || op == "+") {
        val tot = n1 + n2
        println("Total de $n1 + $n2 = $tot")
    } else if (op == "Subtrair" || op == "subtrair" || op == "-") {
        val tot = n1 - n2
        println("Total de $n1 - $n2 = $tot")
    } else if (op == "Multiplicar" || op == "multiplicar" || op == "*" || op == "x") {
        val tot = n1 * n2
        println("Total de $n1 x $n2 = $tot")
    } else if (op == "Dividir" || op == "dividir" || op == "/") {
        val tot = n1/n2
        val rest = n1%n2
        println("Total de $n1 / $n2 = $tot, Resto=$rest")
    }
}