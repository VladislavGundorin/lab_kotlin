package lab_3

fun main(){
    println("Введи любое число и узнай делитель своего числа: ")
    var num = readln().toInt()
    val container = mutableListOf<Int>()
    for (i in 1..num){
        if(num % i == 0){
            container.add(i)
        }
    }
    println("Числа, которые делятся на $num без остатка: ${container.joinToString()}")
}