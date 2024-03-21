fun main() {
    val numbers = mutableListOf<Int>()
    println("Вводите числа через запятую (пример:24,-63,67,-12):")
    val input = readLine()

    input?.split(",")?.forEach {
        val number = it.toIntOrNull()
        if (number != null) {
            numbers.add(number)
        } else {
            println("Ошибка: некорректное значение '$it'.")
        }
    }
    val minElement = numbers.minOrNull()
    val maxElement = numbers.maxOrNull()
    println("Минимальный элемент: $minElement")
    println("Максимальный элемент: $maxElement")
}
