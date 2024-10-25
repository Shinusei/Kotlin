package src.`8`.`1`

enum class Drinks(val volume: Int) {
    WATER(250),
    COFFEE(180),
    TEA(200),
    JUICE(300);

    fun getFormattedName(): String {
        return this.name.lowercase().replaceFirstChar { it.uppercase() }
    }
}