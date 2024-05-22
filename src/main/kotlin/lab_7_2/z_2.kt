package lab_7_2

import kotlinx.coroutines.*

suspend fun complexMathOperation(x: Double, y: Double): Double {
    delay(2000L)
    return Math.pow(x, y) + Math.sqrt(x * y)
}

//fun main() = runBlocking {
//    val result = async { complexMathOperation(5.0, 3.0) }
//    println("Результат вычисления: ${result.await()}")
//}
fun main() = runBlocking {
    val job1 = async { complexMathOperation(5.0, 3.0) }
    val job2 = async { complexMathOperation(2.0, 8.0) }

    println("Первый результат: ${job1.await()}")
    println("Второй результат: ${job2.await()}")
}