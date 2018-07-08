package gautamspeakscom.wordpress.com.conslist

import org.scalatest.FunSuite

class ListUtilsTest extends FunSuite {

  test("testNth") {
    assert(ListUtils.nth[Int](2, new Cons[Int](1, new Cons[Int](2, new Cons[Int](3, new Nil[Int])))) === 3)
    assertThrows[IndexOutOfBoundsException](ListUtils.nth[Int](3, new Cons[Int](1, new Cons[Int](2, new Cons[Int](3, new Nil[Int])))) === 3)
  }

}
