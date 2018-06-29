// read file from file system
import scala.io.Source
import java.io._

val inputFilename = "/Users/vigautam/FirmActivities/DiveIn Case Study/datasets/BixiMontreal/2014/OD_2014-04.csv"
val outputFileName = "/Users/vigautam/FirmActivities/DiveIn Case Study/datasets/BixiMontreal/2014/modified_OD_2014-04.csv"
val r = new scala.util.Random(31)
val file = new File(outputFileName)
val bw = new BufferedWriter(new FileWriter(file))
var skipFirstLine = true
val constantString = "###@@@"

for (line <- Source.fromFile(inputFilename).getLines) {
  if(!skipFirstLine){
    println(line)
    val line1 = line.replaceFirst(",", randomAlphaNumericString(4))
    val line2 = line1.replaceFirst(",", randomAlphaNumericString(11))
    val line3 = line2.replaceFirst(",", randomAlphaNumericString(7))
    val line4 = line3.replaceFirst(",", randomAlphaNumericString(3))
    val line5 = line4.replaceFirst(",", constantString)
    println(line5)
    bw.write(line5 + "\n")
  }
  else
    println(line)
  skipFirstLine = false
}

bw.close()

def getListOfFiles(dir: String):List[File] = {
  val d = new File(dir)
  if (d.exists && d.isDirectory) {
    d.listFiles.filter(_.isFile).toList
  } else {
    List[File]()
  }
}

def replaceComma (line: String, replacement: String): String = {
  if(line.lastIndexOf(",") == line.indexOf(",")){
    replaceComma(line.replaceFirst(",", replacement), replacement)
  }
  else
    line
}

def randomAlphaNumericString(length: Int): String = {
  //val chars = ('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')
  val chars = ('0' to '9')
  randomStringFromCharList(length, chars)
}

def randomStringFromCharList(length: Int, chars: Seq[Char]): String = {
  val sb = new StringBuilder
  for (i <- 1 to length) {
    val randomNum = util.Random.nextInt(chars.length)
    sb.append(chars(randomNum))
  }
  sb.toString
}


