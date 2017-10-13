/**
 * Source :
 *    http://rosettacode.org/wiki/Sorting_algorithms/Quicksort#Scala
 *    http://blog.vogella.com/2009/11/13/quicksort-in-scala/
 *    http://www.scala-lang.org/docu/files/ScalaByExample.pdf (chapter 2, page 3)
 */
class QuickSort {

  def sort(xs: Array[Int]): Array[Int] = {
    xs.length < 2 match {
      case true => xs
      case false => {
        val pivot = xs(xs.length / 2)
        sort(xs filter (pivot > _)) ++ Array(pivot) ++ sort(xs filter (pivot < _))
      }
    }
  }

  def sort(xs : List[Int]) : List[Int] = {
    xs match {
      case x :: Nil => xs
      case x :: ys => {
        val pivot = x
        sort (ys filter (pivot > _)) ::: List(pivot) ::: sort (ys filter (pivot < _))
      }
      case Nil =>  Nil
    }
  }
}

val studentScores = ('a' to 'z').map(x => (x, (Math.random() * 100).toInt))
val score = studentScores.map(_._2)

val sortedArray = new QuickSort().sort(score.toArray)
val sortedList = new QuickSort().sort(score.toList)

