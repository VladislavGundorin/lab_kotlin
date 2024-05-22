package lab_3

//fun main(){
//    println("Введи любое число и узнай делитель своего числа: ")
//    var num = readln().toInt()
//    val container = mutableListOf<Int>()
//    for (i in 1..2){
//        if(num % i == 0){
//            container.add(i)
//        }
//    }
//    println("Числа, которые делятся на $num без остатка: ${container.joinToString()}")
//}

fun main() {
    println("Введите любое число и узнайте его делители: ")
    var num = readLine()?.toIntOrNull() ?: 0
    val container = mutableListOf<Int>()
    if (num > 0) {
        val sqrtNum = Math.sqrt(num.toDouble()).toInt()
        for (i in 1..sqrtNum) {
            if (num % i == 0) {
                container.add(i)
                if (i != num / i) {
                    container.add(num / i)
                }
            }
        }
        container.sort()
        println("Числа, которые делятся на $num без остатка: ${container.joinToString()}")
    } else {
        println("Вы ввели некорректное число.")
    }
}
