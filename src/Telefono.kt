class Telefono(val marca: String, val modelo: String):EncendidoApagado, DispositivoElectronico {

    override fun encender() {
        println("El dispositivo está encendido")
    }

    override fun apagar() {
        println("El dispositivo está apagado")
    }

    override fun reiniciar() {
        println("El dispositivo se está reiniciando")
    }
}