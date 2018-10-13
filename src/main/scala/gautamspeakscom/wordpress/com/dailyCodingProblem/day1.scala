package gautamspeakscom.wordpress.com.dailyCodingProblem

import scala.collection.mutable
import scala.collection.mutable.Queue
import scala.collection.mutable.Stack


//noinspection SpellCheckingInspection
object day1 {


  /**
    * Given a stack of N elements, interleave the first half of the stack with the second half reversed
    * using only one other queue. This should be done in-place.
    * Recall that you can only push or pop from a stack, and enqueue or dequeue from a queue.
    *
    * For example, if the stack is [1, 2, 3, 4, 5], it should become [1, 5, 2, 4, 3]. If the stack is [1, 2, 3, 4],
    * it should become [1, 4, 2, 3].
    */

   def interleaf_with_List(numbers: List[Int]): List[Int] = {
    val isEven = numbers.length % 2 == 0
    val iter =  if(isEven) numbers.length/2 -1 else numbers.length/2
    val length = numbers.length -1
    var res = List[Int]()
    for(i <- 0 to iter) {
        if(i == iter && !isEven)
          res = numbers(length -i)  :: res
        else
          res = numbers(length -i) :: numbers(i)  :: res

    }
    res.reverse
  }

  def interleaf(numbers: List[Int]): List[Int] = {
    val stackNum = mutable.Stack[Int]()
    numbers.foreach(num => stackNum.push(num))

    val q = new mutable.Queue[Int]()
    numbers.foreach(num => q.enqueue(num))

    val isEven = numbers.length % 2 == 0
    val iter =  if(isEven) numbers.length/2 -1 else numbers.length/2

    var res = List[Int]()

    for(i <- 0 to iter){
      if(i == iter && !isEven)
        res = stackNum.pop() :: res
      else
        res = stackNum.pop() :: q.dequeue() :: res
    }

    res.reverse
  }
}
