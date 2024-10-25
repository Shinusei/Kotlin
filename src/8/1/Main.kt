package src.`8`.`1`

fun main(){
    for(i in Drinks.entries){
        println("${i.getFormattedName()}: ${i.volume}")
    }
}