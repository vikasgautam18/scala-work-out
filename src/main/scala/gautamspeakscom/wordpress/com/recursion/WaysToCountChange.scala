package gautamspeakscom.wordpress.com.recursion

object WaysToCountChange {

  def countChange(money: Int, coins: List[Int]): Int = {

    def loop(money: Int, changes: List[Int]): Int = {
      if (money == 0)
        1
      else if (money < 0)
        0
      else if (changes.isEmpty && money >= 1)
        0
      else
        loop(money, changes.tail) + loop(money - changes.head, changes)
    }

    loop(money, coins.sorted)
  }
}
