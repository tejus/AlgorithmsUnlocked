package Searching

import NOT_FOUND

fun <E> betterLinearSearch(unsortedList: List<E>, size: Int, itemToFind: E): Int {
    for (i in 0 until size) {
        if (unsortedList.get(i) == itemToFind) return i
    }
    return NOT_FOUND
}
