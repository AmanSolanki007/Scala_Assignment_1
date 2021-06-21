package excercise

object problem_5 {

  def main(args: Array[String]): Unit = {
    test(6000, 9500, 10000)
  }

  def test(n1: Int, n2: Int, compare_no: Int): Unit = {
    var A: Int = compare_no - n1
    var B: Int = compare_no - n2
    if (A < B) println(s"$n1 is nearest to the value $compare_no")
    if (B < A) println(s"$n2 is nearest to the value $compare_no")
    if (n1 == n2) println(0)

  }
}
