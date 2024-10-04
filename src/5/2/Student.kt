package src.`5`.`2`

class Student {
    private var firstName: String = ""
    fun getFirstName(): String {
        return firstName
    }
    fun setFirstName(value: String) {
        firstName = value
    }

    private var lastName: String = ""
    fun getLastName(): String {
        return lastName
    }
    fun setLastName(value: String) {
        lastName = value
    }

    private var scores: IntArray = IntArray(10)
    fun setScores(scores: IntArray) {
        if (scores.size <= this.scores.size) {
            System.arraycopy(scores, 0, this.scores, 0, scores.size)
        } else {
            throw IllegalArgumentException("Новый массив оценок слишком большой")
        }
    }
    fun addScore(score: Int) {
        System.arraycopy(scores, 1, scores, 0, scores.size - 1)
        scores[scores.size - 1] = score
    }
    fun getAverageScore(): Double {
        if (scores.isEmpty()) {
            return 0.0
        }
        return scores.average()
    }

    override fun toString(): String {
        return "Student(firstName='$firstName', lastName='$lastName', scores=${scores.contentToString()})"
    }

}
