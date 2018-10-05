/**
 * Code written by SpaceDigi
 * Implementation quicksort algorithm on Kotlin
 * This object can be used from Kotlin and Java classes
 */
object QuickSortKotlin {
    fun quickSort(lowerIndex: Int, higherIndex: Int, inputArr: IntArray) {
        var i = lowerIndex
        var j = higherIndex
        // calculate pivot number, I am taking pivot as middle index number
        val pivot = inputArr[lowerIndex + (higherIndex - lowerIndex) / 2]
        // Divide into two arrays
        while (i <= j) {
            while (inputArr[i] < pivot) {
                i++
            }
            while (inputArr[j] > pivot) {
                j--
            }
            if (i <= j) {
                exchangeNumbers(i, j,inputArr);
                //move index to next position on both sides
                i++
                j--
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j,inputArr)
        if (i < higherIndex)
            quickSort(i, higherIndex,inputArr)
    }

   private fun exchangeNumbers(i:Int, j:Int, inputArr: IntArray) {
        val temp = inputArr [i]
        inputArr[i] = inputArr[j]
        inputArr[j] = temp
    }
}

fun main(args:Array<String>){
    System.out.println("So, the main description you can read in header of this file." +
            "\nArray send to method(sorting) by reference, so method has access to array by reference to object and works with that" +
            " \nWe are creating array, fill by random numbers, printing before and after sorting")
    System.out.println("Before sorting")
    val size = 25
    val arr = IntArray(size,{_->(Math.random()*size).toInt()})
    for(k in arr)
        System.out.print("$k ")
    QuickSortKotlin.quickSort(0,size-1,arr)
    System.out.println("\nAfter sorting")
    for(k in arr)
        System.out.print("$k ")
}