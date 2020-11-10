import kotlin.math.*

fun main() {
    // Будем вводить начальные данные руками
    println("Введите сумму предыдущих покупок")
    val totalAmount = readLine()!!.toInt()

    println("Были у вас покупки за последний месяц\n" +
            "1 - Да\n" +
            "Любой другой символ - Нет")
    val isUserMeloman = when (readLine()) {
        "1" -> true
        else -> false
    }

    println("Введите сумму текущей покупки без скидки")
    val amountWithoutDiscount = readLine()!!.toInt()

    val discountedAmount: Int

    if (totalAmount > 10000) {
        discountedAmount = round(amountWithoutDiscount * 0.95).toInt()
    }
    else if (totalAmount > 1000) {
        discountedAmount = amountWithoutDiscount - 100
    }
    else {
        discountedAmount = amountWithoutDiscount
    }

    val finalPrice: Int

    if (isUserMeloman) {
        finalPrice = (round(discountedAmount * 0.99)).toInt()
    }
    else {
        finalPrice = discountedAmount
    }

    println("Для вас будет цена $finalPrice")

}
