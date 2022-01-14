class Pessoa(val name: String, val nasc: Int) {
    var dormindo: Boolean = false;
    var estadoCivil: String? = null;

    constructor(name: String, nasc: Int, estadoCivil: String): this(name, nasc) {
        this.estadoCivil = estadoCivil;
    }

    fun dormir() {
        if(dormindo) {
            println("O $name já está dormindo!");
            return;
        }

        dormindo = true;

        println("Agora $name está dormindo!");
    }

    fun acordar() {
        if (dormindo) {
            dormindo = false;

            println("Agora $name está acordado!");
            return;
        }

        println("$name já está acordado!");
    }

}

fun main() {
    val pessoa: Pessoa = Pessoa("Rafael", 1997);
}