package gautamspeakscom.wordpress.com.recursion

import org.scalatest.FunSuite

class MiscTest extends FunSuite {

  val m = new Misc()

  test("testLast") {
    assert(m.last(List(1, 3, 5)) === 5)
    assert(m.last(List(1)) === 1)
    assert(m.last(List(1, 1, 2, 3, 5, 8)) === 8)
    assertThrows[NoSuchElementException](m.last(List()))
  }
}
