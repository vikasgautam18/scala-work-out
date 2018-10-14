package gautamspeakscom.wordpress.com.week1

object Currying {

  def sumWithoutCurrying(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else
      f(a) + sumWithoutCurrying(f, a + 1, b)
  }

  def sumWithCurrying(f: Int => Int): (Int, Int) => Int = {
    def sumC(a: Int, b: Int): Int = {
      if (a > b) 0
      else
        f(a) + sumC(a + 1, b)
    }

    sumC
  }

  def sumOfNum(a: Int, b: Int): Int = {
    def loop(a: Int, sum: Int): Int = {
      if (a > b) sum
      else
        loop(a + 1, add(a, sum))
    }

    loop(a, 0)
  }

  def add(a: Int, b: Int): Int = a + b

  def sumOfSquares(a: Int, b: Int): Int = {
    def loop(a: Int, sum: Int): Int = {
      if (a > b) sum
      else
        loop(a + 1, sum + square(a))
    }

    loop(a, 0)
  }

  def square(a: Int): Int = a * a

  def sumOfCubes(a: Int, b: Int): Int = {
    def loop(a: Int, sum: Int): Int = {
      if (a > b) sum
      else
        loop(a + 1, sum + cube(a))
    }

    loop(a, 0)
  }

  def cube(a: Int): Int = a * a * a

  def sumOfFactorials(a: Int, b: Int): Int = {
    def loop(a: Int, sum: Int): Int = {
      if (a > b) sum
      else
        loop(a + 1, sum + fact(a))
    }

    loop(a, 0)
  }

  def fact(a: Int): Int = {
    def loop(a: Int, agg: Int): Int = {
      if (a == 0) agg
      else loop(a - 1, agg * a)
    }

    loop(a, 1)
  }
}
