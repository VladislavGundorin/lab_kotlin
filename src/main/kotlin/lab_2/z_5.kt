package lab_2

//fun main(){
//    println("Введите три числа:")
//    val a = readln().toInt()
//    val b = readln().toInt()
//    val c = readln().toInt()
//
//    if(a == b || a == c || b == c){
//        println("Ошибка")
//    }else{
//        val result = (a + b + c) / 3
//        println("Среднее значение: $result")
//    }
//}
fun main() {
    println("Введите три числа:")
    println("Первое:")
    val number1 = readln().toDouble()
    println("Второе:")
    val number2 = readln().toDouble()
    println("Третье:")
    val number3 = readln().toDouble()

    val result = when {
        number1 == number2 && number2 == number3 -> "Ошибка"
        else -> {
            val sum = number1 + number2 + number3
            val min = minOf(number1, number2, number3)
            val max = maxOf(number1, number2, number3)
            val average = sum - min - max

            "Среднее из трех чисел: $average"
        }
    }

    println(result)
}
//fun main() {
//    val a = readLine()!!.toDouble()
//    val b = readLine()!!.toDouble()
//    val c = readLine()!!.toDouble()
//
//    if (a == b && b == c) {
//        println("Ошибка")
//    } else {
//        val average = (a + b + c) / 3
//        println("Среднее значение: $average")
//    }
//}
