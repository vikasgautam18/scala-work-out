package gautamspeakscom.wordpress.com.recursion

object SquareRoot{

  def newtons_way(num: Double, guess: Double = 1) : Double = {
    if(isGoodEnough(num, guess)) guess
    else newtons_way(num, improve_guess(num, guess))

  }
  def abs(x: Double) = if(x > 0) x else -x

  def isGoodEnough(d: Double, guess: Double) : Boolean = {
    abs(guess * guess - d) / d  < 0.0001
  }

  def improve_guess(num: Double, guess: Double) : Double = {
    (guess + num/guess)/2
  }

  def main(args: Array[String]): Unit = {
    println(newtons_way(2))
    println(newtons_way(19))
    println(newtons_way(1e-6))
    println(newtons_way(1e60))
  }
}