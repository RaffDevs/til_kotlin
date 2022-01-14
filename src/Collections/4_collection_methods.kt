fun main() {
    val data = geraDados();

    // Retorna true se existe algum valor dentro da coleção
    data.any()

    // Retorna a quantidade de elementos dentro da coleção
    data.count();

    // Retorna o primeiro elemento da coleção
    data.first();

    // Retorna o ultimo elemento da coleção
    data.last();

    val numberList = mutableListOf<Int>(1,2,3,4,5,6);

    println(numberList.sum());
    println(data.sumOf { it.calorias });

    // filter
    val altasCalorias = data.filter { it.calorias > 500  };

    println(altasCalorias);

    // Take and takelast

    println(data.take(2));
    println(data.takeLast(3));

    // Foreach

    data.forEach { println(it.calorias) };

    // Max and min

    println(data.maxOf { it.calorias });
    println(data.minOf { it.calorias });

    // Map

    println(data.map { Receita(it.nome, it.calorias) });

    // Avarage
    println(data.map { it.calorias }.average());

    // Distinct

    println(listOf(1,2,3,4,5,5,5).distinct());
}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)

