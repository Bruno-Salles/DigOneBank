package one.digitalInnovation.digiOneBank

class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {
    public override fun calcAuxilio() = salario * 0.1
}
