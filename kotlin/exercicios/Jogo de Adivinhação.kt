package org.example.exercicios

fun main(){
    var rnd = (1..100).random()
    print("Tente adivinhar o numero entre 1 e 100 que estou pensando:")
    var num = readln().toInt()

    do  {
        if (num in 1..100) {
            if (num > rnd) {
                print("Número Incorreto! O número correto é MENOR que o fornecido! Tente Novamente:")
                num = readln().toInt()
            } else if (num < rnd) {
                print("Número Incorreto! O número correto é MAIOR que o fornecido! Tente Novamente:")
                num = readln().toInt()
            }
        } else {
            print("Número Invalido! Por favor insira um número entre 1 e 100:")
            num = readln().toInt()
        }

    } while (num !== rnd)
    print("Parabéns voce adivinhou o número $num corretamente!")

}