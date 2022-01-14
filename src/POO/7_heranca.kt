open class Inguico() {
    fun inguicarComOAmorzao() {
        println("Estou inguiçando com o meu marido lindo!");
    }
}

class Tata: Inguico() {
    var taDoente: Boolean = false;

    fun ficarDeVeieira() {
        taDoente = true;
        println("Tata ta de veieira!");
    }
}

fun main() {
    val thais = Tata();

    thais.ficarDeVeieira();
    thais.inguicarComOAmorzao();
}