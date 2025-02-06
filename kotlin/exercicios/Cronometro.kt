package org.example.exercicios

fun main() {
    print("Insira a quantidade de tempo no cronometro:")
    var temp = readln().toInt()
    var con = 0

    while (con <= temp) {
        println(con)
        Thread.sleep(1000)
        con++
    }
}