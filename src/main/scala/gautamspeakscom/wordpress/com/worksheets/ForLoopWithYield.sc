for( c <- "hello") yield c.toUpper

//for all numbers in a list print test prime

def isPrime(n: Int) = ! ((2 until n-1) exists (n % _ == 0))


val l = List(2, 5, 19, 13 , 12, 14, 6, 16)

for (i <- l) yield isPrime(i)