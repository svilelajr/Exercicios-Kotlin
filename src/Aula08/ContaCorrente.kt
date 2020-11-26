package Aula08

class ContaCorrente(cliente: Cliente, var limite : Double) :Conta(cliente) {

     fun sacar(valor: Double) {
        when {
            valor <= saldo -> sacarDinheiro(valor)
            valor <= saldo + limite -> sacarChequeEspecial(valor)
            else -> println("Saldo Insuficiente")
        }
    }


    fun depositarCheque(cheque: Cheque): Double{
        depositarDinheiro(cheque.valor)
        return saldo
    }

    private fun sacarChequeEspecial(valor: Double) {
        val excedente = valor - saldo

        sacarDinheiro(saldo)
        saqueChequeEspecial(excedente)
    }

    private fun saqueChequeEspecial(excedente: Double) {
        limite -= excedente
        println("Saque de $excedente do cheque especial. Saldo do Cheque Especial: $limite")
    }

    override fun sacarDinheiro(valor: Double) {
        saldo -= valor
        println("Saque de $valor na conta. Saldo atual: $saldo")
    }
}