package lab_4

fun main(){
    val variable_1: Int = 5
    val variable_2: Int = 8
    val range = if (variable_1 > variable_2)
        variable_2..variable_1 else variable_1..variable_2

    val varibleArray = range.toList()
    println("Введенные числа: $variable_1 и  $variable_2")
    println("Массив: ${varibleArray.joinToString(", ")}")
}
