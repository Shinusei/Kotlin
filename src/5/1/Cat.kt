package src.`5`.`1`

import kotlin.random.Random

class Cat {
    private fun rest() {
        println("Sleep")
    }
    private fun voice() {
        print("Meow")
    }
    private fun feed() {
        print("Eat")
    }
    fun randomAction() {
        when (Random.nextInt(1, 3)) {
            1 -> rest()
            2 -> voice()
            3 -> feed()
        }
    }
}