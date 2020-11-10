import kotlin.math.*

fun main() {
    // Будем вводить начальные данные руками
    println("Введите сумму предыдущих покупок")
    val inputTotalAmount = readLine()!!.toInt()

    println("Были у вас покупки за последний месяц\n" +
            "1 - Да\n" +
            "Любой другой символ - Нет")
    val inputIsUserMeloman = when (readLine()) {
        "1" -> true
        else -> false
    }

    println("Введите сумму текущей покупки без скидки")
    val inputAmountWithoutDiscount = readLine()!!.toInt()

    println(discountedAmount(inputTotalAmount, inputIsUserMeloman, inputAmountWithoutDiscount))

}

fun discountedAmount(totalAmount: Int = 0, isUserMeloman: Boolean = false, amountWithoutDiscount: Int): Int {

    val intermediateCalculations: Int

    if (amountWithoutDiscount > 10000) {
        val intermediateCalculations: Int = round(0.95 * amountWithoutDiscount).toInt()
    }
    else if (amountWithoutDiscount > 1000) {
                val intermediateCalculations: Int = amountWithoutDiscount - 100
            }
        else {
        val intermediateCalculations: Int = amountWithoutDiscount
    }

    return when {
        isUserMeloman -> round(intermediateCalculations * 0.99).toInt()
        else -> intermediateCalculations

    }

}