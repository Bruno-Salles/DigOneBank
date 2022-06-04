package one.digitalInnovation.digiOneBank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calcAuxilio() = salario * 0.1
}