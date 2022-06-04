package one.digitalInnovation.digiOneBank.testes

import one.digitalInnovation.digiOneBank.Banco

fun main() {
    val digOneBank = Banco(nome = "DigOne", numero = 96)
    println(digOneBank.nome)
    println(digOneBank.numero)

    val banco2 = digOneBank.copy(nome = "Banco 2")
    println(banco2.info())
}
