package gautamspeakscom.wordpress.com.week1

object BinaryTree {

  abstract class IntSet {

    // 1. include - add data to BinaryTree
    def include(x: Int): IntSet

    // 2. contains - find if data exists in Binary Tree
    def contains(x: Int): Boolean

    // 3. union - add a BT to current
    def union(other: IntSet): IntSet
  }

  class Empty extends IntSet {
    override def include(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)

    override def contains(x: Int): Boolean = false

    override def union(other: IntSet): IntSet = other
  }

  class NonEmpty(element: Int, left: IntSet, right: IntSet) extends IntSet {
    override def include(x: Int): IntSet = {
      if (x > element) new NonEmpty(element, left, right.include(x))
      else if (x < element) new NonEmpty(element, left.include(x), right)
      else this
    }

    override def contains(x: Int): Boolean = {
      if (x > element) right.contains(x)
      else if (x < element) left.contains(x)
      else true
    }

    def union(other: IntSet): IntSet = {
      left.union(right).union(other).include(element)
    }
  }

}
