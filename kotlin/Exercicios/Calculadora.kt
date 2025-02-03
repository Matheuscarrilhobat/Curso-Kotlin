package org.example.Exercicios

fun main() {
    print("Insira o Primeiro Número:")
    var n1 = readln().toInt()
    print("Insira o Segundo Número:")
    var n2 = readln().toInt()
    println("Escolha o Operador: Somar, Subtrair, Multiplicar, Dividir")
    var op = readln()

    if(op == "Somar" || op == "somar" || op == "+") {
        var tot = n1 + n2
        println("Total de $n1 + $n2 = $tot")
    } else if (op == "Subtrair" || op == "subtrair" || op == "-") {
        var tot = n1 - n2
        println("Total de $n1 - $n2 = $tot")
    } else if (op == "Multiplicar" || op == "multiplicar" || op == "*" || op == "x") {
        var tot = n1 * n2
        println("Total de $n1 x $n2 = $tot")
    } else if (op == "Dividir" || op == "dividir" || op == "/") {
        var tot = n1/n2
        var rest = n1%n2
        println("Total de $n1 / $n2 = $tot, Resto=$rest")
    }
}