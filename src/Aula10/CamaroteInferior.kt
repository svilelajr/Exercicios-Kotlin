package Aula10

class CamaroteInferior(var valorCamaroteInferior : Double) :Vip() {

    override fun imprimeValor() :Double {
         return valorCamaroteInferior
    }

    fun imprimirLocalizacao():String {

        return "Camarote Inferior"

    }

}