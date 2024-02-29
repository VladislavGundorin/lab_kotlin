package lab_2

fun main(){
    print("Введите ваш возраст: ")
    val age = readln()!!.toInt()
    if(age > 18)
        println("Вам уже все можно")
    if (age == 18)
        println("Ура, Вам 18 лет!")
    if (age < 18)
        println("Вы еще слишком молоды")
}
//fun main() {
//    print("Введите ваш возраст: ")
//    val age = readln().toInt()
//
//    when {
//        age > 18 -> println("Вам уже все можно")
//        age == 18 -> println("Ура, Вам 18 лет!")
//        else -> println("Вы еще слишком молоды")
//    }
//}