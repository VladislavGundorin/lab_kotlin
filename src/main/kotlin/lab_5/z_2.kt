package lab_5

fun main(){
    println(addWord(12))
    println(addWord(4))
    println(addWord(415))
    println(addWord(72))
}
fun addWord(number: Int): String {
    return when {
        number % 10 == 1 -> "$number год"
        number % 10 in 2..4 && number % 100 !in 12..14 -> "$number года"
        else -> "$number лет"
    }
}