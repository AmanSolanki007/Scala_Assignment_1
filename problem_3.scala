package excercise

object problem_3 {

  def main(args: Array[String]): Unit = {
    test("Scala")
  }

  def test(str: String): Unit = {
    var len: Int = str.length
    var re: Char = str.charAt(len - 1)
    var result: String = re + str + re
    println(result)
  }

}
