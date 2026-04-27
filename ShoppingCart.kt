fun calculateTotal(prices: Array<Double>): Double {
    var total = 0.0
    for (price in prices) {
        total += price
    }
    return total
}

fun applyDiscount(total: Double): Double {
    return if (total > 100) {
        total * 0.9
    } else {
        total
    }
}

fun findMax(prices: Array<Double>): Double {
    var max = prices[0]
    for (price in prices) {
        if (price > max) {
            max = price
        }
    }
    return max
}

fun main() {
    val prices = arrayOf(50.0, 30.0, 40.0, 20.0)

    val total = calculateTotal(prices)
    val finalPrice = applyDiscount(total)
    val maxPrice = findMax(prices)

    println("Total Price = $total")
    println("Final Price after Discount = $finalPrice")
    println("Highest Price = $maxPrice")
}
