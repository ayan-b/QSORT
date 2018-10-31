fun main(args: Array<String>) {
    println(quicksort(arrayOf(2, 3, 5, 1, 10)))
}


fun quicksort(items:List<Int>): List<Int> {
    if (items.count() < 1) return items

    val center = items[items.count()/2]
    val equal = items.filter { it == center }
    val under = items.filter { it < center }
    val over = items.filter { it > center }
    
    return quicksort(under) + equal + quicksort(over)
}
