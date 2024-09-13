fun main() {
    var dna = readln()
    var counts = IntArray(4)

    for (c in dna) {
        when (c) {
            'A' -> counts[0]++
            'T' -> counts[1]++
            'G' -> counts[2]++
            'C' -> counts[3]++
        }
    }

    println("${counts[0]} ${counts[1]} ${counts[2]} ${counts[3]}")
}