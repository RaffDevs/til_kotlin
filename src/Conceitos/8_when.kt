fun main () {
    println("Salario do gerente ${salaryWhen("Gerente")}");
    println("Bonus do gerente ${bonusWhen("Gerente")}");
    println(5 in 1..10);
    println("R" in "Rafael");

}

fun bonusWhen(cargo: String): Float {
    var bonus = 0f;

    when(cargo) {
        "Gerente" -> {
            bonus = 2000f;
        }

        "Coordenador" -> {
            bonus = 1500f;
        }

        "Programador" -> {
            bonus = 1000f;
        }

        else -> {
            bonus = 500f;
        }
    }

    return bonus;
}

fun salaryWhen(cargo: String): Float {
    val salary = when(cargo) {
        "Gerente" -> 2000f;

        "Coordenador" -> 1500f;

        "Programador" -> 1000f;

        else -> 500f;
    }

    return salary;
}