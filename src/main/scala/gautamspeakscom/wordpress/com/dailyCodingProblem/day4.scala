package gautamspeakscom.wordpress.com.dailyCodingProblem


/**
  *
  * Given an array of integers, find the first missing positive integer in linear time and constant space.
  * In other words, find the lowest positive integer that does not exist in the array.
  * The array can contain duplicates and negative numbers as well.

  * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
  * You can modify the input array in-place.
  *
  */

object day4 {

  def findMissing(list: List[Int]): Int = {
    val goodList = removeNegatives(list)
    val min = goodList.min
    val stream = from(min)

    val x: Stream[Int] = stream.takeWhile(i => {
      goodList.contains(i)
    })

    x.toList.max + 1
  }

  def from(n: Int): Stream[Int] = n #:: from(n+1)

  def removeNegatives(list: List[Int]): List[Int] = list.filter(num => num > 0)

}
