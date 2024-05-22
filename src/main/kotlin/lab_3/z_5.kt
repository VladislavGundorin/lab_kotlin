package lab_3

fun main(){
    var numSum: Int = 0
    for (i in 4..100 step 4){
            numSum+=i
        }
    println("Сумма чисел кратных 4: $numSum")
}