package src.`8`.`2`

class CreditCard(number: String, pin: String, val creditLimit: Double, var debt: Double = 0.0) : BankCard(number, pin) {
    override fun getBalance(): String {
        return (creditLimit - debt).toString()
    }
}