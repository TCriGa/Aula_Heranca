package Exercicio03
/*Construa um sistema para supermercados onde o cliente possa
registrar 3 ou mais tipos de produtos diferentes onde, cada produto
tenha nome, código de barras e data de validade. Crie alguns objetos
exemplo e mostre os produtos cadastrados.
* */

open class CadastroSupermercado(
    private var nomeProduto: String = "",
    private var codigoBarras: Int = 0,
    private var dataValidade: Int = 0,
   protected var tipoProduto: String = ""
) {
    fun cadastrarTipoProduto() {
        println("Informe qual o tipo de produto: ")
        tipoProduto = readln()
    }

    fun cadastrarProdutos(): CadastroSupermercado {
        var quantidadeProduto: Int = 0

        println("Informe a quantidade de produtos que deseja cadastrar:")
        quantidadeProduto = readln().toInt()

        for (i in 1..quantidadeProduto) {
            println("Informe o nome do produto que deseja cadastrar: ")
            nomeProduto = readln()

            println("Informe o código de barras do produto: ")
            codigoBarras = readln().toInt()

            println("Informe a data de validade do produto:")
            dataValidade = readln().toInt()
        }
        return CadastroSupermercado(nomeProduto, codigoBarras, dataValidade)
    }

    fun mostrarInformacoes() {
        println("Produto = $nomeProduto")
        println("Codigo de barras = $codigoBarras")
        println("Data de validade = $dataValidade")

    }
}
