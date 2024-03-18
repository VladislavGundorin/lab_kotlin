package lab_3

fun main(){
    var i: Int = 5
    var sum = 0
    while (i <= 57) {
        if (i == 34 || i == 46 || i == 52) {
            i++
            continue
        }
        sum+=i
        i++
    }
    println("Сумма чисел от 5 до 57, кроме чисел 34, 46 и 52, равна $sum")
}