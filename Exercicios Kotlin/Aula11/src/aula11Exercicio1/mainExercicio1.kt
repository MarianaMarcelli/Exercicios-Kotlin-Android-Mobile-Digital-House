package aula11Exercicio1

fun main(){

    val pessoa1 = Pessoa(nome="João",rg= 111111115 )
    val pessoa2 = Pessoa(nome= "Joana", rg= 111111115)

    println(pessoa1 == pessoa2)
}

//3- o resultado é false
//5- o resultado é true, pois agora ele compara somente o atributo rg dos objetos.