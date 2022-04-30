package Exercicio01

open class ContaSalario : AberturaDeConta(){
    fun informacoesCS(){

        println(" O (A) titular da conta é = $nomeTitular," +
                "seu tipo de conta é Salário, seu saldo é $saldoTotal")
    }

    fun coletarDadosPessoais(): String {
        println("Por gentileza, informe o seu nome Completo: ")
        nomeTitular = readln()

        return nomeTitular
    }


    fun saldo(): Double {
        println("Informe o valor do seu Saldo na conta: ")
        saldoTotal = readln().toDouble()

        return saldoTotal
    }


}
