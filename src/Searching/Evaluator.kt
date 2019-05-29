package Searching

import kotlin.system.measureNanoTime

fun main() {
    val unsortedList = getSequence(longSequence).toList()

    val time = measureNanoTime { linearSearch<Long>(unsortedList, unsortedList.size, 1) }
    println(time)
    println()
}