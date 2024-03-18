package lab_3

fun main(){
    var numSum: Int = 0
    for (i in 1..100){
        if(i % 4 ==0){
            numSum+=i
        }
    }
    println("Сумма чисел кратных 4: $numSum")
}