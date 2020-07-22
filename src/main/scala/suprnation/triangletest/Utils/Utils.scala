package suprnation.triangletest.Utils

import scala.io.Source
import scala.util.Try

object Utils {

  val source = System.getProperty("user.dir")
  val resourcePath = "/resources"
  val path = s"$source$resourcePath"

  def readFile(file: String): Try[List[String]] = {
    // TODO: Need To Refactor
    Try {
      val filePath = path + "/" + file
    //   println(filePath)
      val input = Source.fromFile(filePath).getLines().toList
      input
    }
  }

  def inputToInt(i: List[String]): List[List[Int]] = {
    i.filterNot((x => x.isEmpty())).map {
        y => y.split(" ").toList.map(z => z.toInt)
    }
  }
}