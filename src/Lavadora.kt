class Lavadora(val nombre: String):EncendidoApagado {
    override fun encender() {
        println("La lavadora está encendida")
    }

    override fun apagar() {

        println("La lavadora está apagada")
    }
}