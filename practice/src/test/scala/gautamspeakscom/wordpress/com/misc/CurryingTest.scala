package gautamspeakscom.wordpress.com.misc


class CurryingTest extends FunSpec {

  describe("CurryingTest") {

    it("should add") {
      assertResult(2)(add(1, 1))
      assertResult(5)(add(2, 3))

    }

    it("should fact") {
      assertResult(120)(fact(5))
      assertResult(1)(fact(0))
    }

    it("should sumOfFactorials") {
      assertResult(153)(sumOfFactorials(1, 5))
      assertResult(2)(sumOfFactorials(0, 1))
      assertResult(1)(sumOfFactorials(0, 0))
    }

    it("should sumOfNum") {

      assertResult(15)(sumOfNum(1, 5))
      assertResult(0)(sumOfNum(1, 0))
      assertResult(1)(sumOfNum(1, 1))
    }

    it("should sumOfSquares") {
      assertResult(55)(sumOfSquares(1, 5))
    }

    it("should square") {
      assertResult(25)(square(5))
      assertResult(1)(square(1))
      assertResult(0)(square(0))

    }

    it("should sumOfCubes") {
      assertResult(225)(sumOfCubes(1, 5))
    }

    it("should cube") {
      assertResult(125)(cube(5))
      assertResult(1)(cube(1))
    }

    it("should sumWithoutCurrying") {
      assertResult(225)(sumWithoutCurrying(cube, 1, 5))
      assertResult(55)(sumWithoutCurrying(square, 1, 5))
      assertResult(153)(sumWithoutCurrying(fact, 1, 5))
    }

    it("should sumWithCurrying") {
      assertResult(225)(sumWithCurrying(cube)(1, 5))
      assertResult(55)(sumWithCurrying(square)(1, 5))
      assertResult(153)(sumWithCurrying(fact)(1, 5))
    }
  }
}
