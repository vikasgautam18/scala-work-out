package gautamspeakscom.wordpress.com.recursion

import org.scalatest.FunSpec

class WaysToCountChangeTest extends FunSpec {

  describe("method: CountChange"){
    it("countChange: small amount, baseline test"){
      assertResult(3)(WaysToCountChange.countChange(4, List(1,2)))
    }
    it("countChange: sorted CHF"){
      assertResult(1022)(WaysToCountChange.countChange(300,List(5,10,20,50,100,200,500)))
    }
    it("countChange: no pennies"){
      assertResult(0)(WaysToCountChange.countChange(301,List(5,10,20,50,100,200,500)))
    }
    it("countChange: unsorted CHF"){
      assertResult(1022)(WaysToCountChange.countChange(300,List(500,5,50,100,20,200,10)))
    }
  }
}
