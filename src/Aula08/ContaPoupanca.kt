package Aula08

class ContaPoupanca (val taxa : Double, cliente : Cliente): Conta(cliente) {

    override fun sacarDinheiro(valor: Double) {

        if(valor < saldo){
            println("Não é possivel realizar seu saque")
        }else{
            saldo =- valor
            println("Voce sacou R$$valor, seu saldo é de R$$saldo")
        }

        fun recolherJuros(){
            println("Juros no valor de ${(taxa/100) * saldo} recolhidos com sucesso")

        }

    }
}