package gautamspeakscom.wordpress.com.dailyCodingProblem

import gautamspeakscom.wordpress.com.dailyCodingProblem.day1.interleaf_with_List
import org.scalatest.FunSuite

class day1Test extends FunSuite {

  test("testInterleaf_with_List") {
    interleaf_with_List(List(1, 2, 3, 4, 5)) === List(1, 5, 2, 4, 3)
    interleaf_with_List(List(1, 2, 3, 4)) === List(1, 5, 2, 4)
    interleaf_with_List(List()) === List()
  }

}
