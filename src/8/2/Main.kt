package src.`8`.`2`

import java.util.*

fun main() {
    val atm = ATM()

    val creditCard = CreditCard("1234567890123456", "1234", 1000.0)
    val debitCard = DebitCard("9876543210987654", "4321", 500.0)

    atm.makeTransaction(creditCard.number, 200.0, Date(), TransactionType.WITHDRAWAL)
    atm.makeTransaction(debitCard.number, 100.0, Date(), TransactionType.DEPOSIT)

    atm.printTransactions(creditCard.number)
    atm.printTransactions(debitCard.number)
}