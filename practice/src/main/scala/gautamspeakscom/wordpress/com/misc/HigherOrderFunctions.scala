package gautamspeakscom.wordpress.com.week1

object HigherOrderFunctions {

  def square(num1: Int): Int = num1 * num1

  def cube(num1: Int): Int = square(num1) * num1

  def factorial (num: Int): Int = {
    if(num == 1)
      num
    else
      num * factorial(num -1)
  }

  def sum(f: Int => Int, num1: Int, num2: Int): Int = {
    if(num1 > num2)
      0
    else
      f(num1) + sum(f, num1+1, num2)
  }

  def sumTR(f: Int => Int, num1: Int, num2: Int): Int = {
    def loop(num1: Int, acc: Int): Int = {
      if (num1 > num2)
        acc
      else
        loop(num1+1, f(num1) + acc)
    }
    loop(num1, 0)
  }

  def sumOfSquares(f: Int => Int, num1: Int, num2: Int): Int = {
    sumTR(square, num1, num2)
  }

  def sumOfCubes(f: Int => Int, num1: Int, num2: Int): Int = {
    sumTR(cube, num1, num2)
  }

  def sumOfFactorial(f: Int => Int, num1: Int, num2: Int): Int = {
    sumTR(factorial, num1, num2)
  }

  def main(args: Array[String]): Unit = {
    println(sumOfSquares(square, 3, 5))
    println(sumOfCubes(cube, 2, 5))
    println(sumOfFactorial(factorial, 2, 11))
  }
}
