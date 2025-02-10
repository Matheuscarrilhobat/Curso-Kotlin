package org.example.exercicios

fun main() {
    print("Digite uma palavra:")
    var plv = readln()
    var lwc = plv.lowercase()
    var spl = lwc.split("").toMutableList()
    spl.removeFirst()
    spl.removeLast()
    var con = 0
    var tam = spl.size

    spl.removeAll(listOf("b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","w","x","y","z"))

    println("Vogais Presentes: $spl")
}