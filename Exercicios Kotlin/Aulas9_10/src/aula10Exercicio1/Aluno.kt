package aula10Exercicio1

class Aluno(val registroAcademico: Int, val nome: String, val sobrenome: String) {

    val podeAssistirAula: Boolean
        get() = true

    val podeFazerLicao: Boolean
        get() = true
}