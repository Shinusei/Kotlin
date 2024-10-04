package src.`5`.`3`

import src.`5`.`2`.Student

class StudentService {
    fun findBestStudent(students: List<Student>): Student? {
        return students.maxByOrNull { it.getAverageScore() }
    }

    fun sortStudentsByLastName(students: List<Student>): List<Student> {
        return students.sortedBy { it.getLastName() }
    }
}