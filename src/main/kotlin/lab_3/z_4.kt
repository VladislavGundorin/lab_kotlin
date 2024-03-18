package lab_3

fun main(){
    val numConst = readln().toInt()
    if(numConst != null){
        var evenCount = 0
        var oddCount = 0
        val digits = numConst.toString()
        for(digitChar in digits){
            val digit = digitChar.toString().toInt()
            if (digit % 2 == 0){
                evenCount++
            }else{
                oddCount++
            }
        }
        println("Количество четных цифр: $evenCount")
        println("Количество нечетных цифр: $oddCount")
    } else {
        println("Вы ввели некорректное число.")
    }
}