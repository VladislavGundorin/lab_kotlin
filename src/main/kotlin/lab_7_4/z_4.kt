package lab_7_4

import kotlinx.coroutines.*

suspend fun <T> withTimeoutOrDefault(timeMillis: Long, default: T, block: suspend () -> T): T {
    return try {
        withTimeout(timeMillis) {
            block()
        }
    } catch (e: TimeoutCancellationException) {
        println("Слишком долго")
        default
    }
}

suspend fun longRunningTask(duration: Long): String {
    delay(duration)
    return "Завершено в $duration мс"
}

fun main() = runBlocking {
    val result1 = withTimeoutOrDefault(1000L, "По умолчанию") { longRunningTask(500L) }
    println(result1)

    val result2 = withTimeoutOrDefault(1000L, "По умолчанию") { longRunningTask(1500L) }
    println(result2)
}
