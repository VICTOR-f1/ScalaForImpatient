import java.net.{MalformedURLException, URL}
import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.math.sqrt
import scala.util.Sorting.quickSort

object Program extends App {
  val objChapter1 = new Chapter1()
  //  objChapter1.exercise6()
  //  objChapter1.exercise9()

  val objChapter2 = new Chapter2()
  //  println(objChapter2.exercise1(0))
  //  objChapter2.exercise4()
  //  objChapter2.exercise5(4)
  //  objChapter2.exercise6("Unicode")

  val objChapter3 = new Chapter3()
  objChapter3.exercise1(10)
  objChapter3.exercise2(Array(1, 2, 3, 4, 5))
  objChapter3.exercise3(Array(2, 1, 4, 3, 5))
  objChapter3.exercise4(Array(0, 1, 0, -3, 5))

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

  /**
   * Напишите цикл for для вычисления произведения кодовых пунктов Юникода всех
   * букв в строке. Например, произведение символов в строке "Hello" равно 9415087488L.
   */
  def exercise6(str: String): Unit = {
    var result: Long = 1
    for (ch <- str) {
      result *= ch.toInt
    }
    println(result)
  }
}

class Chapter3 {
  /**
   * Напишите фрагмент кода, который записывает в массив a целые числа
   * в диапазоне от 0 (включительно) до n (исключая его).
   */
  def exercise1(n: Int): Unit = {
    val arr = new Array[Int](n)
    for (i <- arr.indices) {
      arr(i) = i
    }
    println(arr.mkString(" "))
  }

  /**
   * Напишите цикл, меняющий местами смежные элементы в массиве целых чисел.
   * Например, Array(1, 2, 3, 4, 5) должен стать Array(2, 1, 4, 3, 5).
   */
  def exercise2(array: Array[Int]): Unit = {
    val n = array.length
    val result = new Array[Int](n)
    for (i <- 0 until n - 1 by +2) {
      result(i) = array(i + 1)
      result(i + 1) = array(i)
    }
    result(n - 1) = array(n - 1)
    println(result.mkString(" "))
  }

  /**
   * Повторите предыдущее упражнение, но создайте новый массив с переставленными
   * элементами. Используйте for/yield.
   */
  def exercise3(array: Array[Int]): Unit = {
    val n = array.length
    val result = new Array[Int](n)
    for (i <- 0 until n - 1 by +2) {
      result(i + 1) = array(i)
      result(i) = array(i + 1)
    }
    result(n - 1) = array(n - 1)
    println(result.mkString(" "))
  }

  /**
   * Дан массив целых чисел, создайте новый массив, в котором сначала
   * будут следовать положительные значения из оригинального массива,
   * в оригинальном порядке, а за ними отрицательные и нулевые значения,
   * тоже в оригинальном порядке.
   */
  def exercise4(array: Array[Int]): Unit = {
    val n = array.length
    val result = new ArrayBuffer[Int](n)
    for (i <- array.indices) {
      if (array(i) > 0) {
        result += array(i)
      }
    }
    for (i <- array.indices) {
      if (array(i) < 0) {
        result += array(i)
      }
    }
    for (i <- array.indices) {
      if (array(i) == 0) {
        result += array(i)
      }
    }
    println(result.mkString(" "))
  }
}