package Exercicio02
/*Construa um sistema para petshop onde o cliente pode registrar o
nome de pelo menos 3 tipos de animais diferentes, crie alguns
objetos exemplo e mostre em tela o nome dos animais registrados.
* */

open class CadastroPetShop(
    protected var tipoPet: String = "",
    protected var nome: String = "",
    protected var peso: Double = 0.0,
    protected var tipoAlimentacao:String = "",
    protected var idade:Int = 0,
    protected var vacinacao: String = ""
) {
    protected fun tipoDepet(){
        println("Informe qual o tipo de Pet:")
        tipoPet = readln()
    }
   protected fun fichaCadastral(){
        println("Informe o nome do animal: ")
        nome = readln()

        println("Informe o peso: ")
        peso = readln().toDouble()

        println("Informe o tipo de alimentação: ")
        tipoAlimentacao = readln()

        println("Informe a idade do animal: ")
        idade = readln().toInt()
    }

   protected fun vacinar(){
        println("Informe qual vacina o animal tomou: ")
        vacinacao = readln()
    }


}