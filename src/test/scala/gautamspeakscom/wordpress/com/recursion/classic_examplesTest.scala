package gautamspeakscom.wordpress.com.recursion

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class classic_examplesTest extends FunSuite with BeforeAndAfterEach {

  var ce : classic_examples = _

  override def beforeEach() {
    ce = new classic_examples
  }

  test("testGcd") {

    assertResult(7)(ce.gcd(14, 21)) // straight case
    assertResult(13)(ce.gcd(13, 13)) // trick case: a == b
    assertResult(1)(ce.gcd(37, 600)) // first argument is prime
    assertResult(20)(ce.gcd(20, 100)) // one is a multiple of other
    assertResult(37)(ce.gcd(0, 37)) // one of the numbers in zero
  }

  test("sqrt") {
    assertResult(1.4142156862745097)(ce.sqrt(2))
    assertResult(4.358901750853372)(ce.sqrt(19))
  }
}
