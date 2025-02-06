package org.example.exercicios

fun main() {

    var lis = mutableListOf("")
    var ite: String? = null
    lis.removeFirst()
     do {
        print("Insira os Items para serem adicionados a lista(digite X para terminar):")
        ite = readln()
        lis.add(ite)
        lis = lis.distinct().toMutableList()
    } while(ite != "x" && ite != "X")
    lis.removeLast()
    println("Lista final: $lis")
}