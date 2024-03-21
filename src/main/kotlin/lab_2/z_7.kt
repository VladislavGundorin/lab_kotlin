package lab_2

fun main(){
    println("Введите первое число: ")
    val varible_1 = readln().toInt()
    println("Введите второе число: ")
    val varible_2 = readln().toInt()
    val result = if ((varible_1 % 2 ==0) && (varible_2 % 2 == 0)) true else false
    println(result)
}