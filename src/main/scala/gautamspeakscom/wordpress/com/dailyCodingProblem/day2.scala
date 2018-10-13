package gautamspeakscom.wordpress.com.dailyCodingProblem

object day2 {

  /**
    * Given an array of integers, return a new array such that each element at index i of the new array is the product
    * of all the numbers in the original array except the one at i. Solve it without using division and in O(n) time.
    *
    * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input
    * was [3, 2, 1], the expected output would be [2, 3, 6].
    *
    */

  def getArray(arr: List[Int]): List[Int] = {
    arr.map(elem => multiply(arr, elem))
  }

  def multiply(arr: List[Int], skip: Int) : Int = {
    def loop(acc: Int, arr: List[Int], skip: Int): Int = {
      if(arr.isEmpty) acc
      else
      {
        val head = arr.head
        if(head == skip) loop(acc, arr.tail, skip)
        else
          loop(head * acc, arr.tail, skip)
      }
    }
    loop(1, arr, skip)
  }
}
