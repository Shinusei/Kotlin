package src.`6`.`1`

import kotlin.time.measureTime

fun main(){
    var time = TimeMeasure(23, 13, 15)
    time.print24HourFormat()
    time.print12HourFormat()
    time.addTime(3, 7, 190)
    time.print24HourFormat()
}