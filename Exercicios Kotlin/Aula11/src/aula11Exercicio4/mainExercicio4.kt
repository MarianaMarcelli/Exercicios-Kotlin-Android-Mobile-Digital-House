package aula11Exercicio4

fun main(){

    val listaFuncionarios = arrayListOf<Funcionario>()

    listaFuncionarios.add(Funcionario(nome= "Julio", numeroDeRegistro = 1523))
    listaFuncionarios.add(Funcionario(nome= "Luiz", numeroDeRegistro = 1532))
    listaFuncionarios.add(Funcionario(nome= "Paula", numeroDeRegistro = 1325))
    listaFuncionarios.add(Funcionario(nome= "Ana", numeroDeRegistro = 1352))

    val funcionarioNovo = Funcionario(nome= "Clara", numeroDeRegistro = 1352)

    println(listaFuncionarios.contains(funcionarioNovo))



}