package org.example.exercicios

fun main() {
    var lis = mutableListOf("")
    lis.removeFirst()
    do {
        var cho = ""
        print("Selecione uma das opções\n1- Cadastrar Aluno\n" +
                "2- Remover Aluno\n" +
                "3- Mostrar Alunos\n" +
                "4- Sair\n" +
                "Digite o Número correspondente a ação:")
        cho = readln()
        if (cho == "1") {
            print("Insira o nome do aluno:")
            var nom = readln()
            print("Insira a 1 nota:")
            var n1 = readln().toFloat()
            print("Insira a 2 nota:")
            var n2 = readln().toFloat()
            var med = (n1 + n2)/2
            var sit = ""
            if (med >= 7) {
                sit = "Aprovado"
            } else {
                sit = "Reprovado"
            }
            lis.add("Nome:$nom :: Média:$med :: Situação:$sit")
        } else if (cho == "2") {
            print("Insira o nome do aluno que deseja remover:")
            var rem = readln()
            lis.removeAll{rem in it}
        } else if (cho == "3") {
            println(lis)
            Thread.sleep(2000)
        }
    } while (cho != "4")
}