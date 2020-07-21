package suprnation.triangletest

final class MinpathcalulationSuite extends TestSuite {
  test("minimalpath of a triangle with 1 value 0") {
    Minpathcalulation.sum(Utils.Utils.inputToInt(Utils.Utils.readFile("testdata-0.txt").get)) shouldBe 0
  }
  test("minimalpath a triangle with 1 value nonzero") {
    Minpathcalulation.sum(Utils.Utils.inputToInt(Utils.Utils.readFile("testdata-1.txt").get)) shouldBe 12
  }
  test("minimalpath of a triangle with big value") {
    Minpathcalulation.sum(Utils.Utils.inputToInt(Utils.Utils.readFile("testdata-big.txt").get)) shouldBe 185
  }
  test("minimalpath of a pascal triangle") {
    Minpathcalulation.sum(Utils.Utils.inputToInt(Utils.Utils.readFile("testdata-pascal.txt").get)) shouldBe 10
  }
}
