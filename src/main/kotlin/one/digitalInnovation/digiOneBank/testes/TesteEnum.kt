package one.digitalInnovation.digiOneBank.testes

import one.digitalInnovation.digiOneBank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println(">> ${it.name} - ${it.descricao}")
    }
}