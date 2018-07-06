package gautamspeakscom.wordpress.com.misc

import org.scalatest.FunSuite

class RationalTest extends FunSuite {

  test("testAdd") {

    assert(new Rational(1, 2).add(new Rational(1, 2)).equals(new Rational(1, 1)))
    assert(new Rational(1, 4).add(new Rational(2, 3)).equals(new Rational(11, 12)))
  }

  test("testSub") {
    assert(new Rational(2, 3).sub(new Rational(1, 2)).equals(new Rational(1, 6)))

  }

  test("testNeg") {
    assert(new Rational(1, 2).neg.equals(new Rational(-1, 2)))

  }

}
