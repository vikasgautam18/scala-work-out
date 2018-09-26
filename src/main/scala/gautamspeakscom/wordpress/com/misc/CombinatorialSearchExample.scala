package gautamspeakscom.wordpress.com.misc

object CombinatorialSearchExample {

  /**
    * given a positive integer n find all pairs of positive integers i and j
    * with 1 <= j < i < n where i+j is prime
    *
    */

    def isPrime(n: Int) : Boolean = {
      (2 until n).forall(x => n % x != 0)
    }

  def main(args: Array[String]): Unit = {
    val n = 7

    val y = (1 until n).flatMap(f => {
      (1 until f).map(a => (f, a))
    }).filter(x => x._1 > x._2)
      .filter(x => isPrime(x._2 + x._1))

    println(y)
  }
}
