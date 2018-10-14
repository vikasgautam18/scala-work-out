package gautamspeakscom.wordpress.com.misc

object IntegerPlusPlus {

  implicit class Utils(s: Int){

    def increment: Int = s + 1
    def decrement: Int = s - 1

  }
}

