fun main() {
    val name: String? = null;

    // O bloco let sera executado se o name for diferente de nulo.
    // Dentro do bloco let a variavel chave será referenciada por it
    name?.let {
        println(it.uppercase());
    }


}