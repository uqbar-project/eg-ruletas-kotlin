class StubRuleta(val numeroGanador: Int) : IRuleta {
    override fun elegirNumero() {}

    override fun apuestaGanadora(apuesta: Apuesta) = apuesta.numeroApostado == numeroGanador
}