package Exercicio02

class Cachorro: CadastroPetShop() {


    fun cadastroDog(){
        fichaCadastral()
        vacinar()
    }
    fun mostraDadosCadastradosDog(){
        println("$nome, tem $idade ano(s) de idade, se alimenta de: $tipoAlimentacao," +
                " tem :$peso Kg, já tomou as vacinas: $vacinacao")

    }

}