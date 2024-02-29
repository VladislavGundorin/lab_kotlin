package lab_2

fun main(){
    println("Введите первое число:")
    val varible_1 = readln().toInt()
    println("Введите второе число:")
    val varible_2 = readln().toInt()
    println("У вас есть числа: $varible_1 и $varible_2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")
    print("Выберите действие: ")

    when(readln().toInt()){
        1 ->{
            var result = varible_1 + varible_2
            println("Результат сложения: $result")
        }
        2 ->{
            var result = varible_1 - varible_2
            println("Результат вычитания: $result")
        }
        0 -> println("Никаких действий не выполнено.")
        else -> println("Неверный выбор выберите 1, 2 или 0.")
    }
}