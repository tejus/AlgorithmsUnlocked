package Searching

val longSequence = 6171L

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