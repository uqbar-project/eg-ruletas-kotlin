import kotlin.random.Random

interface IRuleta {
    fun elegirNumero()
    fun apuestaGanadora(apuesta: Apuesta): Boolean
}

class Ruleta : IRuleta {
    var numeroGanador: Int = 0

    override fun elegirNumero() {
        this.numeroGanador = Random.nextInt(0,36)
        println("No va másssss!! Salió el " + this.numeroGanador)
    }

    override fun apuestaGanadora(apuesta: Apuesta) = apuesta.numeroApostado == this.numeroGanador
}