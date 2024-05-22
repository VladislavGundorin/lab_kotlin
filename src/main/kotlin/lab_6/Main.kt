import java.util.concurrent.Executors

fun main() {
    val executor = Executors.newFixedThreadPool(2)  // Пул из двух потоков
    for (i in 1..5) {
        executor.execute {
            println("Задача $i выполнена потоком: ${Thread.currentThread().name}")
        }
    }
    executor.shutdown()  // Запрет на добавление новых задач и начало процесса завершения
}
