fun main() {
    for(i in 1..10) {
        println("Laço $i");
    }

    val frase = "Meu nome não é Jhonny";

    for (letra in frase) {
        println(letra);
    }

    for (i in 0..20 step 2) {
        println(i);
    }

    for (i in 20 downTo 0 step 2) {
        println(i);
    }
}