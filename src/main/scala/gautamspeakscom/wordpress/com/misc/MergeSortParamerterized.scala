package gautamspeakscom.wordpress.com.misc

object MergeSortParamerterized {


  def msort[T](list: List[T])(implicit ord: Ordering[T]): List[T] = {
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

  def merge[T](xs: List[T], ys: List[T])(implicit ord: Ordering[T]) : List[T] = {
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) => {
        if(ord.lt(x,y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val l = msort(List(1, 4, -4, 2, 9, 8, 12, -5))
    val strList = msort(List("Frankfurt", "Berlin", "Stuttgart", "Karlsruhe"))

    println(l)
    println(strList)
  }

}
