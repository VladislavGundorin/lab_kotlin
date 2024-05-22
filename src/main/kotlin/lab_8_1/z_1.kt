package lab_8_1

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.*

import java.io.File

suspend fun main() {
    val urls = listOf(
        "https://example.com/image1.jpg",
        "https://example.com/image2.jpg",
        "https://example.com/image3.jpg",
        "https://example.com/image4.jpg",
        "https://example.com/image5.jpg",
        "https://example.com/image6.jpg",
        "https://example.com/image7.jpg",
        "https://example.com/image8.jpg",
        "https://example.com/image9.jpg",
        "https://example.com/image10.jpg",
        "https://example.com/image11.jpg",
        "https://example.com/image12.jpg",
        "https://example.com/image13.jpg",
        "https://example.com/image14.jpg",
        "https://example.com/image15.jpg",
        "https://example.com/image16.jpg",
        "https://example.com/image17.jpg",
        "https://example.com/image18.jpg",
        "https://example.com/image19.jpg",
        "https://example.com/image20.jpg",
        "https://example.com/image21.jpg",
        "https://example.com/image22.jpg",
        "https://example.com/image23.jpg",
        "https://example.com/image24.jpg",
        "https://example.com/image25.jpg",
        "https://example.com/image26.jpg",
        "https://example.com/image27.jpg",
        "https://example.com/image28.jpg",
        "https://example.com/image29.jpg",
        "https://example.com/image30.jpg",
        "https://example.com/image31.jpg",
        "https://example.com/image32.jpg",
        "https://example.com/image33.jpg",
        "https://example.com/image34.jpg",
        "https://example.com/image35.jpg",
        "https://example.com/image36.jpg",
        "https://example.com/image37.jpg",
        "https://example.com/image38.jpg",
        "https://example.com/image39.jpg",
        "https://example.com/image40.jpg",
        "https://example.com/image41.jpg",
        "https://example.com/image42.jpg",
        "https://example.com/image43.jpg",
        "https://example.com/image44.jpg",
        "https://example.com/image45.jpg",
        "https://example.com/image46.jpg",
        "https://example.com/image47.jpg",
        "https://example.com/image48.jpg",
        "https://example.com/image49.jpg",
        "https://example.com/image50.jpg",
        "https://example.com/image51.jpg",
        "https://example.com/image52.jpg",
        "https://example.com/image53.jpg",
        "https://example.com/image54.jpg",
        "https://example.com/image55.jpg",
        "https://example.com/image56.jpg",
        "https://example.com/image57.jpg",
        "https://example.com/image58.jpg",
        "https://example.com/image59.jpg",
        "https://example.com/image60.jpg",
        "https://example.com/image61.jpg",
        "https://example.com/image62.jpg",
        "https://example.com/image63.jpg",
        "https://example.com/image64.jpg",
        "https://example.com/image65.jpg",
        "https://example.com/image66.jpg",
        "https://example.com/image67.jpg",
        "https://example.com/image68.jpg",
        "https://example.com/image69.jpg",
        "https://example.com/image70.jpg",
        "https://example.com/image71.jpg",
        "https://example.com/image72.jpg",
        "https://example.com/image73.jpg",
        "https://example.com/image74.jpg",
        "https://example.com/image75.jpg",
        "https://example.com/image76.jpg",
        "https://example.com/image77.jpg",
        "https://example.com/image78.jpg",
        "https://example.com/image79.jpg",
        "https://example.com/image80.jpg",
        "https://example.com/image81.jpg",
        "https://example.com/image82.jpg",
        "https://example.com/image83.jpg",
        "https://example.com/image84.jpg",
        "https://example.com/image85.jpg",
        "https://example.com/image86.jpg",
        "https://example.com/image87.jpg",
        "https://example.com/image88.jpg",
        "https://example.com/image89.jpg",
        "https://example.com/image90.jpg",
        "https://example.com/image91.jpg",
        "https://example.com/image92.jpg",
        "https://example.com/image93.jpg",
        "https://example.com/image94.jpg",
        "https://example.com/image95.jpg",
        "https://example.com/image96.jpg",
        "https://example.com/image97.jpg",
        "https://example.com/image98.jpg",
        "https://example.com/image99.jpg",
        "https://example.com/image100.jpg"
    )

    val client = HttpClient(CIO)

    val downloadDirectory = "src/main/kotlin/org/example/images"
    File(downloadDirectory).mkdirs()

    val job = CoroutineScope(Dispatchers.Default).launch {
        val images = urls.map { url ->
            async {
                try {
                    val imageBytes: ByteArray = client.get(url).body()
                    imageBytes to url.substringAfterLast("/")
                } catch (e: Exception) {
                    println("Не удалось загрузить изображение  $url: ${e.message}")
                    null
                }
            }
        }.mapNotNull { it.await() }

        images.forEach { (image, fileName) ->
            File("$downloadDirectory/$fileName").writeBytes(image)
        }
    }

    job.join()
    client.close()
    println("Все загруженные изображения.")
}
