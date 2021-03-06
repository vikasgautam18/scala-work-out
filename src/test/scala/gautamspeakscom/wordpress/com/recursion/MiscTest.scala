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

  test("testSumRange") {
    assert(m.sumRange(x => x * x, 1, 10) === 385)
    assert(m.sumRange(x => x * x * x, 1, 5) === 225)
  }

  test("testProd") {
    assert(m.prod(x => x) (3, 4) === 12)
    assert(m.prod(x => x)(3, 5) === 60)
    assert(m.genericSumProd(x => x, (a, b) => a * b, 1)(3, 4) === 12)
    assert(m.genericSumProd(x => x, (a, b) => a * b, 1)(3, 5) === 60)
  }

  test("testFactorial") {
    assert(m.factorial(1) === 1)
    assert(m.factorial(5) === 120)
    assert(m.factGen(1) === 1)
    assert(m.factGen(5) === 120)
  }

  test("testKthElement") {
    assert(m.kThElement(3, List(1, 2, 3, 4)) === 3)
  }

  test("testPenultimate") {
    assert(m.penultimate(List(1, 2, 0, 4, 3, 5)) === 3)
  }

  test("testNumberOfElements"){
    assert(m.numElem(List(1, 2, 3, 4, 5)) === 5)
  }

  test("testReverse") {
    assert(m.reverse(List(10, 20, 30, 40, 50)) === List(50, 40, 30, 20, 10))
  }

  test("testPalindrome") {
    assert(m.palindrome(List(10, 20, 30, 20, 10)) === true)
    assert(m.palindrome(List(10, 20, 30, 40, 50)) === false)
  }

  test("testRemoveAt") {
    assert(m.removeAt[Int](2, List(10, 20, 30, 20, 10)) === List(10, 20, 20, 10))
  }

  test("testFlatten") {
    assert(m.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }

  test("squareList") {
    assertResult(List(1, 4, 9, 16, 25, 36))(m.squareList(List(1, 2, 3, 4, 5, 6)))
  }

  test("squareListWithMap") {
    assertResult(List(1, 4, 9, 16, 25, 36))(m.squareListWithMap(List(1, 2, 3, 4, 5, 6)))
  }
}
