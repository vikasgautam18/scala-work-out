package gautamspeakscom.wordpress.com.week1

import java.util.Scanner

/**
  * Find the binary gap for a given integer
  * https://codility.com/programmers/lessons/1-iterations/binary_gap/
  */

object BinaryGap {

  def main(args: Array[String]): Unit = {
    val scanner: Scanner = new Scanner(System.in)
    println(getZeros(getBinary(scanner.nextInt())))
  }

  def getBinary(input: Integer): String = {
    Integer.toBinaryString(input)
  }

  def getZeros(input: String): Integer = {
    val in = input.substring(0, input.lastIndexOf("1") + 1)
    val x: Array[Int] = in.split("1").map(_.length).sorted
    if(x.length!= 0)
      x(x.length -1)
    else
      0
  }
}