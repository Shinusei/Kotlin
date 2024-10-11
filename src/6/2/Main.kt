package src.`6`.`2`

fun main() {
    val str = UniqueString("  Hello, world!  ")
    println(str.len())
    println(str.contains("world"))
    str.trim()!!.print()
    str.reverse().print()
    println(str.charAt(3))
}