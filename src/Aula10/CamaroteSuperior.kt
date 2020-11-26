package Aula10

class CamaroteSuperior(var valorCamaroteSuperior: Double) : Vip() {

    fun imprimirLocalizacao() :String {

        return "Camarote Superior"

    }

    override fun imprimeValor(): Double {
        valorCamaroteSuperior = (valorCamaroteSuperior * 1.50)

        return valorCamaroteSuperior

    }


}