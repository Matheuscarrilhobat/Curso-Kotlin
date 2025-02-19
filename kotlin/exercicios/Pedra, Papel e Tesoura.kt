package org.example.exercicios

import org.example.fundamentos.printapar1a10

fun main() {
    print("Pedra, Papel ou Tesoura?")
    var pla = readln()
    pla = pla.lowercase()
    var cho = mutableListOf("Pedra", "Papel", "Tesoura")
    var cpu = cho.random()
    if (pla == "pedra" && cpu == "Pedra") {
        println("Escolha da CPU:$cpu")
        println("Empate!")
    } else if (pla == "pedra" && cpu == "Papel") {
        println("Escolha da CPU:$cpu")
        println("Você Perdeu!")
    } else if (pla == "pedra" && cpu == "Tesoura") {
        println("Escolha da CPU:$cpu")
        println("Você Venceu!")
    } else if (pla == "papel" && cpu == "Pedra") {
        println("Escolha da CPU:$cpu")
        println("Você Venceu!")
    } else if (pla == "papel" && cpu == "Papel") {
        println("Escolha da CPU:$cpu")
        println("Empate!")
    } else if (pla == "papel" && cpu == "Tesoura") {
        println("Escolha da CPU:$cpu")
        println("Você Perdeu!")
    } else if (pla == "tesoura" && cpu == "Pedra") {
        println("Escolha da CPU:$cpu")
        println("Você Perdeu!")
    } else if (pla == "tesoura" && cpu == "Papel") {
        println("Escolha da CPU:$cpu")
        println("Você Venceu!")
    } else if (pla == "tesoura" && cpu == "Tesoura") {
        println("Escolha da CPU:$cpu")
        println("Empate!")
    } else {
        println("Escolha inválida!")
    }
}