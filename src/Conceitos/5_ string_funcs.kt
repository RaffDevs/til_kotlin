fun main() {
    val myString = "Eu sou uma string interessante e estou preste a ser manipulada por funções";

    println("Trazendo o tamanho da strng ${myString.length}");

    println("Trazendo um elemento da string por index ${myString[7]}");

    println("Minha string começa com a letra A? ${myString.startsWith("A")}");

    println("Minha string finaliza com a letra s? ${myString.endsWith("s")}");

    println("Fatia minha string, ${myString.substring(7, 14)}");

    println("Trocando eu sou uma string por eu sou um texto... ${myString.replace("uma string", "um texto")}");

    println("Vai para minusculo  ${myString.lowercase()}");

    println("Vai para maisculo ${myString.uppercase()} ");

    println("Trimcando a string, ${myString.trim()}");
}