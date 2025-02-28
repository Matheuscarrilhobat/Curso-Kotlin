package org.example.exercicios

fun main() {
    print("Insira o número desejado:")
    var num = readln().toInt()
    var tab = 1
    do {
        var tot = num * tab
        println("$num vezes $tab = $tot")
        Thread.sleep(1000)
        tab++
    } while(tab <= 10)
}