fun main() {
    val n = readln().toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    val uniqueNumbers = numbers.distinct()
    println(uniqueNumbers.size)
    val count = numbers.groupingBy { it }.eachCount()
    for (i in count) {
        println("${count[i.key]} ${i.key}")
    }
}