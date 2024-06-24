object Program extends App {
  val objChapter1: Chapter1 = new Chapter1()
  objChapter1.exercise6()

}

class Chapter1 {

  def exercise6(): Unit = {
    println(BigInt(2).pow(1024))
  }

}
