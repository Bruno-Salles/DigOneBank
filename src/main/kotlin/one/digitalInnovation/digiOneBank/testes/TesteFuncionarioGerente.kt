package one.digitalInnovation.digiOneBank.testes

import one.digitalInnovation.digiOneBank.Gerente
import one.digitalInnovation.digiOneBank.testes.GeradorRelatorioFuncionario.Companion.geraRelatorio

fun main() {
    val laura = Gerente(nome = "Laura Salles", cpf = "123.456.789-10", salario = 5000.00)
    geraRelatorio(laura)
}