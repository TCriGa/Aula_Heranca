/*Crie um sistema bancário de criação de contas, onde a pessoa possa
criar uma conta salário ou uma conta poupança ou conta corrente.
Crie alguns objetos exemplo e mostre na tela o tipo da conta, o saldo
e o nome da pessoa.
*/

package Exercicio01

open class AberturaDeConta(
    protected var tipoDeConta: String = "",
    var nomeTitular: String = "",
    protected var saldoTotal: Double = 0.0
) {


    protected fun tipoDeConta(): String {
        println("Informe o tipo de conta desejada: ")
        tipoDeConta = readln()

        return when (tipoDeConta) {
            "Conta Corrente" -> ("corrente").toString()
            "Conta Salário" -> (" Salário").toString()
            "Conta Poupança" -> ("Poupança").toString()
            else -> {
                "Conta Invalida"
            }
        }

    }

}