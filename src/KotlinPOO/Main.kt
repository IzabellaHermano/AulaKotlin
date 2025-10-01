package KotlinPOO

fun main(){
    val pessoa1 = Pessoa("Kaike", 18)
    val pessoa2 = Pessoa("Izabella",19)

    println("Nome da pessoa 01 = ${pessoa1.nome}")
    pessoa1.apresentar()

    println("Nome da pessoa 02 = ${pessoa2.nome}")
    pessoa2.apresentar()

    //DataClass
    val produto1 = Produto("Notebook", 4500.0)
    val produto2 = Produto("Tablet", 3500.0)
    val produto3 = Produto("Celular", 6500.0)

    println("Produto 01 = $produto1")
    println("Produto 01 é igual ao Produto 03? ${produto1==produto3}")

}
class Pessoa(val nome: String, var idade:Int){
    fun apresentar(){
        println("Olá, meu nome é $nome e eu tenho $idade anos")
    }
}
data class Produto(val nome: String, val preco: Double)