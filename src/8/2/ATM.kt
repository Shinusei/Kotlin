package src.`8`.`2`

import java.util.*

class ATM {
    private var transactions = mutableListOf<Transaction>()

    fun makeTransaction(cardNumber: String, amount: Double, date: Date, type: TransactionType) {
        val card = findCard(cardNumber)
        when (type) {
            TransactionType.WITHDRAWAL -> {
                if (card != null) {
                    if (amount > card.getBalance().toDouble()) {
                        println("Недостаточно средств")
                        return
                    }
                }
                when (card) {
                    is CreditCard -> card.debt += amount
                    is DebitCard -> card.balance -= amount
                }
            }
            TransactionType.DEPOSIT -> {
                when (card) {
                    is CreditCard -> card.debt -= amount
                    is DebitCard -> card.balance += amount
                }
            }
        }

        transactions.add(Transaction(cardNumber, amount, date, type))
    }

    fun printTransactions(cardNumber: String) {
        println("История транзакций для карты $cardNumber:")
        transactions.filter { it.cardNumber.equals(cardNumber) }
            .forEach { println(it) }
    }

    private fun findCard(cardNumber: String): BankCard? {
        return listOf<BankCard>().find { it.number == cardNumber }
    }
}