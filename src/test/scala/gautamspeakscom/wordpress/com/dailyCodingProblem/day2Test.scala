package gautamspeakscom.wordpress.com.dailyCodingProblem

import org.scalatest.FunSuite

class day2Test extends FunSuite {

  test("testGetArray") {
    assertResult(List(120, 60, 40, 30, 24))(day2.getArray(List(1, 2, 3, 4, 5)))
    assertResult(List(2, 3, 6))(day2.getArray(List(3, 2, 1)))
  }

  test("testMultiply") {
    assertResult(120)(day2.multiply(List(1, 2, 3, 4, 5), 1))
    assertResult(60)(day2.multiply(List(1, 2, 3, 4, 5), 2))

  }

}
