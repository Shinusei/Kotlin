import kotlin.random.Random

fun generatePassword(length: Int): String {
    val uppercaseLetters = ('A'..'Z').toList()
    val lowercaseLetters = ('a'..'z').toList()
    val numbers = ('0'..'9').toList()
    val specialCharacters = listOf('_', '*', '-')
    
    val allCharacters = uppercaseLetters + lowercaseLetters + numbers + specialCharacters
    
    var password = (1..length).map { Random.nextInt(allCharacters.size) }
        .map { allCharacters[it] }
        .joinToString("")
    password = if (password.any {it in uppercaseLetters} && 
        password.any {it in lowercaseLetters} && 
        password.any {it in numbers} && 
        password.any {it in specialCharacters}) password else generatePassword(length)
    return password
}

fun main() {
    while (true) {
        print("Введите длину пароля (не менее 8 символов): ")
        val length = readLine()?.toIntOrNull() ?: 0
        
        if (length < 8) {
            println("Пароль с $length количеством символов небезопасен. Пожалуйста, введите другое значение.")
        } else {
            val password = generatePassword(length)
            println("Сгенерированный пароль: $password")
            break
        }
    }
}