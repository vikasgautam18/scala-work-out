package gautamspeakscom.wordpress.com.week1

import scala.io.StdIn


/**
  * **** Task *****
  * Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: n x i = result.
 Sample Input
 **
 2
*Sample Output
 **
 2 x 1 = 2
*2 x 2 = 4
*2 x 3 = 6
*2 x 4 = 8
*2 x 5 = 10
*2 x 6 = 12
*2 x 7 = 14
*2 x 8 = 16
*2 x 9 = 18
*2 x 10 = 20
  */

object Loops {

  def main(args: Array[String]): Unit = {
    val readInt = StdIn.readLine("please enter the integer to use: should be 2 <= n <= 20 ").toInt

    if(readInt > 20 || readInt < 2) {
      println("Wrong input: " + readInt)
      println("Should be 2 <= n <= 20, try again!")
      System.exit(-1)
    }

    for (i <- 1 to 10 ) println(s" $readInt * $i = ${readInt * i }")

  }

}
