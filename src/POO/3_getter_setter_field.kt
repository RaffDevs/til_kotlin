class Carro(val marca: String) {
    private var modelo: String = "Astra";
}

fun main() {
    val carro: Carro = Carro("Chevrolet");
    println(carro);
}