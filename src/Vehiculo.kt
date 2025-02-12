interface Vehiculo {

    val kmHora: Int
    val motorEncendido: Boolean

    fun acelerar(valor: Int)

    fun frenar(valor : Int)

}