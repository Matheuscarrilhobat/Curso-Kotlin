package org.example.exercicios

fun main() {
    var lis = mutableListOf("")
    lis.removeFirst()
    do {
        var cho = ""
        print("Selecione uma das opções\n1- Adicionar Contato\n" +
                "2- Remover Contato\n" +
                "3- Mostrar Contatos\n" +
                "4- Sair\n" +
                "Digite o Número correspondente a ação:")
        cho = readln()
        if (cho == "1") {
            print("Insira o Nome do Contato:")
            var nom = readln()
            print("Insira o Número do Contato:")
            var num = readln()
            lis.add("$nom::$num")
        } else if (cho == "2") {
            print("Insira o nome que deseja remover:")
            var rem = readln()
            lis.removeAll{rem in it}
        } else if (cho == "3") {
            println(lis)
            Thread.sleep(2000)
        } else if (cho != "4") {
            println("Número Invalido! Por favor tente novamente")
        }

    } while (cho != "4")
}