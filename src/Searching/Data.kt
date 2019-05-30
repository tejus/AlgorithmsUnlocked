package Searching

val longSequence = 6171L
val SLOW_ITEM_TO_FIND = 1L
val SLOW_ITEM_INDEX = 261
val QUICK_ITEM_TO_FIND = 6171L
val QUICK_ITEM_INDEX = 0
val NOT_FOUND = -1

fun getSequence(number: Long): Sequence<Long> {
    var currentNumber = number
    return sequence {
        yield(number)
        while (currentNumber > 1) {
            if (currentNumber.rem(2) == 0L)
                currentNumber /= 2
            else
                currentNumber = currentNumber * 3 + 1
            yield(currentNumber)
        }
    }
}
