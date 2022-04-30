package Exercicio01

class ContaCorrente : AberturaDeConta() {



    fun coletarDadosPessoais(): String {
        println("Por gentileza, informe o seu nome Completo: ")
        nomeTitular = readln()

        return nomeTitular

    }


    fun saldo(): Double {
        println("Informe o valor o do saldo na conta: ")
        saldoTotal = readln().toDouble()

        return saldoTotal
    }

    fun informacoesCC(){

        println(" O (A) titular da conta é = $nomeTitular," +
                "seu tipo de conta é Corrente, seu saldo é $saldoTotal")
    }



}