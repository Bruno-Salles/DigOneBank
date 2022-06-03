package one.digitalInnovation.digiOneBank

class Pessoa {
    var nome: String = "Bruno Salles"
    var cpf: String = "123.456.789-10"
}

fun main() {
    val bruno = Pessoa()
    println(bruno.nome)
    println(bruno.cpf)
}