package lab_3

fun main(){
    val numConst = 5
    println("Угадай загаданное число от 1 до 9.")
    var num = readln().toInt()
    while (numConst !==num){
        println("Число не совпадает, пробуй еще раз.")
        num = readln().toInt()
    }
    println("Выйграл")
}