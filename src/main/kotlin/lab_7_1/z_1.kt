package lab_7_1

import kotlinx.coroutines.*
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main() {
    runBlocking {
        launch {
            while (true) {
                val currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
                println("Текущее время: $currentTime")
                delay(1000L)
            }
        }
    }
}
