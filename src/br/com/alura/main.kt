package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0), //utilizar o pair caso precise de maior performance
        Pair(2, 64.0),
        3 to 50.0, //utilizar o to caso queira maior comodidade
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )
//      val valorPedido = pedidos.getValue(5) // pega o valor da chave 5 assim como pedido[5]
//      println(valorPedido)
//  println(it) //it imprime o valor de message
    val mensagem = pedidos.getOrElse(5,
        //0.0 //caso queira pode colocar tipo "mensage: Double?" que é do tipo nullble para responder a expressao lambda com 0.0 por exemplo
        {"Não tem o pedido"})
    println(mensagem)//caso queira pode adicionar uma variavel para receber o valor
    println(pedidos.getOrDefault(1, -1)) //retorna o valor da key 1 caso exista, caso não exista retorna o valor default -1.0 que não corresponde a um valor de pedido
    println(pedidos.getOrDefault(0, -1)) //retorna -1.0 que não corresponde a um valor valido, pois a key 0 não existe, porem poderiamos retornar 0.0 por exemplo

    println(pedidos.keys) //retorna as chaves do map
    println(pedidos.values) //retorna os valores do map

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }
    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) -> //utilizando o destructuring
//        false // retorna false para todos os elementos do map
//        true // retorna true para todos os elementos do map
        numero % 2 == 0 && valor > 50.0 // modulo de 2 retorna 0 para numeros pares, e retorna 1 para numeros impares --> no caso retorna os pares e maiores que 50.0
    }
    println(pedidosFiltrados) // retorna pedidos utilizando o filtro

    val pedidosAcima = pedidos.filterValues { valor -> //utilizando o filterValues pegando os numero acima de 70.0
        valor > 70.0
    }
    println(pedidosAcima)
    val pedidosPares = pedidos.filterKeys { numero -> //utilizando o filterKeys pegando os numero pares
        numero % 2 == 0
    }
    println(pedidosPares)
    println(pedidos +mapOf(7 to 90.0, 8 to 20.0))  //adiciona novos valores a um novo map
    println(pedidos) //retorna o map original

    println(pedidos + Pair(7, 90.0)) //adiciona novo valor ao map
    println(pedidos) //retorna o map original

    println(pedidos - listOf(6, 5)) //remove os valores do map
    println(pedidos) //retorna o map original

//    pedidos.putAll(listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    pedidos += (listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    println(pedidos) //adiciona novos valores ao map

    pedidos.keys.remove(1) //remove a chave 1 do map
    println(pedidos)

    pedidos.values.remove(50.0) //remove o valor 50.0 do map
    println(pedidos)

    pedidos.values.remove(100.0) //remove o valor 100.0 do map
    println(pedidos)

    pedidos -= 6 //remove a chave 6 do map
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
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