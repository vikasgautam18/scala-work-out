package gautamspeakscom.wordpress.com.recursion

class BalanceBracesTest extends FunSpec{

  describe("the method Balance"){
    it("should return if the braces are balanced in a given sentence"){
      assertResult(true)(BalanceBraces.balance("(if (zero? x) max (/ 1 x))".toList))
      assertResult(true)(BalanceBraces.balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
      assertResult(false)(BalanceBraces.balance(":-)".toList))
      assertResult(false)(BalanceBraces.balance("())(".toList))
    }
  }

}
