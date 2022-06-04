package one.digitalInnovation.digiOneBank.testes

import one.digitalInnovation.digiOneBank.Funcionario

class GeradorRelatorioFuncionario {
    companion object {
        fun geraRelatorio(funcionario: Funcionario) = println(funcionario.toString())
    }
}
