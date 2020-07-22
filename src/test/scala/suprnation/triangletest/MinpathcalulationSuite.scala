package suprnation.triangletest

import suprnation.triangletest.Utils.Utils._

final class MinpathcalulationSuite extends TestSuite {
  test("minimalpath of a triangle with 1 value 0") {
    Minpathcalulation.minimalPath(inputToInt(readFile("testdata-0.txt").get)) shouldBe 0
  }
  test("minimalpath a triangle with 1 value nonzero") {
    Minpathcalulation.minimalPath(inputToInt(readFile("testdata-1.txt").get)) shouldBe 12
  }
  test("minimalpath of a triangle with big value") {
    Minpathcalulation.minimalPath(inputToInt(readFile("testdata-big.txt").get)) shouldBe 207
  }
  test("minimalpath of a triangle with 500 value") {
    Minpathcalulation.minimalPath(inputToInt(readFile("testdata-big-1.txt").get)) shouldBe 125250
  }
  test("minimalpath of a pascal triangle") {
    Minpathcalulation.minimalPath(inputToInt(readFile("testdata-pascal.txt").get)) shouldBe 10
  }
}
