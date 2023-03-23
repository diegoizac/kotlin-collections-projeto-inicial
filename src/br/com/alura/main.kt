package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0), //utilizar o pair caso precise de maior performance
        Pair(2, 34.0),
        3 to 50.0 //utilizar o to caso queira maior comodidade
    )
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}") //chave
        println("valor do pedido: ${p.value}") //valor
    }
    pedidos[4] = 70.0 //add novo valor ao map
    println(pedidos)
    pedidos.put(5, 80.0) //add novo valor ao map
    println(pedidos)
    pedidos.put(1, 100.0) // insere ou substitui valor no map
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0) //não adiciona se já existir
    println(pedidos)
    pedidos.putIfAbsent(3, 200.0) //não adiciona se já existir
    println(pedidos)
    pedidos.remove(6) //remove chave
    println(pedidos)
    pedidos.remove(3, 100.0) //remove chave e valor caso a chave e o valor existam no map
    println(pedidos)
    pedidos.remove(3, 50.0) //remove chave e valor caso a chave e o valor existam no map
    println(pedidos)
}
