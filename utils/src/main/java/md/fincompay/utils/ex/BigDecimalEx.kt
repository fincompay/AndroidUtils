package md.fincompay.utils.ex

import java.math.BigDecimal
import java.math.RoundingMode

fun BigDecimal.times(value: BigDecimal): BigDecimal {
    return multiply(value)
}

fun BigDecimal.safeDiv(value: Double): BigDecimal {
    return divide(BigDecimal(value), 6, RoundingMode.HALF_EVEN)
}

fun BigDecimal.safeDiv(value: BigDecimal): BigDecimal {
    return divide(value, 6, RoundingMode.HALF_EVEN)
}

val BigDecimal.rounded: BigDecimal get() {
    return this.setScale(2, RoundingMode.HALF_UP)
}