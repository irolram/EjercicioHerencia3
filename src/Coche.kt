class Coche:Vehiculo,EncendidoApagado {



    override var kmHora: Int = 0
        set(value) {

            val valorFinal = field - value
            field = if (valorFinal < 0){
                0
            }else{
                valorFinal
            }
        }

    override var motorEncendido: Boolean = false


    override fun acelerar(valor: Int) {
        if(motorEncendido){
            kmHora += valor
            println("Velocidad actual $valor km/h")
        }else{
            println("El motor está apagado, enciendelo...")
        }
    }

    override fun frenar(valor: Int) {

        if (motorEncendido){
            kmHora -= valor
        }else{
            println("Porfa enciende el motor y frena, que me da miedo")
        }
    }

    override fun encender() {
        motorEncendido = true
    }

    override fun apagar() {
        motorEncendido = false
    }
}