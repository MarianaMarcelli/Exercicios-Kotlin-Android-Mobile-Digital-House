package aula10Exercicio1

class Professor (val nomeProfessor : String, var registroDocente: Int){

    val podeDarAula: Boolean
        get() = true

    val podeFazerChamada: Boolean
        get()= true

}