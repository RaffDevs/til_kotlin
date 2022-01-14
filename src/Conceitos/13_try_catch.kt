fun main() {
    try {
        val nome: String? = null;
        println(nome!!.length)
    } catch (err: Exception) {
        println("Um erro aconteceu $err");
    }

    println("Resultado some ${5+5}");
}