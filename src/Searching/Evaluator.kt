package Searching

import kotlin.system.measureNanoTime

fun main() {
    val unsortedList = getSequence(longSequence).toList()

    var index: Int = -1
    val QUICK_TIME = measureNanoTime { index = betterLinearSearch(unsortedList, unsortedList.size, QUICK_ITEM_TO_FIND) }
    if (index == QUICK_ITEM_INDEX)
        println("Item $QUICK_ITEM_TO_FIND found at $index in $QUICK_TIME nanoseconds")
    else
        println("Algorithm error, $QUICK_ITEM_TO_FIND not found!")
    println()

    index = -1
    val SLOW_TIME = measureNanoTime { index = betterLinearSearch(unsortedList, unsortedList.size, SLOW_ITEM_TO_FIND) }
    if (index == SLOW_ITEM_INDEX)
        println("Item $SLOW_ITEM_TO_FIND found at $index in $SLOW_TIME nanoseconds")
    else
        println("Algorithm error, $SLOW_ITEM_TO_FIND not found!")
    println()
}
