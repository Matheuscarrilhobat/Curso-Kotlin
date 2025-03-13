package org.example.exercicios

fun main() {
    print("Digite um Número:")
    val num = readln().toInt()
    var fat = num - 1
    var tot = num * fat
    while(fat > 1)  {
        fat--
        tot *= fat
    }
    print("Resultado do fatorial de $num = $tot")
}