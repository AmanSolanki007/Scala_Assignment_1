package excercise

object problem_4 {

  def main(args: Array[String]): Unit = {
    test("My name is Lakhan ")
  }

  def test(str: String): Unit = {
    if (str.startsWith("if")) println(str)
    else println("if " + str)
  }
}
