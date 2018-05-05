// 05-May-18

//equate strings

val a = "hello"
val b = "hello"

val c = "hell" + "o"

c == a

c == b

c.toUpperCase == b.toUpperCase

c.equalsIgnoreCase(b)
a.equals(b)


//Multiline String - stripmargin

val line =
  """hello to all of you
    |who are looking at this code
    |how are you doing?
  """.stripMargin

println(line)

val line1 =
  """hello to all of you
    §who are looking at this code
    §how are you doing?
  """.stripMargin('§')

println(line1)

val line2 =
  """hello to all of you
    §who are "looking" at this 'code'
    §how are you doing?
  """.stripMargin('§')

println(line2)






// old stuff

val res = f2(List(1, 2, 3, 4, 5, 6))



def f1(delim: Int, arr: List[Int]): List[Int] = {
  arr.filter(_ < delim)
}

def f2(arr: List[Int]): List[Int] = {
  var l = List[Int]()
  var i = 1
  arr.foreach(x => {
    if (i % 2 == 0)
      l = x :: l
    i = i + 1
  })
  l.reverse
}


println(res)

def f3(num: Int): List[Int] = {
  if (num == 0) List() else num :: f3(num - 1)
}

println(f3(5))

def f4(arr: List[Int]): Int = {
  val x = arr.filter(_ % 2 != 0)

  def fn(index: Int, sum: Int): Int = {
    if (index > x.length - 1)
      sum
    else
      fn(index + 1, sum + x(index))
  }

  fn(0, 0)
}

f4(List(1, 2, 3, 4, 5, 6, 7))

def f(arr: List[Int]): List[Int] = arr.map(_.abs)


