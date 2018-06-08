package gautamspeakscom.wordpress.com.recursion

class FibonacciTest extends FunSpec {

  describe("FibonacciTest") {

    it("should fibonacci") {
      assertResult(List(1, 1, 2, 3, 5, 8, 13, 21))(Fibonacci.fibonacci(8))
      assertResult(List())(Fibonacci.fibonacci(0))
    }

    it("should nFibonacci") {
      assertResult(21)(Fibonacci.nFibonacci(8))
      assertResult(13)(Fibonacci.nFibonacci(7))
      assertResult(1)(Fibonacci.nFibonacci(1))
      intercept[java.lang.IndexOutOfBoundsException](Fibonacci.nFibonacci(0))
    }
  }
}
