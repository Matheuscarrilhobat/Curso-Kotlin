package org.example.fundamentos

class Pessoa(var nome:String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa, Nome: ${nome}, Idade: ${idade}"
    }
}

fun main() {
    var matheus = Pessoa("Matheus", 26)
    println(matheus)
}