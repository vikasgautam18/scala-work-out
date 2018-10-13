package gautamspeakscom.wordpress.com.dailyCodingProblem

import gautamspeakscom.wordpress.com.dailyCodingProblem.day1.interleaf_with_List
import org.scalatest.FunSuite

class day1Test extends FunSuite {

  test("testInterleaf_with_List") {
    val input = List(1, 2, 3, 4, 5)

    interleaf_with_List(input) === List(1, 5, 2, 4, 3)
  }

}
