package ar.edu.unsam.algo2.ruletas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.matchers.collections.shouldNotBeIn

class RuletaTest : DescribeSpec({
//    isolationMode = IsolationMode.InstancePerTest

    describe("Dada una ruleta en un casino") {
        describe("Cuando sale un número") {
            val apuestaGanadora = Apuesta(5, "winner@roulette.com")
            val apuestaPerdedora = Apuesta(2, "looser@roulette.com")
            val casino = Casino().apply {
                apostar(apuestaGanadora)
                apostar(apuestaPerdedora)
            }
            val apuestasGanadoras = casino.realizarRondaApuestasRuleta()
            it("La apuesta ganadora se devuelve") {
                apuestaGanadora shouldBeIn apuestasGanadoras
            }
            it ("La apuesta perdedora se filtra") {
                apuestaPerdedora shouldNotBeIn apuestasGanadoras
            }
        }
    }
})