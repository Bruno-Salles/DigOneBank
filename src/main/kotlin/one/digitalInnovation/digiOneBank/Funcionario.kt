package one.digitalInnovation.digiOneBank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {

    protected abstract fun calcAuxilio(): Double

    override fun toString(): String {
        return """
            Nome: $nome
            CPF: $cpf
            Salário: ${String.format("%.2f", salario)}
            Valor do Auxilio: ${String.format("%.2f", calcAuxilio())}
            Total: ${String.format("%.2f", salario + calcAuxilio())}
        """.trimIndent()
    }
}