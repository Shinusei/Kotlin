fun isSymmetric(matrix: Array<IntArray>): Boolean {
    val n = matrix.size
    
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (matrix[i][j] != matrix[n - j - 1][n - i - 1]) {
                return false
            }
        }
    }
    
    return true
}

fun main() {
    val n = readLine()?.toIntOrNull() ?: 0
    
    val matrix = Array(n) { IntArray(n) }
    
    for (i in 0 until n) {
        matrix[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }
    
    val isSymmetric = isSymmetric(matrix)
    println(isSymmetric)
}