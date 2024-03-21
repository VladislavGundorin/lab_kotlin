package lab_5

fun main(){
println(rounding(1272))
}
fun rounding(number: Int): String {
    return if (number >= 1000 && number < 10000) {
        val rounded = number.toString().substring(0, 1) + "K"
        rounded
    } else {
        number.toString()
    }
}
