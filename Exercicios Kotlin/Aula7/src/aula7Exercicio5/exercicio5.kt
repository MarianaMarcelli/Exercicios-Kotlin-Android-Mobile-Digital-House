package aula7Exercicio5

fun main(){

    val carro1 = Veiculo("volkswagen","gol", 2010, "prata", 40000)
    val cliente1 = Cliente("Carlos", "Gil", "11-994558865")

    val concessionaria = Concessionaria()
    concessionaria.registrarVenda(carro1, cliente1, 10000.0)



}
