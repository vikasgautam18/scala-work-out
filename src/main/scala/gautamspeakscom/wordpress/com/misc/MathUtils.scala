package gautamspeakscom.wordpress.com.misc

object MathUtils {

    implicit def ~=(x: Double, y: Double, precision: Double): Boolean = {
      if ((x - y).abs < precision) true else false }


  def main(args: Array[String]): Unit = {

    val x = 0.3

    val y = 0.1 + 0.2

    if(x == y) print("equal") else println("not equal")


    if (~=(x, y, 0.001) )  print("equal") else println("not equal")

  }
}

