package br.com.alura

fun main() {
    val pedidos: List<Pedido> = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0)
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
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)]) // retorna true pq o valor do pedido é maior que 50

//      val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//          pedido.valor > 50.0
//      } // retorna um map com chave boolean e valor pedido
//          println(mapa)
    val pedidosFretreGratisAgrupados: Map<Boolean, List<Pedido>> =
            pedidos.groupBy { pedido: Pedido -> // groupBy está pegando os pedidos e agrupando por regra de negocio e retorna um map com chave boolean e valor lista de pedidos
                pedido.valor > 50.0
    }
    println(pedidosFretreGratisAgrupados) // retorna um map com chave boolean e valor lista de pedidos
    println(pedidosFretreGratisAgrupados[true]) // retorna uma lista de pedidos com valor maior que 50

    val nomes: List<String> = listOf(
        "Eduardo",
        "Alex",
        "Fran",
        "Gui",
        "Ana"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome: String -> // groupBy está pegando os nomes e agrupando por primeira letra do nome e retorna um map com chave char e valor lista de nomes
        nome.first() // agrupa por primeira letra do nome
    }

    println(agenda)
    println(agenda['A']) // retorna uma lista de nomes que começam com a letra A

}
data class Pedido(val numero: Int, val valor: Double)
