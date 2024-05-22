package lab_6

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun createGreetingFunction(greeting: String): (String) -> String {
    return { name: String -> "$greeting, $name!" }
}

fun main() {
    val sum = operateOnNumbers(5, 3) { x, y -> x + y }
    println("Sum: $sum")

    val product = operateOnNumbers(5, 3) { x, y -> x * y }
    println("Product: $product")


    val greetMorning = createGreetingFunction("Доброе утро")
    val greetEvening = createGreetingFunction("Добрый вечер")

    println(greetMorning("Антон"))
    println(greetEvening("Алексей"))
}
