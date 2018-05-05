package gautamspeakscom.wordpress.com.week1

object SumOfNumbersBetweenNumbers {


  def square(num1: Int): Int = num1 * num1

  def cube(num1: Int): Int = square(num1) * num1

  def factorial (num: Int): Int = {
    if(num == 1)
      num
    else
      num * factorial(num -1)
  }

  // sum of squares between two numbers

  def sumOfSquares(num1: Int, num2: Int): Int = {
    if(num1 > num2)
      0
    else
      square(num1) + sumOfSquares(num1+1, num2)
  }

  // sum of cubes of two numbers

  def sumOfCubes(num1: Int, num2: Int): Int = {
    if(num1 > num2)
      0
    else
      cube(num1) + sumOfCubes(num1+1, num2)
  }

  //sum of factorial of two numbers

  def sumOfFactorial(num1: Int, num2: Int):Int = {
    if(num1 > num2)
      0
    else
      factorial(num1) + sumOfFactorial(num1+1, num2)
  }

  def main(args: Array[String]): Unit = {
    println(sumOfSquares(2, 30))
    println(sumOfCubes(2, 4))
    println(sumOfFactorial(2, 4))
  }

}
