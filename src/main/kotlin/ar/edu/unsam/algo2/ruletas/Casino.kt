package ar.edu.unsam.algo2.ruletas

class Casino {
    var ruleta: IRuleta = Ruleta()
    val apuestas: MutableList<Apuesta> = mutableListOf()
    lateinit var mailSender: IMailSender

    fun apostar(apuesta: Apuesta) {
        this.apuestas.add(apuesta)
    }

    fun realizarRondaApuestasRuleta() {
        ruleta.elegirNumero()

        return apuestas
            .filter { apuesta -> ruleta.apuestaGanadora(apuesta) }
            .forEach { apuesta -> mailSender.sendMail(Mail(apuesta.casillaCorreo, "Ganaste!"))}
    }
}