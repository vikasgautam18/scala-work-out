package gautamspeakscom.wordpress.com.recursion

object FixedPoint {

  val tolerance = 0.0001

  def isGoodEnough(x: Double, y: Double): Boolean = {
    Math.abs((x - y)/x)/x < tolerance
  }

  def fixedPoint(f: Double => Double)(initialGuess: Double): Double = {
    def loop(guess: Double): Double = {
      if(isGoodEnough(f(guess), guess))
        f(guess)
      else
        loop(f(guess))
    }
    loop(initialGuess)
  }

  def sqrt(num: Int): Double = fixedPoint(averageDamp(y => num/y))(1.0)

  def averageDamp(f: Double => Double)(x: Double): Double = {
    (x + f(x)) / 2
  }


}
