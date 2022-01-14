fun main() {
    val numero = 20;

    if (numero > 20) {
        println("Esse numero é maior que 20");
    } else if (numero == 20) {
        println("Esse numero é 20");
    }
    else {
        println("Esse numero não é maior que 20");
    }

    // Operador ternario

    val valor: Int = if (numero >= 20) 35 else 0;
}

fun saudacao(dia: Boolean): String {
    // Precisa ter else
    return  if (dia) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}

fun calor(quente: Boolean) = if (quente) {
    "Está calor";
} else {
    "Está frio";
}
