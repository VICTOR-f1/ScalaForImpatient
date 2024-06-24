import java.net.{MalformedURLException, URL}
import scala.io.StdIn
import scala.math.sqrt

object Program extends App {
  val objChapter1: Chapter1 = new Chapter1()
  //  objChapter1.exercise6()
  //  objChapter1.exercise9()

  val objChapter2: Chapter2 = new Chapter2()
//    println(objChapter2.exercise1(0))
//    objChapter2.exercise4()
  objChapter2.exercise5(4)


}

class Chapter1 {
  /**
   * Используя число типа BigInt, вычислите 21024
   */
  def exercise6(): Unit = println(BigInt(2).pow(1024))

  /**
   * Как получить первый символ строки в языке Scala? А последний символ?
   */
  def exercise9(): Unit = {
    val str = "Scala"
    println(str(0) + " " + str(str.length - 1))
  }
}

class Chapter2 {
  /**
   * Сигнум числа равен 1, если число положительное, -1 – если отрицательное, и 0 – если оно равно нулю.
   * Напишите функцию, вычисляющую это значение.
   */
  def exercise1(num: Int): Int = {
    if (num > 0) {
      1
    } else if (num < 0) {
      -1
    } else {
      0
    }
  }

  /**
   * Напишите на языке Scala цикл, эквивалентный циклу for на  языке Java:
   * for (int i = 10; i >= 0; i--) System.out.println(i);
   */
  def exercise4(): Unit = {
    for (i <- 10 until 0 by -1) {
      println(i)
    }
  }

  /**
   * Напишите процедуру countdown(n: Int), которая выводит числа от n до 0
   */
  def exercise5(n: Int): Unit = {
    for (i <- 0 until n) {
      println(i)
    }
  }

}