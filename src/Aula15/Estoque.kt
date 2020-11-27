package Aula15

class Estoque {

    var livros = mutableListOf<Livro>()


    fun cadastrarLivro(livro: Livro){
        livros.add(livro)
        println("O Livro ${livro.titulo} foi cadastrado com sucesso!")
    }

    fun consultarLivro(codigo: Int): Boolean{
        for(livro in livros){
            if (livro.codigo == codigo){
                println("O ${livro.titulo} foi encontrado")
                return true
            }else{
                println("Livro não encontrado")

            }
        }
        return false
    }

    fun efetuarVenda(codigo :Int){

        if(consultarLivro(codigo)){
            for (livro in livros){
                if (livro.quantidadeEstoque >= 1){
                    livro.quantidadeEstoque -= 1
                    println("Venda OK")
                }else if (livro.quantidadeEstoque == 0){
                    println("Não temos este livro em estoque")
                }
            }
        }

    }

}