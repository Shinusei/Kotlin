import kotlin.random.Random

fun gameAlgorithm() {
    val M = Random.nextInt(0, 1001)
    
    while (true) {
        print("Угадайте число (или введите отрицательное число для выхода): ")
        val userNumber = readLine()?.toIntOrNull() ?: 0
        if (userNumber < 0) {
            println("Выход из игры.")
            break
        }
        when {
            userNumber == M -> {
                println("Победа!")
                break
            }
            userNumber < M -> println("Это число меньше загаданного.")
            else -> println("Это число больше загаданного.")
        }
    }
}

fun main() {
    while (true) {
        println("Игра 'Угадай число'")
        println("--------------------")
        println("1. Начать игру")
        println("2. Выход")
        
        print("Выберите пункт меню: ")
        val choice = readLine()?.trim() ?: ""
        when (choice) {
            "1" -> gameAlgorithm()
            "2" -> {
                println("Выход из программы.")
                break
            }
            else -> println("Некорректный выбор. Выход из программы.")
        }
    }
}