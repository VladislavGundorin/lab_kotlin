package lab_8_2


import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.*
import java.io.File

suspend fun main() {
    val urls = (1..100).map { "https://example.com/image$it.jpg" }
    val downloadDirectory = "src/main/kotlin/org/example/images"
    File(downloadDirectory).mkdirs()

    val client = HttpClient(CIO)

    val urlToFileNames = urls.mapIndexed { index, url ->
        url to "custom_name_${index + 1}.jpg"
    }.toMap()

    val job = CoroutineScope(Dispatchers.Default).launch {
        val imageJobs = urlToFileNames.map { (url, fileName) ->
            async {
                try {
                    val imageBytes: ByteArray = client.get(url).body()
                    File("$downloadDirectory/$fileName").writeBytes(imageBytes)
                    println("Загружено и сохранено $fileName")
                } catch (e: Exception) {
                    println("Не удалось загрузить изображение  $url: ${e.message}")
                }
            }
        }
        imageJobs.awaitAll()
    }

    job.join()
    client.close()
    println("Все изображения, загруженны с  именами.")
}
