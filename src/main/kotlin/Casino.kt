class Casino {
    var ruleta: IRuleta = Ruleta()
    val apuestas: MutableList<Apuesta> = mutableListOf()

    fun apostar(apuesta: Apuesta) {
        this.apuestas.add(apuesta)
    }

    fun realizarRondaApuestasRuleta(): List<Apuesta> {
        ruleta.elegirNumero()

        return apuestas.filter { apuesta -> ruleta.apuestaGanadora(apuesta) }
    }
}