package gautamspeakscom.wordpress.com.misc

class Rational(x: Int, y: Int) {

  private def gcd (x: Int, y: Int) : Int = {
    if(y == 0) x else gcd(y, x % y)
  }
  private val g = gcd(x, y)
  val numerator = x / g
  val denominator = y / g

  def add(num: Rational): Rational = {
    new Rational(
    num.numerator * denominator + num.denominator * numerator,
      denominator * num.denominator)
  }

  def neg : Rational = {
    new Rational(- numerator, denominator)
  }

  def sub(num: Rational): Rational = add(num.neg)

  override def toString: String = numerator + "/" + denominator

  def equals(that: Rational): Boolean = {
    (that.numerator == numerator && that.denominator == denominator)
  }
}
