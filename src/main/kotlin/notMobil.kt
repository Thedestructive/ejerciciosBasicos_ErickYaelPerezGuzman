fun main(){
    val morningNotification=51
    val eveningNotification =135

    printNotifcationSummary(morningNotification)
    printNotifcationSummary(eveningNotification)
}

fun printNotifcationSummary(numberOfMessages: Int){
    if (numberOfMessages in 1..99){
        println("You have $numberOfMessages notifications")
    }else{
        println("Your phone is blowing up! You have 99+ notifications")
    }
}