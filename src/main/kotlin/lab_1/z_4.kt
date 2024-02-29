package lab_1

fun main(){
    println("Введи число для определения количества лет, недель, дней")
    val number = readln()
    val workingWithNumbers = number.toInt()
    val years = workingWithNumbers / 365
    val weeks = (workingWithNumbers % 365) / 7
    val days = workingWithNumbers % 7
    println("Результат: лет: $years, недель: $weeks, дней: $days")

}