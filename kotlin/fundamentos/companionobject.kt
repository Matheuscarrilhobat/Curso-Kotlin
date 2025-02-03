package org.example.fundamentos

class PrimeiraClasse(var nome: String, var endereco: String, var idade: Int) {
    companion object {
        fun criarComValoresPadrao(): PrimeiraClasse {
            return PrimeiraClasse("Matheus", "Rua Teste", 26)
        }

        fun criarAPartirDaSegundaClasse(segundaClasse: SegundaClasse): PrimeiraClasse {
            return PrimeiraClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }

}

class SegundaClasse(var nome: String, var endereco: String, var idade: Int) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Matheus", "Rua Teste", 26)

    }

}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 0).criarComValoresPadrao()

    var primeiracLoader = PrimeiraClasse.criarComValoresPadrao() //companion object permite a implantação de valores padrão pra classe, sem a necessidade de inserir valores desnecessários

    var segundacLoader = PrimeiraClasse.criarAPartirDaSegundaClasse(segundaClasse)

}