fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toDouble() }
    val average = numbers.sum() / n
    println(average)
}