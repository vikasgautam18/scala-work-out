package gautamspeakscom.wordpress.com.conslist


object ListUtils {

  def nth[T](n: Int, list: List[T]): T = {
    if(list.isEmpty) throw new IndexOutOfBoundsException
    else if(n > length(list) - 1) throw new IndexOutOfBoundsException
    def loop(agg: T, tail:List[T]): T = {
      if(tail.isEmpty) agg
      else
        loop(tail.head, tail.tail)
    }
    loop(list.head, list)
  }

  def length[T](list: List[T]): Int = {
    def loop(agg: Int, tail: List[T]): Int = {
      if(tail.isEmpty) agg
      else
        loop(agg + 1, tail.tail)
    }
    loop(0, list)
  }

}
