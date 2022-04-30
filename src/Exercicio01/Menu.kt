package Exercicio01

import kotlin.system.exitProcess

class Menu : AberturaDeConta() {

    private val informacaoCC: ContaCorrente = ContaCorrente()
    private val informacaoCP: ContaPoupanca = ContaPoupanca()
    private val informacaoCS: ContaSalario = ContaSalario()


    init {
        println("|--*--*  Bem vindo ao sistema Bancário TCriga    *--*--|")
    }

    private fun boasVindasNotas() {
        println("|------------------------------------------------------|")
        println("|        Por favor, digite a opção desejada:           |")
        println("|------------------------------------------------------|")
        println("|--------------01 - Inserir tipo de conta -------------|")
        println("|--------------02 - Inserir informações cadastrais-----|")
        println("|--------------03 - Mostrar informações da Conta-------|")
        println("|--------------04 - Sair ------------------------------|")
        println("|------------------------------------------------------|")
    }

    fun menu() {

        do {
            boasVindasNotas()
            when (readln().toInt()) {
                1 -> tipoDeConta()

                2 -> {
                    if (tipoDeConta == "Conta Corrente") {
                        informacaoCC.coletarDadosPessoais()
                        informacaoCC.saldo()
                    } else if (tipoDeConta == "Conta Salário") {
                        informacaoCS.coletarDadosPessoais()
                        informacaoCS.saldo()
                    } else if (tipoDeConta == "Conta Poupança") {
                        informacaoCP.coletarDadosPessoais()
                        informacaoCP.saldo()
                    }
                }
                3 -> {
                    if (tipoDeConta == "Conta Corrente") {
                        informacaoCC.informacoesCC()
                    } else if (tipoDeConta == "Conta Salário") {
                        informacaoCS.informacoesCS()
                    } else if (tipoDeConta == "Conta Poupança") {
                        informacaoCP.informacoesCP()
                    }
                }
                4 -> {
                    println("Obrigada por utilizar o nosso sistema ;) !!!!")
                    exitProcess(0)
                }
                else -> println("Op??o inválida. Por favor, digite novamente")
            }
        } while (true)
    }
}

