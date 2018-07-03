package gautamspeakscom.wordpress.com.recursion

class Misc {

  /**
    * #1 - Find the last element of a list recursively
    * Example:
    * scala> last(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 8
    *
    * @param l list of numbers
    * @return the last number in the list
    */

  def last(l: List[Int]): Int = {
    if (l.isEmpty)
      throw new NoSuchElementException("List is empty")

    if(l.length == 1)
      l.head
    else
      last(l.tail)
  }

  def sumRange(f: Int => Int, a: Int ,b: Int) : Int = {
    def loop(a: Int, acc: Int): Int = {
      if(a > b)
        acc
      else
        loop(a + 1, acc + f(a))
    }
    loop(a, 0)
  }
}
