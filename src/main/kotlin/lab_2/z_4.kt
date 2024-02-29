package lab_2

fun main(){
    println("Введите число от 1 до 7.")
    val number = readln().toInt()
    if(number !in 1..7){
        println("Некорректный ввод. Введите число от 1 до 7.")
        return
    }
    val day = when(number){
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Некорректный ввод"
    }
    println(day)
}