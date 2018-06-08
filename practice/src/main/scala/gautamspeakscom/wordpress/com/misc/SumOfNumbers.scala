package gautamspeakscom.wordpress.com.week1

object SumOfNumbers {


  def square(num1: Int): Int = num1 * num1

  def cube(num1: Int): Int = square(num1) * num1

  // sum of squares of two numbers

  def sumOfSquares(num1: Int, num2: Int): Int = square(num1) + square(num2)

  // sum of cubes of two numbers

  def sumOfCubes(num1: Int, num2: Int): Int = cube(num1) + cube(num2)

  //sum of factorial of two numbers

  def factorial (num: Int): Int = {
    if(num == 1)
      num
    else
      num * factorial(num -1)
  }

  def sumOfFactorial(num1: Int, num2: Int):Int = factorial(num1) + factorial(num2)

  def main(args: Array[String]): Unit = {
    println(sumOfSquares(2, 3))
    println(sumOfCubes(2, 3))
    println(sumOfFactorial(2, 3))
  }

}
