package gautamspeakscom.wordpress.com.misc


class Arrays2DTest extends FunSpec{

  describe("The method getHourGlassSum"){
    it("should return sum of hour glass"){
      val arr = Array(Array(1, 1, 1, 0, 0, 0),
        Array(0, 1, 0, 0, 0, 0),
        Array(1, 1, 1, 0, 0, 0),
        Array(0, 0, 2, 4, 4, 0),
        Array(0, 0, 0, 2, 0, 0),
        Array(0, 0, 1, 2, 4, 0))

      assertResult(7)(Arrays2D.getHourGlassSum(0, 0, arr))
      assertResult(19)(Arrays2D.getHourGlassSum(3, 2, arr))
    }
  }

}
