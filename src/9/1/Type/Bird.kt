package src.`9`.`1`.Type

import src.`9`.`1`.Activity.*

abstract class Bird: RegularActivity() {
    override fun wayOfBirth() {
        println("Laying eggs")
    }
}