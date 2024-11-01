package src.`9`.`2`

fun main() {
    val repairShop = BestRepairEver()

    val computer = Device("computer", "broken screen")
    val phone = Device("phone", "battery issue")
    val tablet = Device("laptop", "charging port")

    println(repairShop.canRepair(computer))
    println(repairShop.canRepair(phone))
    println(repairShop.canRepair(tablet))
}