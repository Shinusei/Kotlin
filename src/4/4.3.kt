fun topKFrequent(words: Array<String>, k: Int): Array<String> {
    val wordCount = words.groupingBy { it }.eachCount().toList().sortedByDescending { it.second }.toMap()
    return wordCount.keys.take(k).toTypedArray()
}

fun main() {
    val words = arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is", "day")
    val k = 4
    val result = topKFrequent(words, k)
    println(result.joinToString(", "))
}