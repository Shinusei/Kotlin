package src.`5`.`2`

fun main() {
    val student = Student()
    student.setFirstName("ivan")
    student.setLastName("ivanov")
    student.setScores(intArrayOf(85, 92, 78, 95))
    student.addScore(88)

    println("Имя студента: ${student.getFirstName()}")
    println("Фамилия студента: ${student.getLastName()}")
    println("Средняя оценка: ${student.getAverageScore()}")
}
