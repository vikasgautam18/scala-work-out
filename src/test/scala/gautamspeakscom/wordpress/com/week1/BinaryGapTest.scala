package gautamspeakscom.wordpress.com.week1

import org.scalatest._

class BinaryGapTest extends FunSpec {

  describe("The method getBinary"){
    it("should return binary equivalent of an integer"){
      val input : Integer = 15
      assert(BinaryGap.getBinary(input).equals("1111"))
    }
    it("should not return empty string"){
      assert(BinaryGap.getBinary(15)!= "")
    }
  }

  describe("The method getZeros"){
    it("should count the max number of consecutive zeros"){
      assertResult(0)(BinaryGap.getZeros("1110"))
      assertResult(3)(BinaryGap.getZeros("11001000110"))
      assertResult(0)(BinaryGap.getZeros(BinaryGap.getBinary(1024)))
    }
  }

}
