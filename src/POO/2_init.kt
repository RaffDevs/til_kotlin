class Animal(val especie: String) {
    // O init é executado quando a classe é criada!
    init {
        println("Animal criado!");
    }
}

fun main() {
    val animal: Animal = Animal("Macaco"); 
}