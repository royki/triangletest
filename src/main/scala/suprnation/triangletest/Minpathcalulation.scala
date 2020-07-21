package suprnation.triangletest

import suprnation.triangletest.Utils._

object Minpathcalulation extends App {
    val fileName = "inputdata.txt"
    val input = Utils.readFile(fileName).get
    
    // println(Utils.inputToInt(input))
    def minimalPath(triangle: List[List[Int]]): Int = {
        triangle.reduceRight((row, col) =>
            row.zip(col.zip(col.tail)).map {
                case (up, (left, right)) => up + Math.min(left, right)
            }
        ).head
    }
    println("Triangle is: ")
    Utils.readFile(fileName).get.foreach(x => println(x))
    println("Minimal path is: " + minimalPath(Utils.inputToInt(input)))
}