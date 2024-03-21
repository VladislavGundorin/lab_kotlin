package lab_4

fun main() {
    println("Введите числа через запятую:")
    val input = readLine()
    val numbers = input?.split(",")?.mapNotNull { it.toIntOrNull() }
    if (numbers != null && numbers.size >= 2) {
        val secondMin = numbers.sorted()[1]
        println(secondMin)
    } else {
        println("Длина массива меньше 2-х чисел")
    }
}
