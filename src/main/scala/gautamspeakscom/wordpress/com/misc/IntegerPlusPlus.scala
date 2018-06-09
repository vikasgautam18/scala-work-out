package gautamspeakscom.wordpress.com.misc

object IntegerPlusPlus {

  implicit class Utils(s: Int){

    def increment = s + 1
    def decrement = s - 1

  }
}

