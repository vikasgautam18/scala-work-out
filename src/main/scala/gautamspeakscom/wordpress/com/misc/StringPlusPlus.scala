package gautamspeakscom.wordpress.com.misc

object StringPlusPlus {

  implicit class Utils(s: String){

    def increment = for (c <- s) yield (c+1).toChar

  }
}

