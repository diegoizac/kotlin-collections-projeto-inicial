package br.com.alura

fun testaCopia() {
    val banco = BancoDeNomes() //recebe a funcao BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes //recebe a funcao BancoDeNomes()
//      banco.nomes.add("Diego") //add dados ao banco de dados
    banco.save("Diego") //add dados ao banco de dados utilizando a funcao save
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList() //List apenas para leitura dos dados do banco -->> o .toList() devolve apenas um snapshot dos dados para que os dados nao fiquem vulneraveis
    fun save(nome: String) {
        dados.add(nome)
    } //salva um novo dado a lista dos dados do banco

    companion object {
        private val dados = mutableListOf<String>() //List dos dados do banco
    } // mantem salvos sem serem perdidos os dados inseridos e modificados do banco de dados
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Bob",
        "Carol",
        "Dave",
        "Eve",
        "Fred",
        "Gary",
        "Hen"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}