fun main() {
    val t1 = Telefono("sansun", "sanson")
    val lavadora1 = Lavadora("Lab adora")
    val coche1 = Coche()

    t1.encender()
    t1.apagar()
    t1.reiniciar()
    lavadora1.encender()
    lavadora1.apagar()
    coche1.acelerar(60)
    coche1.encender()
    coche1.acelerar(60)
    coche1.apagar()
}