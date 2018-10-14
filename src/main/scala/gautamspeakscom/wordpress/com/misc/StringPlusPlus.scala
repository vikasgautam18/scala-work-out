package gautamspeakscom.wordpress.com.misc

object StringPlusPlus {

  implicit class Utils(s: String){

    def increment: String = for (c <- s) yield (c+1).toChar

  }
}

