package suprnation.triangletest

final class MinimalpathSuite extends TestSuite {
  test("minimalpath") {
    Minpathcalulation.sum(Utils.Utils.inputToInt(Utils.Utils.readFile("inputdata.txt").get)) shouldBe 18
  }
}
