package br.com.alura

fun main() {
    val pedidos: List<Pedido> = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido: Pedido -> // associateBy está pegando os pedidos associados pelo numero do pedido e retorna um map com numero do pedido e o valor do pedido
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido: Pedido -> // associateWith está pegando os pedidos associados pela regra de negocio e retorna um map com o pedido e o valor da regra de negocio
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 1, valor = 60.0)]) //retorna true pq o valor do pedido é maior que 50
}
data class Pedido(val numero: Int, val valor: Double)
