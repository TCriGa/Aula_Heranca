package Exercicio02

import kotlin.system.exitProcess


class MenupetShop : CadastroPetShop() {

    private val gato: Gato = Gato()
    private val cachorro: Cachorro = Cachorro()
    private val passaro: Passaro = Passaro()

    init {
        println("|--*--*   Bem vindo ao sistema PetShop TCriga    *--*--|")
    }

    private fun boasVindasNotas() {
        println("|------------------------------------------------------|")
        println("|        Por favor, digite a opção desejada:           |")
        println("|---------01 - Preencher ficha do Pet------------------|")
        println("|---------02 - Mostrar dados cadastrados---------------|")
        println("|---------03 - Cadastrar novo tipo de Pet--------------|")
        println("|---------04 - Sair -----------------------------------|")
        println("|------------------------------------------------------|")
    }

    fun menu() {
        tipoDepet()
        do {
            boasVindasNotas()
            when (readln().toInt()) {

                1 -> when (tipoPet) {
                    "Gato" -> {
                        gato.cadastroCat()
                    }
                    "Cachorro" -> {
                        cachorro.cadastroDog()
                    }
                    "Passáro" -> passaro.cadastroBird()
                }
                2 -> when (tipoPet) {
                    "Gato" -> {
                        gato.mostraDadosCadastradosCat()
                    }
                    "Cachorro" -> {
                        cachorro.mostraDadosCadastradosDog()
                    }
                    "Passáro" -> {
                        passaro.mostraDadosCadastradosBird()
                    }
                }
                3-> tipoDepet()

                4 -> {
                    println("Grata por utilizar nosso sistema!! ;) ")
                    exitProcess(0)
                }
                else -> println("Opção inválida. Por favor, digite novamente!! XD")
            }


        } while (true)
    }
}
