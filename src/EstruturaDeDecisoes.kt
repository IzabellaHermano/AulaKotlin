

fun main() {//fun -> bloco de ações

    //Estrutura de Fluxo
    val numero =10

    if (numero> 0){
        println("$numero é positivo")
    }else if (numero< 0){
        println("$numero é negativo")
    }else{
        println("$numero é ZERO")
    }

    val idade = 18
    val status = if (idade>=18){
        "Adulto"
    }else{
        "Menor"
    }
    println("Status = $status")

    val diaDaSemana=5
    when(diaDaSemana){
        1->println("Domingo")
        2->println("Segunda-Feira")
        3->println("Terça-Feira")
        4->println("Quarta-Feira")
        5->println("Quinta-Feira")
        6->println("Sexta-Feira")
        7->println("Sábado")
        else -> println("Dia da Semana Inválido")
    }

    val caractere = 'a'
    when(caractere){
        'a','e','i','o','u'->println("$caractere é uma vogal!")
        else -> println("$caractere é consoante!")
    }
    //Loops -> Laço de Repetição
    val frutas = listOf("Maça","Banana","Laranja","Uva")
    for (fruta in frutas){
        println("Eu gosto de $fruta")
    }

    for (i in 10 downTo 1 step 2){
        println("Contagem regressiva = $i")
    }

    //Loops -> Laço de Repetição com While
    var contador = 0
    while (contador<5){
        println("While loop = $contador")
        contador++
    }

    var cont =0
    do {
        println("Do-While = $cont")
        cont++
    }while (cont < 0)
}