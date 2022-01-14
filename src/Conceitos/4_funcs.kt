fun main() {
    helloWord();
    soma(10, 41);
    println(falaAlgo("Eu sou uma func"));
    falaOi();
    falaNomes("rafael", "thais", "ademir", "cleidinha");
    mostraDado({"Rafael"})
}

fun helloWord(): Unit {
    // Com o Unit estamos deixando claro que a função não retorna nada.
    println("Opa, olá mundo!");
}

fun soma(n1: Int, n2: Int): Int {
    // Função com retorno
    return n1 + n2;
}

// Função reduzida com retorno
fun falaAlgo(text: String): String = text;

// Função reduzida sem retorno
fun falaOi() = println("OIIIII");

// Parametros não obrigatorios
fun endereco(rua: String, cidade: String, numero: Int = 0) {

}

// Multiplos parametros
fun falaNomes(vararg nomes: String) {
    for(nome in nomes) {
        println("Olá $nome");
    }
}

// Usando generics

fun <T> mostraDado(dado: T): T {
    println(dado);
    return dado;
}
