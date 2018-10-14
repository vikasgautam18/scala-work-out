package gautamspeakscom.wordpress.com.dailyCodingProblem

import gautamspeakscom.wordpress.com.dailyCodingProblem.day4.findMissing
import org.scalatest.FunSuite

class day4Test extends FunSuite {

  test("testFindMissing") {
    assertResult(2)(findMissing(List(3, 4, -1, 1)))
    assertResult(6)(findMissing(List(3, 2, 4, -1, 1, 5, 7, 8, -2, -3)))
    assertResult(3)(findMissing(List(1, 2, 0)))
  }
}
