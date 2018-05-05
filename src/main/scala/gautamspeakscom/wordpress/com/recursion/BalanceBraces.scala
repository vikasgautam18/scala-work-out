package gautamspeakscom.wordpress.com.recursion

object BalanceBraces {

  def balance(chars: List[Char]): Boolean = {
    def loop(chars: List[Char], stack: List[Char]): Boolean = {
      if (chars.isEmpty)
        stack.isEmpty
      else {
        chars.head match {
          case '(' => loop(chars.tail, chars.head :: stack)
          case ')' => if (stack.contains('(')) loop(chars.tail, stack.tail) else false
          case _ => loop(chars.tail, stack)
        }
      }
    }

    val stackBal = List()
    loop(chars, stackBal)
  }
}
