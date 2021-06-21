package excercise

object problem_2 extends App {

  def test(s: String, n: Int): Unit = {
    var re: String = s.take(n) + s.drop(n + 1)
    println(re)
  }

  test("Scala", 1)
  test("Scala", 0)
  test("Scala", 2)
}
