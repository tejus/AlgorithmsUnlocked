import Searching.betterLinearSearch
import kotlin.system.measureNanoTime

fun main() {
    val collatzList = getCollatzSequence(longSequence).toList()

    var index: Int = -1
    val QUICK_TIME_COLLATZ = measureNanoTime { index =
        betterLinearSearch(collatzList, collatzList.size, QUICK_ITEM_TO_FIND)
    }
    if (index == QUICK_ITEM_INDEX)
        println("Item $QUICK_ITEM_TO_FIND found at $index in $QUICK_TIME_COLLATZ nanoseconds")
    else
        println("Algorithm error, $QUICK_ITEM_TO_FIND not found!")
    println()

    index = -1
    val SLOW_TIME_COLLATZ = measureNanoTime { index =
        betterLinearSearch(collatzList, collatzList.size, SLOW_ITEM_TO_FIND)
    }
    if (index == SLOW_ITEM_INDEX)
        println("Item $SLOW_ITEM_TO_FIND found at $index in $SLOW_TIME_COLLATZ nanoseconds")
    else
        println("Algorithm error, $SLOW_ITEM_TO_FIND not found!")
    println()

    val unsortedList: List<Int> = getRandomInts(50000).toList()

    index = -1
    val SLOW_TIME_RANDOM = measureNanoTime { index =
        betterLinearSearch(unsortedList, unsortedList.size, SLOW_ITEM_TO_FIND)
    }
    if (index == SLOW_ITEM_INDEX)
        println("Item $SLOW_ITEM_TO_FIND found at $index in $SLOW_TIME_RANDOM nanoseconds")
    else
        println("Algorithm error, $SLOW_ITEM_TO_FIND not found!")
    println()

    index = -1
    val QUICK_TIME_RANDOM = measureNanoTime { index =
        betterLinearSearch(unsortedList, unsortedList.size, QUICK_ITEM_TO_FIND)
    }
    if (index == QUICK_ITEM_INDEX)
        println("Item $QUICK_ITEM_TO_FIND found at $index in $QUICK_TIME_RANDOM nanoseconds")
    else
        println("Algorithm error, $QUICK_ITEM_TO_FIND not found!")
    println()
}
