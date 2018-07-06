package gautamspeakscom.wordpress.com.recursion

import org.scalatest.FunSuite

class FixedPointTest extends FunSuite {

  test("testFixedPoint") {

    assert(FixedPoint.fixedPoint(x => 1 + x/2)(1) === 1.999755859375)
    assert(FixedPoint.fixedPoint(x => 399 + x/2)(1) === 748.1875)
  }

}
