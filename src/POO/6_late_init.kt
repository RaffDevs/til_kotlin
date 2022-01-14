class Person {
    lateinit var name: String;

    fun createPerson(name: String) {
        this.name = name;
    }

    fun sayMyName() {
        println("Hello my name is $name, nice to meet you!");
    }
}

fun main() {
    val person = Person();
    person.createPerson("Rafael");
    person.sayMyName();
}