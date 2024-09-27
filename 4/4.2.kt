fun calculateNutrients(norms: List<Int>, weeklyIntake: List<List<Int>>): String {
    val Intake = arrayOf( weeklyIntake.map {it[0]}.sum().toInt(), 
            weeklyIntake.map {it[1]}.sum().toInt(), 
            weeklyIntake.map {it[2]}.sum().toInt(), 
            weeklyIntake.map {it[3]}.sum().toInt())
    return if (Intake[0] < norms[0] && Intake[1] < norms[1] && Intake[2] < norms[2] && Intake[3] < norms[3]) "Отлично" else "Нужно есть поменьше"
}

fun main() {
    val norms = readLine()?.split(" ")?.map { it.toInt() } ?: listOf()
    
    val weeklyIntake = mutableListOf<List<Int>>()
    
    for (i in 1..7) {
        weeklyIntake.add(readLine()?.split(" ")?.map { it.toInt() } ?: listOf())
    }
    println(::calculateNutrients.call(norms, weeklyIntake))
}