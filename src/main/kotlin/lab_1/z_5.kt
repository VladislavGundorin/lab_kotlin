package lab_1

fun main() {
    print("Введите число: ")
    val n = readLine()!!.toInt()
    val output = "${n}${n * 2}"
    println("Получаем: $output")
}
