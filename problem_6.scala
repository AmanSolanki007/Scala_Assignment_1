package excercise

object problem_6 {
  def main(args: Array[String]): Unit = {
    test(100,200)
  }

  def test(x:Int,y:Int): Unit ={
    if(x <= 20 && y >= 50 || y <= 20 && x >= 50) println("True")
    else println("False")

  }
}
