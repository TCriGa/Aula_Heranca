package Exercicio04

open class Biblioteca(
    protected var genero: String = "",
    protected var pessoaAutora: String = "",
    protected var nomeLivro: String = "",
) {

    protected fun nomeLivro(): Biblioteca {
        println("Informe o nome do livro: ")
        nomeLivro = readln()

        return Biblioteca(nomeLivro)
    }

   protected fun generoLivro() : Biblioteca {
        println("Informe o genêro do lvro:")
        genero = readln()

       return Biblioteca(genero)
    }

   protected fun pessoAutora() : Biblioteca{
        println("Informe o nome do autor(as) do livro")
        pessoaAutora = readln()

       return Biblioteca(pessoaAutora)
    }


}