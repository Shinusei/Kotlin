package src.`9`.`2`

class BestRepairEver {
    fun canRepair(device: Device): Boolean {
        return when (device.type) {
            "computer", "phone" -> true
            else -> false
        }
    }
}