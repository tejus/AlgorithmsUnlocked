package Searching

fun <E> linearSearch(unsortedList: List<E>, size: Int, itemToFind: E): Int where E : Comparable<E>{
    var answer = -1
    for (i in 0 until size) {
        if (unsortedList.get(i) == itemToFind) answer = i
    }
    return answer
}
