package br.com.alura

fun main() {
    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 34.0), Pair(3, 50.0))
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}") //chave
        println("valor do pedido: ${p.value}") //valor
    }
}
