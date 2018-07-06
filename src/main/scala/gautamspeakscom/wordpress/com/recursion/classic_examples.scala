package gautamspeakscom.wordpress.com.recursion

class classic_examples {

  def gcd (x: Int, y: Int) : Int = {
    if(y == 0) x else gcd(y, x % y)
  }

  def sqrt(num: Double) = {

    def newtons_way(guess: Double = 1) : Double = {
      if(isGoodEnough(guess)) guess
      else newtons_way(improve_guess(guess))
    }

    def abs(x: Double) = if(x > 0) x else -x

    def isGoodEnough(guess: Double) : Boolean = {
      abs(guess * guess - num) / num  < 0.0001
    }

    def improve_guess(guess: Double) : Double = {
      (guess + num/guess)/2
    }

    newtons_way(num)
  }

}
