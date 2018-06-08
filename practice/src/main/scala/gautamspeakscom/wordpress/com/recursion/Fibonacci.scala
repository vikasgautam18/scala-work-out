package gautamspeakscom.wordpress.com.recursion

/**
  * http://www.ideserve.co.in/learn/nth-fibonacci-number
  */

object Fibonacci {

  def fibonacci(n: Int): List[Int] = {
    def loop(num: Int, list:List[Int]): List[Int] ={
      if(list.length >= n)
        list.reverse
      else
        loop(num+list.reverse.last, num+list.last :: list)
    }
    if(n>0)
      loop(1, List(1, 1))
    else
      List()
  }

  def nFibonacci(n: Int): Int = fibonacci(n)(n-1)

}
