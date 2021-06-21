package excercise

object problem_1 {

  def main(args: Array[String]): Unit = {
    test("india")
  }

  def test(s: String): Unit = {
    var re: String = s.substring(0, 2)
    if (s.length == 2) s + s + s + s
    else (println(re + re + re + re))
  }

}
