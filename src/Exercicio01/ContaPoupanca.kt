package Exercicio01

 class ContaPoupanca : AberturaDeConta() {

    fun informacoesCP() {

        println(
            println(" O (A) titular da conta é = $nomeTitular," +
                    "seu tipo de conta é Poupança, seu saldo é $saldoTotal")
        )
    }

    fun coletarDadosPessoais(): String {
        println("Por gentileza, informe o seu nome Completo: ")
        nomeTitular = readln()

        return nomeTitular

    }


    fun saldo(): Double {
        println("Informe o valor do Saldo na conta: ")
        saldoTotal = readln().toDouble()

        return saldoTotal
    }


}