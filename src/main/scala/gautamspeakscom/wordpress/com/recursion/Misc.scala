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

  /**
    * Find the last but one element of a list.
    * Example:
    * scala> penultimate(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 5
    *
    * @param l -> input list
    * @return
    */
  def penultimate(l:List[Int]): Int = kThElement(l.length - 1, l)


  /**
    *
    * @param k - the element to check
    * @param l - the list of number
    * @return - the element at kth index
    */
  def kThElement(k: Int, l: List[Int]): Int = {
    def loop(k: Int, l: List[Int], curr: Int): Int= {
      if(k-1 == curr)
        l(curr)
      else
        loop(k, l, curr + 1)
    }
    loop(k, l, 0)
  }

  /**
    * Sum of all integers in a given range
    * @param a range begin
    * @param b range end
    * @return the sum
    */
  def sumRange(f: Int => Int, a: Int ,b: Int) : Int = {
    def loop(a: Int, acc: Int): Int = {
      if(a > b)
        acc
      else
        loop(a + 1, acc + f(a))
    }
    loop(a, 0)
  }

  /**
    * Find the number of elements of a list.
    * Example:
    * scala> numElem(List(1, 1, 2, 3, 5, 8))
    * res0: Int = 6
    *
    * @param l: the input list
    * @return
    */
  def numElem(l: List[Int]): Int = {
    def loop(agg: Int, l:List[Int]):Int= {
      if(l.isEmpty)
        agg
      else
        loop(agg+1, l.tail)
    }
    loop(0, l)
  }

  /**
    * Reverse a list.
    * Example:
    * scala> reverse(List(1, 1, 2, 3, 5, 8))
    * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
    *
    * @param l -> input list
    * @return
    */
  def reverse(l: List[Int]):List[Int] = {
    def loop(rev: List[Int], l: List[Int]): List[Int] = {
      if(l.isEmpty)
        rev
      else
        loop(l.head :: rev, l.tail)
    }
    loop(List(), l)
  }

  /**
    * Find out whether a list is a palindrome.
    * Example:
    * scala> isPalindrome(List(1, 2, 3, 2, 1))
    * res0: Boolean = true
    *
    * @param l -> input list
    * @return
    */
  def palindrome(l:List[Int]): Boolean = l == reverse(l)

  def sumCurr(f: Int => Int): (Int, Int) => Int = {
    def sum(a: Int, b:Int): Int = {
      if(a > b)
        0
      else
        f(a) + sum(a+1, b)
    }
    sum
  }

  def sumCurrying(f: Int => Int)(a:Int, b:Int): Int = {
    if(a > b)
      0
    else
      f(a) + sumCurrying(f) (a+1, b)
  }

  def prod(f: Int => Int)(a: Int, b: Int) : Int = {
    if(a > b)
      1
    else
      f(a) * prod(f)(a+1, b)
  }

  def factorial(n: Int): Int = prod(x => x)(1, n)

  def factGen(n: Int): Int = genericSumProd(x => x, (x, y) => x * y, 1)(1, n)

  def genericSumProd(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if(a > b)
      zero
    else
      combine(f(a), genericSumProd(f, combine, zero)(a+1, b))
  }

  def removeAt[T](n: Int, xs: List[T]): List[T] = xs.take(n) ++ xs.drop(n+1)


  def flatten(xs: List[Any]): List[Any] = xs match {
    case Nil => Nil
    case (head: List[_]) :: tail => flatten(head) ++ flatten(tail)
    case head :: tail => head :: flatten(tail)
  }

  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case Nil => xs
      case y :: ys => y * y :: squareList(ys)
    }

  def squareListWithMap(xs: List[Int]): List[Int] =
    xs.map(elem => elem * elem)


  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => ???
  }
}
