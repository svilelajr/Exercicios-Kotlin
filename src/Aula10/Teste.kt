package Aula10

fun main() {

    val valor_normal = 100.00
    val valor_vip = valor_normal * 2

    println("Comprar Ingresso: 1 - Normal | 2 - Vip: ")
    var opcao = readLine()

    if(opcao == "1"){
        val igNormal = Normal(valor_normal)
        println("Voce comprou o ingresso Normal, o valor é de R$ ${igNormal.imprimeValor()}")

     } else if(opcao == "2") {
        println("Comprar VIP: 1 - Camarote Inferior | 2 - Camarote Superior: ")
    }
        var opcaoVip = readLine()

    if(opcaoVip == "1"){
            val igInferior = CamaroteInferior(valor_vip)
            println("Voce comprou o ${igInferior.imprimirLocalizacao()}, o valor é de R$ ${igInferior.imprimeValor()}")
        }

    else if(opcaoVip == "2"){

            val igSuperior = CamaroteSuperior(valor_vip)
            println("Voce comprou o ${igSuperior.imprimirLocalizacao()}, o valor é de R$ ${igSuperior.imprimeValor()}")
        }

}