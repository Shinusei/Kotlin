package src.`8`.`2`

class DebitCard(number: String, pin: String, var balance: Double = 0.0) : BankCard(number, pin) {
    override fun getBalance(): String {
        return balance.toString()
    }
}