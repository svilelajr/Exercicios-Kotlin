package Aula15

fun main() {

    val exemplar = Livro(
            100,
            "Livro1",
            "Autor1",
            "2010",
            "1234",
            2,
            1.99
    )

    val livraria = Estoque()

    livraria.cadastrarLivro(exemplar)
    livraria.consultarLivro(100)


}