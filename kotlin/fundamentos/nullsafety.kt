package org.example.fundamentos

fun main() {
    val nome: String? = null

    val nome2: String? = "Matheus"

    println(nome?.length)

    //mesma coisa q acima ^
    //if (nome != null) {
    //    println(nome.length)
    //}

    val toShort: Short = nome2!!.length.toShort()

    var tamanho: Int = nome2.length ?: 0
    println(tamanho)
    //operador elvis(?:) retorna o valor a sua direita caso o resultado a sua esquerda seja nulo

    var lista: List<Int?> = listOf(1, 2, null, 4)
    //lista não pode ser nula, mas pode ter itens nulos

    var listaNullable: List<Int>? = null
    //lista pode ser nula
}