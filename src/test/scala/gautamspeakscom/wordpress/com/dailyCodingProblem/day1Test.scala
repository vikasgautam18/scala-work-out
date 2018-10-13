package gautamspeakscom.wordpress.com.dailyCodingProblem

import gautamspeakscom.wordpress.com.dailyCodingProblem.day1._
import org.scalatest.FunSuite

class day1Test extends FunSuite {

  test("testInterleaf_with_List") {
    assertResult(List(1, 5, 2, 4, 3))(interleaf_with_List(List(1, 2, 3, 4, 5)))
    assertResult(List(1, 4, 2, 3))(interleaf_with_List(List(1, 2, 3, 4)))
    assertResult(List())(interleaf_with_List(List()))
  }

  test("testInterleaf") {
    assertResult(List(1, 5, 2, 4, 3))(interleaf(List(1, 2, 3, 4, 5)))
    assertResult(List(1, 4, 2, 3))(interleaf(List(1, 2, 3, 4)))
    assertResult(List())(interleaf(List()))
  }

}
