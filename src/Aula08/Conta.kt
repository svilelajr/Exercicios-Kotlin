package Aula08

abstract class Conta(val cliente: Cliente){
    var saldo = 0.0

    fun depositarDinheiro (valor : Double){
        saldo += valor
        println("Você depositou $valor em sua conta, seu saldo agora é de $saldo")

    }

    abstract fun sacarDinheiro(valor : Double)



}