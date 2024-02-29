package lab_2

fun main() {
    println("Введите сумму экспорта:")
    val export = readln().toDouble()

    println("Введите сумму импорта:")
    val import = readln().toDouble()

    val tradeBalance = export - import

    when {
        tradeBalance > 0 -> println("Ваша прибыль составила: $tradeBalance")
        tradeBalance < 0 -> println("Ваши убытки составили: ${-tradeBalance}")
        else -> println("Сальдо торгового баланса равно нулю, убытков и прибыли нет")
    }
}
