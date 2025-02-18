package org.example.exercicios

fun  main() {
    val lis = mutableListOf("")
    lis.removeFirst()
    var con = 1
    print("d4- Dado com 4 lados\n" +
          "d6- Dado com 6 lados\n" +
            "d8- Dado com 8 lados\n" +
            "d10- Dado com 10 lados\n" +
            "d12- Dado com 12 lados\n" +
            "d20- Dado com 20 lados\n" +
            "d100- Dado com 100 lados\n" +
            "Digite qualquer outra coisa para sair\n" +
            "Escolha um Dado:")
    val cho = readln()
    if (cho == "d4") {
        print("Insira o número de dados d4:")
        val dad = readln().toInt()
        do {
            val num = (1 .. 4).random()
            lis.add(num.toString())
            con++
        } while (con <= dad)
        println(lis)
    } else if (cho == "d6") {
       print("Insira o número de dados d6:")
       val dad = readln().toInt()
       do {
           val num = (1 .. 6).random()
           lis.add(num.toString())
           con++
       } while (con <= dad)
       println(lis)
    } else if (cho == "d8") {
        print("Insira o número de dados d8:")
        val dad = readln().toInt()
        do {
            val num = (1 .. 8).random()
            lis.add(num.toString())
            con++
        } while (con <= dad)
        println(lis)
    } else if (cho == "d10") {
        print("Insira o número de dados d10:")
        val dad = readln().toInt()
        do {
            val num = (1 .. 10).random()
            lis.add(num.toString())
            con++
        } while (con <= dad)
        println(lis)
    } else if (cho == "d12") {
        print("Insira o número de dados d12:")
        val dad = readln().toInt()
        do {
            val num = (1 .. 12).random()
            lis.add(num.toString())
            con++
        } while (con <= dad)
        println(lis)
    } else if (cho == "d20") {
        print("Insira o número de dados d20:")
        val dad = readln().toInt()
        do {
            val num = (1..20).random()
            lis.add(num.toString())
            con++
        } while (con <= dad)
        println(lis)
    } else if (cho == "d100") {
        print("Insira o número de dados d100:")
        val dad = readln().toInt()
        do {
            val num = (1..100).random()
            lis.add(num.toString())
            con++
        } while (con <= dad)
        println(lis)
    } else {
        print("Terminando")
        Thread.sleep(1000)
        print(".")
        Thread.sleep(1000)
        print(".")
        Thread.sleep(1000)
        print(".")
    }
}