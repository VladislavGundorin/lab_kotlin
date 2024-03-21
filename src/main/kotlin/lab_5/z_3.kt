package lab_5


fun main() {
    println(FinalPrice(1000.0,20.0))
}
fun FinalPrice(originalPrice: Double, discount: Double): String {
    val discountAmount = originalPrice * discount / 100.0
    val discountedPrice = originalPrice - discountAmount
    return "%.2f".format(discountedPrice)
}

