package gautamspeakscom.wordpress.com.week1

import java.util.Scanner

/**
  * https://www.hackerrank.com/challenges/30-2d-arrays/problem
  */

object Arrays2D {

  def main(args: Array[String]): Unit = {
    val sc = new Scanner (System.in)
    val arr: Array[Array[Int]] = Array.ofDim[Int](6, 6)
    readArrayFromCmd(arr, sc)

    var sumArr = List[Int]()

    for(i <- 0 to 3){
      for(j <- 0 to 3){
        sumArr = getHourGlassSum(i, j, arr) :: sumArr
      }
    }

    sumArr = sumArr.sorted
    println(sumArr.max)

  }

  def readArrayFromCmd(arr:Array[Array[Int]], sc :Scanner): Unit ={
      for(i <- 1 to 6){
        for (j <- 1 to 6){
          arr(i-1)(j-1) = sc.nextInt()
        }
    }
  }

  def getHourGlassSum(x:Int, y:Int, arr:Array[Array[Int]]): Int ={
    val sum = arr(x)(y) + arr(x)(y+1) + arr(x)(y+2) + arr(x+1)(y+1) + arr(x+2)(y) + arr(x+2)(y+1) + arr(x+2)(y+2)
    sum
  }
}
