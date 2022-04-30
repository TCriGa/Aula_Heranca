package Exercicio04

import kotlin.system.exitProcess

class MenuBiblioteca : Biblioteca() {
    val generoLivroM: GeneroLivro = GeneroLivro()
    val nomeLivroM: NomeLivro = NomeLivro()
    val pessoaAutoraM: PessoaAutora = PessoaAutora()

    init {
        println("|-------* Bem vindo ao sistema da Biblioteca TCriGa *--------|")
    }

    fun opcaoMenu() {
        println("|----------------Digite a opção desejada---------------------|")
        println("|----------------01- Inserir nome do Livro-------------------|")
        println("|----------------02- Inserir nome da Pessoa Autora-----------|")
        println("|----------------03- Inserir genêro--------------------------|")
        println("|----------------04- Mostrar informações cadastradas---------|")
        println("|----------------05- Sair------------------------------------|")

    }

    fun menu() {

        do {
            opcaoMenu()
            when (readln().toInt()) {
                1 -> nomeLivroM.nomeL()
                2 -> pessoaAutoraM.pessoaAutoraL()
                3 -> generoLivroM.generoL()
                4 -> {
                    nomeLivroM.mostrarDadosN()
                    pessoaAutoraM.mostrarDadosP()
                    generoLivroM.mostrarDadosG()
                }
                5 -> {
                    println("Grata por utilizar nosso sistema!!! :D ")
                    exitProcess(0)
                }
                else -> println("Opção Inválida")
            }
        } while (true)
    }
}