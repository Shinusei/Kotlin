fun topKFrequent(words: Array<String>, k: Int): Array<String> {
    val wordCount = words.groupingBy { it }.eachCount()
    val sortedWords = wordCount.entries.sortedByDescending { it.value }.sortedByDescending { it.key }
    return sortedWords.take(k).map { it.key }.toTypedArray()
}

fun main() {
    val words = arrayOf(readLine().split(" "))
    val k = 4
    val result = topKFrequent(words, k)
    println(result.joinToString(", "))
}