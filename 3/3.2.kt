fun encodeMorseCode(s: String): String {
    val morseCodeArray = arrayOf(
        ".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.",
        "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--",
        "-.--", "-..-", "..-..", "..--", ".-.-"
    )
    val alphabet = "АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
    
    return s.uppercase().map { char ->
        val index = alphabet.indexOf(char)
        morseCodeArray[index]
    }.joinToString(" ")
}

fun main() {
    val s = "ПРИВЕТ"
    val encodedString = encodeMorseCode(s)
    println("Кодированная строка: $encodedString")
}