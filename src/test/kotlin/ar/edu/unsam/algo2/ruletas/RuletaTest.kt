package ar.edu.unsam.algo2.ruletas

import ar.edu.unsam.algo2.ruletas.Apuesta
import ar.edu.unsam.algo2.ruletas.IRuleta
import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify

class RuletaTest : DescribeSpec({
    isolationMode = IsolationMode.InstancePerTest

    describe("Dada una ruleta en un casino") {
        describe("Cuando sale un número") {
            val apuestaGanadora = Apuesta(5, "winner@roulette.com")
            val apuestaPerdedora = Apuesta(2, "looser@roulette.com")
            val mockedMailSender = mockedMailSender()
            val casino = Casino().apply {
                // controlamos el número ganador de la ruleta y el objeto que envía mails\\
                ruleta = mockRuleta(5)
                mailSender = mockedMailSender
                //
                apostar(apuestaGanadora)
                apostar(apuestaPerdedora)
            }
            val apuestasGanadoras = casino.realizarRondaApuestasRuleta()
            it("El ganador recibe un mail") {
                verify(exactly = 1) { mockedMailSender.sendMail(mail = Mail(apuestaGanadora.casillaCorreo, "Ganaste!")) }
            }
            it ("El perdedor no recibe mail") {
                verify(exactly = 0) { mockedMailSender.sendMail(mail = Mail(apuestaPerdedora.casillaCorreo, "Ganaste!")) }
            }
        }
    }
})

fun mockedMailSender(): IMailSender = mockk<IMailSender>(relaxUnitFun = true)

fun mockRuleta(numeroGanador: Int): IRuleta {
    val ruleta = mockk<IRuleta>(relaxUnitFun = true)

    every { ruleta.apuestaGanadora(apuesta = any()) } answers { firstArg<Apuesta>().numeroApostado == numeroGanador }

    return ruleta
}

