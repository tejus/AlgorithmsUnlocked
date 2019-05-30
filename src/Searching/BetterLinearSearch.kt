package Searching

fun <E> betterLinearSearch(unsortedList: List<E>, size: Int, itemToFind: E): Int where E : Comparable<E> {
    for (i in 0 until size) {
        if (unsortedList.get(i) == itemToFind) return i
    }
    return NOT_FOUND
}
