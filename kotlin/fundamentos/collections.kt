package org.example.fundamentos

fun main() {

    var mapNomeIdade = mutableMapOf("Matheus" to 26,"Daniel" to 24)
    println(mapNomeIdade)

    mapNomeIdade["Bruno"] = 30

    println(mapNomeIdade)

    mapNomeIdade.remove("Bruno")

    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Bruno", 30) //adiciona valor apenas se não possuir o mesmo na lista

    println(mapNomeIdade)

    //var lista = mutableListOf(1,2,3,2)
    //println("Lista: $lista")

    //var setNumeros = mutableSetOf(1,2,3,2) //setOf não retorna valores duplicados

    //println("Set: $setNumeros")

    //println(setNumeros.contains(2))

    //println(lista)

    //lista.sort()

    //println(lista)

    //lista.shuffle()

    //println(lista)

    //var listaNomes = mutableListOf("Matheus","Gustavo")

    //println(listaNomes)

    //listaNomes.sort()

    //println(listaNomes)

    //lista.add(8)
    //lista.removeAt(0)
    //lista.remove(3)
    //lista[0] = 20

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


