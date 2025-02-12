package org.example.exercicios

fun main() {
    var lis = mutableListOf("")
    lis.removeFirst()
    do {
        var cho = ""
        print("Selecione uma das opções\n1-Adicionar tarefa\n" +
                "2-Remover tarefa\n" +
                "3-Mostrar tarefas\n" +
                "4-Sair\n" + "Digite o Número:")
        cho = readln()
        if (cho == "1") {
            print("Digite o que deseja adicionar:")
            var adi = readln()
            lis.add(adi)
        } else if (cho == "2") {
            print("Digite o que deseja remover:")
            var rem = readln()
            lis.remove(rem)
        } else if (cho == "3") {
            println(lis)
        }
    } while (cho != "4")
}