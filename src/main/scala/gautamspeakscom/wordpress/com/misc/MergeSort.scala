package gautamspeakscom.wordpress.com.misc

object MergeSort {


  def msort(list: List[Int]): List[Int] = {
    // define number to be split at

    val n = list.length/2

    // case of empty lists
    if(n == 0) list
    else {
      // split list into two
      val (xs, ys) = list.splitAt(n)

      // merge lists
      merge(msort(xs), msort(ys))
    }

  }

  def merge(xs: List[Int], ys: List[Int]): List[Int] = {
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) => {
        if(x > y) y :: merge(xs, ys1)
        else x :: merge(xs1, ys)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val l = msort(List(1, 4, -4, 2, 9, 8, 12, -5))

    println(l)
  }

}
