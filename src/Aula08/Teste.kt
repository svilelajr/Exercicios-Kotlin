package Aula08

fun main() {

    val clt1 = Cliente(1, "Santos", "123123312", "090880809-12")
    val cc1 = ContaCorrente(clt1, 1000.00)

    cc1.depositarDinheiro(100.00)
    cc1.sacar(15.00)

}