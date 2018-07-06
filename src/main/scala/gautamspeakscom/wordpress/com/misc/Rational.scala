package gautamspeakscom.wordpress.com.misc

class Rational(x: Int, y: Int) {

  val numerator = x
  val denominator = y

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
