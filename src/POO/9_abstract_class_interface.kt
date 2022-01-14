interface Selvagem {
    fun morder() {}
}

abstract class Mamifero {
    abstract fun mamar()
}

class Cachorro() : Mamifero(), Selvagem {
    override fun mamar() {
        TODO("Not yet implemented")
    }

    override fun morder() {
        super.morder()
    }
}

fun main() {

}