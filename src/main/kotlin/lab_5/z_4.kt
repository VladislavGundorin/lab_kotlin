package lab_5

fun countWords(input: String): Int {
    val delimiters = charArrayOf(' ', ',', '.', ';', ':')
    val words = input.split(*delimiters)
    val nonEmptyWords = words.filter { it.isNotEmpty() }
    return nonEmptyWords.size
}
fun main() {
    val input = "Это все фрукты: мандарин, апельсин; вафелька."

    val wordCount = countWords(input)
    println("Количество слов в строке: $wordCount")
}
