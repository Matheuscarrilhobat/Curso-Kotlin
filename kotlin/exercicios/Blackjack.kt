package org.example.exercicios

fun main() {
    var cpu = (2 .. 11).random()
    cpu += (2 .. 11).random()
    var pla = (2 .. 11).random()
    println("Valor da 1 carta:$pla")
    var pla2 = (2 .. 11).random()
    println("Valor da 2 carta:$pla2")
    var tot = pla + pla2
    println("Total:$tot")
    do {
    print("Hit ou Stand?")
    var cho = readln()
    cho = cho.lowercase()
        if (cho == "hit") {
            tot += (2 .. 11).random()
            println("Novo total:$tot")
            if (tot > 21) {
                println("BUST!")
                System.exit(0)
            }
        } else if (cho != "stand") {
            println("Comando não reconhecido!")
        }
    } while(cho != "stand")
    println("Valor da CPU:$cpu")
    while(cpu <= tot) {
        cpu += (2 .. 11).random()
        println("Valor da CPU:$cpu")
        if (cpu > 21) {
            println("CPU BUST! Você Venceu!")
        }
        Thread.sleep(1000)
    }
    if (cpu > tot && cpu <= 21) {
        println("Você Perdeu!")
    }


}