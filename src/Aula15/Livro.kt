package Aula15

data class Livro(val codigo:Int, val titulo: String, val autor:String,
            val anoLancamento:String, val isbn: String,
            var quantidadeEstoque: Int, var preco : Double ) {


}