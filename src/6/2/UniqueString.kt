package src.`6`.`2`

import java.awt.List
import kotlin.system.exitProcess

class UniqueString() {
    private lateinit var chars: CharArray

    constructor(charArray: CharArray) : this() {
        this.chars = charArray
    }
    constructor(str: String) : this() {
        this.chars = str.toCharArray()
    }

    fun charAt(index: Int): Char {
        if (index > len()) {
            println("out of range")
            exitProcess(1)
        }
        return chars[index]
    }
    fun len(): Int{
        return chars.size
    }

    fun print() = println(chars.joinToString(""))

    fun contains(substring: CharArray): Boolean {
        return chars.joinToString("").contains(substring.joinToString(""))
    }

    fun contains(substring: String): Boolean = contains(substring.toCharArray())

    fun trim(): UniqueString {
        val startIndex = chars.indexOfFirst { !it.isWhitespace() } ?: 0
        return chars.let { UniqueString(it.copyOfRange(startIndex, chars.size)) }
    }

    fun reverse(): UniqueString {
        return UniqueString(chars.reversed().toCharArray())
    }
}