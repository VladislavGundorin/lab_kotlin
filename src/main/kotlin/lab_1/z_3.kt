package lab_1

fun main(){
    val number = readln()
    print("Введите число с 4 цифрами: ")
    val numberr = number.toInt()
    var varible_1 = numberr / 1000 % 10
    val varible_2 = numberr / 100 % 10
    val varible_3 = numberr / 10 % 10
    val varible_4 = numberr % 10

    println("Результат: $varible_1, $varible_2, $varible_3, $varible_4")


}