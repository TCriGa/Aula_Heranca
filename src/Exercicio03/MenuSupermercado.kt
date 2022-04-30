package Exercicio03
import kotlin.system.exitProcess

class MenuSupermercado : CadastroSupermercado() {

    val cadastroPLimpeza : ProdutosLimpeza = ProdutosLimpeza()
    val cadastroPAlimentos : ProdutosAlimentos = ProdutosAlimentos()
    val cadastroPFrutas : ProdutosFrustasEverduras = ProdutosFrustasEverduras()
    val cadastroPFrios : ProdutosFriosEmGeral = ProdutosFriosEmGeral()

    init {
        println("|--*--*   Bem vindo ao sistema supermercado TCriga    *--*--|")
    }

    private fun boasVindasNotas() {
        println("|------------------------------------------------------|")
        println("|        Por favor, digite a opção desejada:           |")
        println("|---------01 - Preencher Dados do Produto--------------|")
        println("|---------02 - Mostrar os dados do produto-------------|")
        println("|---------03 - Cadastrar novo tipo de Produto----------|")
        println("|---------04 - Sair -----------------------------------|")
        println("|------------------------------------------------------|")
    }

    fun menu() {
        cadastrarTipoProduto()
        do {
            boasVindasNotas()
            when (readln().toInt()) {

                1 -> when (tipoProduto) {
                    "Limpeza" -> {
                        cadastroPLimpeza.cadastrarPLimpeza()
                    }
                    "Alimentos" -> {
                        cadastroPAlimentos.cadastrarPAlimentos()
                    }
                    "Frios" -> {
                        cadastroPFrios.cadastrarPFriosemGeral()
                    }
                    "Frutas e verduras" ->{
                        cadastroPFrutas.cadastrarPFrutas()
                    }
                }
                2 -> when (tipoProduto) {
                    "Limpeza" -> {
                        cadastroPLimpeza.mostrarInfoLimpeza()
                    }
                    "Alimentos" -> {
                        cadastroPAlimentos.mostrarInfoAlimentos()
                    }
                    "Frios" -> {
                        cadastroPFrios.mostrarInfoFrios()
                    }
                    "Frutas e verduras" ->{
                        cadastroPFrutas.mostrarInfoFrutas()
                    }
                }
                3 -> cadastrarTipoProduto()
                4 -> {println("Grata por utilizar nosso sistema!! ;) ")
                    exitProcess(0)
                }
                else -> println("Opção inválida. Por favor, digite novamente!! XD")
            }


        } while (true)
    }
}

