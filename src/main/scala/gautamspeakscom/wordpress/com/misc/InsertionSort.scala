package gautamspeakscom.wordpress.com.misc

object InsertionSort {

  def insert(y: Int, ints: List[Int]): List[Int] = {
    println(ints)

    ints match {
      case List() => List(y)
      case x :: xs => if(y < x) y :: ints else x :: insert(y, xs)
    }
  }

  def iSort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, iSort(ys))
  }

  def main(args: Array[String]): Unit = {
    println(iSort(List(2,4,1,7,5)))
  }
}
