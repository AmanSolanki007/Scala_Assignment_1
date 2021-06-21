package excercise

object problem_7 {

  def main(args: Array[String]): Unit = {
    test('i',"iamani")

  }

  def test(i:Char,str:String): Unit ={
    var str_len = str.length
    if (str(0)==i && str(str_len-1) == i) println("Happy")
    else(println("Unhappy"))

  }
}