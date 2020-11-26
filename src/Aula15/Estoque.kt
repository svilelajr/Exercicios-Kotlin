package Aula15

class Estoque {

    var livros = mutableListOf<Livro>()


    fun cadastrarLivro(livro: Livro){
        livros.add(livro)
        print("O Livro ${livro.titulo} foi cadastrado com sucesso!")
    }

    fun consultarLivro(codigo: Int){
        for(codigo in livros){
            if (codigo.codigo.equals(livros) ){
                println("O ${codigo.titulo} foi encontrado")
            }else{
                println("Livro não encontrado")
            }
        }

    }

}