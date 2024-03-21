package lab_4

fun main() {
    val testMasiv: MutableList<Int> = mutableListOf()
    testMasiv.addAll(listOf(8, 21, 5, 90, 11, 0))
    testMasiv.add(0, 90)
    testMasiv.removeAt(4)
    testMasiv.add(-35)
    println(testMasiv)
}