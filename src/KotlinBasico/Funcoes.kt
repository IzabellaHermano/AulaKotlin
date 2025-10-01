package KotlinBasico

fun main() {

    saudacao("Izabella")
    saudaPersonalizado("Professor!!", "Oi!!")

    println("A soma é: " + somar(a = 10, b = 5))
    println("A multiplicação é: "+ multiplicar(a = 3, b = 5))
}
fun saudacao(nome: String): Unit {
    println("Olá, $nome")
}
fun saudaPersonalizado(destinatario: String, saudacao: String){
    println("$saudacao $destinatario")
}
fun somar(a:Int, b:Int): Int{
    return a + b
}
fun multiplicar(a: Int, b: Int): Int = a * b