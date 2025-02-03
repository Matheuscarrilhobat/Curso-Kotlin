package org.example.fundamentos

fun main() {
    var lista = mutableListOf(1,2,3,4,5,6)

    println(lista)

    lista.add(8)
    lista.removeAt(0)
    lista.remove(3)

    lista[0] = 20

    println(lista)



    //var pares = lista.filter{ it % 2 == 0}.first() //first retorna apenas o primeiro numero par
    //lista.forEach{
    //    println(it)
    //} // forEach retorna todos os numeros individualmente em uma lista
      // it sempre retorna o valor atual da variavel

    //println(lista[0])
    //println(lista.get(1))
    //println(lista.size)
   // println(lista.indexOf(6))

    }


