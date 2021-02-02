package aula10Exercicio1

abstract class Pessoa (var nome: String, val registro : Int) {
   open  val podeAssistirAula get() = false
   open  val podeFazerLicao get()= false
   open  val podeDarAula get()= false
   open  val podeFazerChamada get()= false

}