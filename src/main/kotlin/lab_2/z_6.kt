package lab_2

//fun main() {
//    println("Введите сумму экспорта:")
//    val export = readln().toDouble()
//
//    println("Введите сумму импорта:")
//    val import = readln().toDouble()
//
//    val tradeBalance = export - import
//
//    when {
//        tradeBalance > 0 -> println("Ваша прибыль составила: $tradeBalance")
//        tradeBalance < 0 -> println("Ваши убытки составили: ${-tradeBalance}")
//        else -> println("Сальдо торгового баланса равно нулю, убытков и прибыли нет")
//    }
//}

fun main() {
    println("Введите величину экспорта: ")
    val export = readLine()?.toDoubleOrNull() ?: 0.0
    println("Введите величину импорта: ")
    val import = readLine()?.toDoubleOrNull() ?: 0.0

    val tradeBalance = export - import

    if (tradeBalance > 0) {
        println("Положительное сальдо торгового баланса. Прибыль составляет: $tradeBalance")
    } else if (tradeBalance < 0) {
        println("Отрицательное сальдо торгового баланса. Потери составляют: ${-tradeBalance}")
    } else {
        println("Сальдо торгового баланса равно нулю. Ни прибыли, ни потерь.")
    }
}
