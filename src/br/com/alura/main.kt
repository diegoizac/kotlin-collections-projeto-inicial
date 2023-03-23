package br.com.alura

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Alejandro", "Alejandro", "Alejand") // lista de aluno que assistiram curso Android -->> o set add elementos unicos
    val assistiramCursoKotlin: Set<String> = setOf("Thiago", "Pedro", "Pedro", "Plinio") // lista de aluno que assistiram curso Kotlin
//    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin // lista que filtra aluno que assistiram ambos os cursos
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid) // add alunos que assistiram curso de Android a lista que filtra aluno que assistiram ambos os cursos
    assistiramAmbos.addAll(assistiramCursoKotlin) // add alunos que assistiram curso de Kotlin a lista que filtra aluno que assistiram ambos os cursos
    assistiramAmbos.add("Ana") // add alunos diretamento ao filtro dos alunos que assistiram ambos os cursos, porem nao add diretamente na lista do curso
    assistiramAmbos.add("Ana") // como esta utilizando set tenta dar uma nova entrada para o mesmo aluno mas nao consegue

    println(assistiramAmbos)

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}
