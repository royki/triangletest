package suprnation.triangletest

import suprnation.triangletest.Utils._

object Minpathcalulation extends App {
    val input = Utils.readFile("inputdata.txt").get
    
    // println(Utils.inputToInt(input))
    def sum(triangle: List[List[Int]]) = {
        triangle.reduceRight((upper, lower) =>
            upper zip (lower zip lower.tail)
            map {case (up, (left, right)) => up + Math.min(left, right)}
        ).head
    }
    println("Triangle is: ")
    Utils.readFile("inputdata.txt").get.foreach(x => println(x))
    println("Minimal path is: " + sum(Utils.inputToInt(input)))
}