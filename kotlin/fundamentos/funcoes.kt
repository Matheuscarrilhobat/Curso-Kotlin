package org.example.fundamentos

fun main() {
    dizOi(retornaNome())
}

fun retornaNome(): String {
   return "Matheus"
}

fun dizOi(nome: String, idade: Int = 26) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")

}