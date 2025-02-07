package org.example.exercicios

import java.util.*
import kotlin.streams.asSequence

fun main() {
    print("Insira o numero de caracteres do Password:")
    val tam = readln().toInt()
    val passgen = UUID.randomUUID().toString().substring(0, tam)

    println("Password gerado: $passgen")
}