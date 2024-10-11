package src.`6`.`1`

import kotlin.system.exitProcess

class TimeMeasure(hours: Int, minutes: Int = 0, seconds: Int = 0) {
    private var hours: Int = 0
    private var minutes: Int = 0
    private var seconds: Int = 0

    init {
        when(hours) {
            in(0..24) -> this.hours = hours
            else -> {
                println("Hours invalid")
                exitProcess(1)
            }
        }
        when(minutes) {
            in(0..60) -> this.minutes = minutes
            else -> {
                println("Minutes invalid, set 0")
            }
        }
        when(seconds) {
            in(0..60) -> this.seconds = seconds
            else -> {
                println("Seconds invalid, set 0")
            }
        }
    }

    fun print24HourFormat() {
        println("%02d:%02d:%02d".format(hours, minutes, seconds))
    }

    fun print12HourFormat() {
        val amPm = if (hours < 12) "AM" else "PM"
        val hours12 = hours % 12
        println("%02d:%02d:%02d %s".format(hours12, minutes, seconds, amPm))
    }

    fun addTime(hours: Int, minutes: Int, seconds: Int) {

        var totalSeconds = this.seconds + seconds
        var totalMinutes = this.minutes + minutes + totalSeconds / 60
        var totalHours = this.hours + hours + totalMinutes / 60

        totalSeconds %= 60
        totalMinutes %= 60
        totalHours %= 24

        this.hours = totalHours
        this.minutes = totalMinutes
        this.seconds = totalSeconds
    }
}