fun findDuplicate(strings: List<String>): String? {
    val seen = mutableSetOf<String>()
    for (string in strings) {
        if (string in seen) {
            return string
        }
        seen.add(string)
    }
    return null
}

fun main() {
    val n = readln()
    val strings = List(n.toInt()) { readLine()!! }
    val duplicate = findDuplicate(strings)
    println(duplicate)
}