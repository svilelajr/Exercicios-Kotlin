package Aula15

fun main() {

    val exemplar = Livro(
            100,
            "Livro1",
            "Autor1",
            "2010",
            "1234",
            1,
            1.99
    )

    val livraria = Estoque()

    livraria.cadastrarLivro(exemplar)

    livraria.consultarLivro(100)
    livraria.consultarLivro(200)


    livraria.efetuarVenda(100)
    livraria.efetuarVenda(100)
    livraria.efetuarVenda(200)



}