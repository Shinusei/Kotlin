package src.`5`.`3`

import src.`5`.`2`.Student

fun main(){
    val service = StudentService()
    val student = Student()
    student.setFirstName("ivan")
    student.setLastName("ivanov")
    student.setScores(intArrayOf(85, 92, 78, 95))
    student.addScore(88)
    val student1 = Student()
    student1.setFirstName("ivan1")
    student1.setLastName("aivanov1")
    student1.setScores(intArrayOf(85, 100, 100))

    println(service.findBestStudent(listOf(student, student1)))
    println(service.sortStudentsByLastName(listOf(student, student1)))
}