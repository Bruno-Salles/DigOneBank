package one.digitalInnovation.digiOneBank.testes

import one.digitalInnovation.digiOneBank.Analista
import one.digitalInnovation.digiOneBank.testes.GeradorRelatorioFuncionario.Companion.geraRelatorio

fun main() {
    val bruno = Analista(nome = "Bruno Salles", cpf = "123.456.789-10", salario = 3500.00)
    geraRelatorio(bruno)
}