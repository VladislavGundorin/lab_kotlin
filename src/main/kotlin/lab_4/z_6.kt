package lab_4

fun main(){
    println("Введите элементы массива через зяпятую: ")
    val input = readLine()
    val numbers = input?.split(",")?.map {it.toInt()}?: emptyList()
    val average = numbers.average()
    println("Среднее арифметическое: $average")

    println("Элементы массива, больше среднего арифметического:")
    val filterNumbers = numbers.filter { it > average }.sorted()
    println(filterNumbers.joinToString(","))
    //5,8,18,34,3,56,43,27,4,23
}