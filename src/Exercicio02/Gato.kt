package Exercicio02

class Gato:CadastroPetShop() {

    fun cadastroCat(){
        fichaCadastral()
        vacinar()
    }


    fun mostraDadosCadastradosCat(){
        println("$nome, tem $idade ano(s) de idade, se alimenta de: $tipoAlimentacao," +
                " tem :$peso Kg, já tomou as vacinas: $vacinacao")

    }

}