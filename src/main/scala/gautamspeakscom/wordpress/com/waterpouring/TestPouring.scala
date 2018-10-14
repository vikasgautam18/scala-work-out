package gautamspeakscom.wordpress.com.waterpouring

object TestPouring {
    def main(args: Array[String]): Unit = {
      val p = new Pouring(Vector(4, 9))
      println(p.solution(6))
    }
}
