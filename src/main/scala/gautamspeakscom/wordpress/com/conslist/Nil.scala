package gautamspeakscom.wordpress.com.conslist

class Nil[T] extends List[T] {
   def isEmpty: Boolean = true
   def head: T = throw new NoSuchElementException("Nil.head")
   def tail: List[T] = throw new NoSuchElementException("Nil.tail")
}
