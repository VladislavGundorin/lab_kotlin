package lab_7_3

import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun generateAndCheckEven(index: Int): Pair<Int, Boolean> {
    val randomNumber = Random.nextInt()
    val isEven = randomNumber % 2 == 0
    return Pair(index, isEven)
}

fun main() = runBlocking {
    val results = mutableMapOf<Int, Boolean>()
    val totalCoroutines = 100_000

    val time = measureTimeMillis {
        val jobs = List(totalCoroutines) { index ->
            async {
                val result = generateAndCheckEven(index)
                results[result.first] = result.second
            }
        }
        jobs.awaitAll()
    }
    val evenCount = results.values.count { it }

    println("Количество четных чисел: $evenCount")
    println("Общее время выполнения: $time ms")

//    println("Результаты выполнения:")
//    results.forEach { (index, isEven) ->
//        println("Коррутина #$index: ${if (isEven) "четное" else "нечетное"} число")
//    }
}
