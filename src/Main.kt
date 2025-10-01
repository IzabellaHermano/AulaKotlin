
fun main() { //fun -> bloco de ações
    val nome = "Izabella"
    println("Olá, o meu nome é $nome")

    var idade = 18
    println("Minha idade é $idade")
    idade=19
    println("A minha idade agora é $idade")

    //Declarações Explicitas
    val pi: Double = 3.14459
    var mensagem: String = "Seja bem-vindo ao Kotlin!"
    var isAtivo: Boolean = true

    println("O valor de Pi é: $pi")
    println("Mensagem: $mensagem")
    println("Está ativo? $isAtivo")

    //Tipos numéricos
    val numeroInteiro: Int = 100
    val numeroLongo: Long = 11622278829L
    var numeroDecimal: Float = 10.5f
    var numeroDecimalDuplo: Double = 20.75

    println("Int = $numeroInteiro, Long = $numeroLongo," +
            "Float = $numeroDecimal, Double = $numeroDecimalDuplo")
}