package src.`9`.`1`

import src.`9`.`1`.Animals.*

fun main() {
    val dolphin = Dolphin()
    println("dolphin")
    dolphin.eat()
    dolphin.sleep()
    dolphin.wayOfBirth()
    println(dolphin.speed)

    val eagle = Eagle()
    println("eagle")
    eagle.eat()
    eagle.sleep()
    eagle.wayOfBirth()
    println(eagle.speed)

    val goldFish = GoldFish()
    println("goldFish")
    goldFish.eat()
    goldFish.sleep()
    goldFish.wayOfBirth()
    println(goldFish.speed)

    val bat = Bat()
    println("bat")
    bat.eat()
    bat.sleep()
    bat.wayOfBirth()
    println(bat.speed)
}