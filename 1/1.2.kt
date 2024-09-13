fun main() {
    var n = readln().toInt()
    var change = intArrayOf(8, 4, 2, 1)
    var counts = IntArray(4)

    for (i in 0..3) {
        counts[i] = n / change[i]
        n %= change[i]
    }

    println("${counts[0]} ${counts[1]} ${counts[2]} ${counts[3]}")
}
