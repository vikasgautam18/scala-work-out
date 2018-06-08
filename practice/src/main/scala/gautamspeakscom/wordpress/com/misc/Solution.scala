package gautamspeakscom.wordpress.com.week1

object Solution extends App {

  def f(n: Int): Unit = {
    for(_ <- 1 to n)
      println("Hello World")
  }

  val n = scala.io.StdIn.readInt
  f(n)
}