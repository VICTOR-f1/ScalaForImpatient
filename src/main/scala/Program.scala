import java.io.{File, PrintWriter}
import java.net.{MalformedURLException, URL}
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.math.{abs, sqrt}
import scala.util.Sorting.quickSort
import scala.io.Source
import MyPackeges.Random
import Program.objChapter2
import com.sun.jndi.url.rmi.rmiURLContext.Parser

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.sys.process.*
import java.nio.file.{Files, Paths}
import java.time.LocalDate
import java.util.TimeZone
import scala.::
import scala.concurrent.Future
import scala.jdk.CollectionConverters
import scala.util.Success
import scala.util.parsing.combinator.syntactical.StandardTokenParsers

object Program extends App {
  val objChapter1 = new Chapter1()
  //  objChapter1.exercise6()
  //  objChapter1.exercise9()

  val objChapter2 = new Chapter2()
  //  println(objChapter2.exercise1(0))
  //  objChapter2.exercise4()
  //  objChapter2.exercise5(4)
  //  objChapter2.exercise6("Unicode")
  //  objChapter2.exercise7("Unicode")
  //  val result = objChapter2.exercise8("Unicode")
  //  println(result)

  //  упражнение 11 глава 2
  //  val year = 2023
  //  val month = 5
  //  val day = 11
  //  val date2 = date"$year-$month-$day"
  //  println(s"Дата: $date2")

  val objChapter3 = new Chapter3()
  //  objChapter3.exercise1(10)
  //  objChapter3.exercise2(Array(1, 2, 3, 4, 5))
  //  objChapter3.exercise3(Array(2, 1, 4, 3, 5))
  //  objChapter3.exercise4(Array(0, 1, 0, -3, 5))
  //  objChapter3.exercise8()
  //  objChapter3.exercise9()
  //  objChapter3.exercise10()
  //  objChapter3.exercise11()

  val objChapter4 = new Chapter4()
  //  objChapter4.exercise2()
  //  objChapter4.exercise3()
  //  objChapter4.exercise4()

  val objChapter5 = new Chapter5()

  //  // упражнение 2 глава 5
  //  val time1 = objChapter5.Time(1, 5)
  //  val time2 = objChapter5.Time(21, 5)
  //  println(time1.before(time2))
  //
  //  // упражнение 3 глава 5
  //  val time2_1 = objChapter5.Time2(1, 5)
  //  val time2_2 = objChapter5.Time2(21, 5)
  //  println(time2_1.before(time2_2))
  //
  //  // упражнение 4 глава 5
  //  val objPerson = objChapter5.Person(-10)

  val objChapter6 = new Chapter6()

  // упражнение 2 глава 6
  //  var objUnitConversion: objChapter6.UnitConversion = objChapter6.GallonsToLiters
  //  println(objUnitConversion.convert(5))
  //
  //  objUnitConversion = objChapter6.MilesToKilometers
  //  println(objUnitConversion.convert(7))
  //
  //  objUnitConversion = objChapter6.InchesToCentimeters
  //  println(objUnitConversion.convert(70))
  //
  //  // упражнение 4 и 5 глава 6
  //
  //  println(objChapter6.CardSuit.toString(1))
  //  println(objChapter6.CardSuit.isRed(0))

  //  // упражнение 3 глава 7
  //
  //  Random.setSeed(10)
  //  println(Random.nextInt())
  //  println(Random.nextDouble())

  val objChapter8 = new Chapter8()

  //  //  упражнение 1 глава 8
  //  val checkingAccount = new objChapter8.CheckingAccount(20)
  //  println(checkingAccount.currentBalance)
  //
  //  checkingAccount.deposit(10)
  //  println(checkingAccount.currentBalance)
  //
  //  checkingAccount.withdraw(20)
  //  println(checkingAccount.currentBalance)
  //
  //  //  упражнение 2 глава 8
  //
  //  val savingAccount = new objChapter8.SavingsAccount(20)
  //  println(checkingAccount.currentBalance)
  //
  //  savingAccount.deposit(10)
  //  println(savingAccount.currentBalance)
  //
  //  savingAccount.withdraw(20)
  //  println(savingAccount.currentBalance)
  //
  //  savingAccount.earnMonthlyInterest(20)
  //  println(savingAccount.currentBalance)
  //
  //  val item1 = new objChapter8.SimpleItem(10.0, "Item 1")
  //  val item2 = new objChapter8.SimpleItem(20.0, "Item 2")
  //
  //  val bundle = new objChapter8.Bundle
  //  bundle.addItem(item1)
  //  bundle.addItem(item2)
  //
  //  println(bundle.price)
  //  println(bundle.description)

  val objChapter9 = new Chapter9()
  //  objChapter9.exercise1()
  //  objChapter9.exercise3()
  //  objChapter9.exercise5()

  val objChapter11 = new Chapter11()
  //
  //  val fraction1 = new objChapter11.Fraction(15, -6)
  //  val fraction2 = new objChapter11.Fraction(2, 3)
  //
  //  println(fraction1)
  //  println(fraction1 + fraction2)
  //  println(fraction1 - fraction2)
  //  println(fraction1 * fraction2)
  //  println(fraction1 / fraction2)

  val objChapter12 = new Chapter12()
  //  val result = objChapter12.exercise1(x => x * x, -5, 5)
  //  println(result)
  //  objChapter12.exercise2()
  //  println(objChapter12.exercise3(3))

  val objChapter13 = new Chapter13()
  //  println(objChapter13.exercise1("Mississippi").mkString(" || "))
  //  println(objChapter13.exercise4(Array("Tom","Fred", "Harry")).mkString(" || "))

  val objChapter14 = new Chapter14()

  //  println(objChapter14.exercise2(1, 2))
  //  println(objChapter14.exercise3(Array(1, 2, 3, 4)).mkString(" "))

  val objChapter15 = new Chapter15()

  //  println(objChapter15.exercise4(1, 2,3,4,5))
  //  println(objChapter15.exercise5("myfile.txt"))

  val objChapter16 = new Chapter16()

  //  val map = Map("A" -> "1", "B" -> "2")
  //  println(objChapter16.exercise7(map))
  //  println(objChapter16.exercise8("<dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>").mkString(" "))

  val objChapter17 = new Chapter17()

  //  def addOne(n: Int): Future[Int] = Future {
  //    Thread.sleep(50)
  //    n + 1
  //  }
  //
  //  def multiplyByTwo(n: Int): Future[Int] = Future {
  //    Thread.sleep(100)
  //    n * 2
  //  }
  //
  //  val result = objChapter17.exercise2(addOne, multiplyByTwo)(57)
  //
  //  result.onComplete{
  //    case Success(value)=> println(value)
  //  }
  //
  //  Thread.sleep(1000)

  val objChapter18 = new Chapter18()

  //  //  упражнение 1 глава 18
  //  val pair1 = objChapter18.Pair(1, "Hello")
  //  val pair2 = pair1.swap
  //
  //
  //  println(pair1.first + " " + pair1.second)
  //  println(pair2.first + " " + pair2.second)
  //  //  упражнение 3 глава 18
  //  val pair3 = pair2.swap2(pair2)
  //  println(pair3.first + " " + pair3.second)
  //
  //  //  упражнение 2 глава 18
  //  val pair = new objChapter18.Pair2[Int](1, 2)
  //  println(pair.first + " " + pair.second)
  //
  //  pair.swap()
  //  println(pair.first + " " + pair.second)
  val objChapter19 = new Chapter19()

  //  val bugsy = new objChapter19.Bug()
  //  bugsy.move(4).show().move(6).show().turn().move(5).show()
  //  println("\n" + bugsy.direction + " " + bugsy.position)
  //
  //  objChapter19.exercise8((x: Int) => x * x, 3, 6)

  val objChapter20 = new Chapter20()

  //  val parser = new objChapter20.exercise1()
  //
  //  val input = "1 + 2 * 3 - 4 % 7 /10"
  //  val result = parser.parseAll(parser.expr, input)
  //
  //  println(result)

  //  //  упражнение 2 глава 21
  //  val result = 120 +% 10
  //  println(result)
  //
  //  //  упражнение 3 глава 21
  //  val result2 = 5 ! 10
  //  println(result2)

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
    var result: Int = 1
    for (ch <- str) {
      result *= ch.toInt
    }
    println(result)
  }

  /**
   * Решите предыдущее упражнение без применения цикла.
   */
  def exercise7(str: String): Unit = {
    val result = str.toSeq.map(_.toInt).product
    println(result)
  }

  /**
   * Сделайте функцию из предыдущего упражнения рекурсивной
   */
  def exercise8(str: String): Int = {
    if (str.isEmpty) 1
    else str.head.toInt + exercise8(str.tail)
  }
}

/**
 * Упражение 11 глава 2
 * Определите интерполятор строк date, чтобы значение типа
 * java.time.LocalDate можно было определить как date"$year$month-$day". Для этого вам потребуется определить «неявный»
 * класс с методом date, например:
 * implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
 * def date(args: Any*): LocalDate = . . .
 * }
 */
implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
  def date(args: Int*) = {
    LocalDate.of(args(0), args(1), args(2))
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


  /**
   * Перепишите решение на языке Scala, сначала собрав все позиции отрицательных
   * элементов, затем перевернув последовательность и вызвав
   * a.remove(i) для каждого индекса.
   */
  def exercise8(): Unit = {
    var a = ArrayBuffer(1, -2, 3, -4, 5, -6, 7, 8)
    val indexKeep = ArrayBuffer[Int]()
    var first = true
    for (i <- a.indices) {
      if (!first && a(i) < 0) {
        indexKeep += i
      }
      if (first && a(i) < 0) {
        first = false
      }
    }
    for (i <- indexKeep.indices.reverse) a.remove(indexKeep(i))

    println(a.mkString(" "))
  }

  /**
   * Улучшите решение из предыдущего упражнения. Соберите индексы элементов,
   * подлежащих перемещению и позиции, куда они должны быть помещены.
   * Переместите их и укоротите буфер. Не копируйте элементов, находящихся перед первым
   * нежелательным элементом.
   */
  def exercise9(): Unit = {
    var a = ArrayBuffer(1, -2, 4, -6, 7, -8, 9)
    var first = true
    val positionKeep = for (i <- a.indices if a(i) >= 0 || first) yield {
      if (first && a(i) < 0) {
        first = false
      }
      a(i)
    }
    for (i <- positionKeep.indices) {
      a(i) = positionKeep(i)
    }
    a.trimEnd(a.length - positionKeep.length)
    println(a.mkString(" "))
  }

  /**
   * Создайте коллекцию всех часовых поясов, возвращаемых методом java.util.TimeZone.getAvailableIDs
   * для Америки. Отбросьте префикс "America/" и отсортируйте результат
   */
  def exercise10(): Unit = {
    val id = "America/"
    //обрезка префикска
    val a = TimeZone.getAvailableIDs.filter(_.startsWith(id)).map(_.stripPrefix(id))
    a.foreach(println)
  }

  /**
   * Импортируйте java.awt.datatransfer._ и создайте объект типа SystemFlavorMap вызовом
   * val flavors = SystemFlavorMap.getDefaultFlavorMap(). asInstanceOf[SystemFlavorMap]
   * Затем вызовите метод getNativesForFlavor с параметром DataFlavor.imageFlavor
   * и получите возвращаемое значение как буфер Scala.
   */
  def exercise11(): Unit = {
    //Получает  SystemFlavorMap  -  это объект, содержащий информацию о доступных типах данных (flavours) для передачи данных в Java.
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val flavorBuffer = CollectionConverters.CollectionHasAsScala(flavors.getNativesForFlavor(DataFlavor.stringFlavor)).asScala

    flavorBuffer.foreach(println)
  }

}

class Chapter4 {
  /**
   * Напишите программу, читающую слова из файла. Используйте изменяемый ассоциативный массив
   * для подсчета вхождений каждого слова. Для чтения слов используйте java.util. Scanner:
   * * Как получить первый символ строки в языке Scala? А последний символ?
   * В конце выведите все слова и их счетчики.
   */
  def exercise2(): Unit = {
    val pair = new mutable.HashMap[String, Int]
    val bufferedSource = scala.io.Source.fromFile("myfile.txt")
    for (lines <- bufferedSource.getLines()) {
      lines.split("\\W+").foreach(w => pair(w) = pair.getOrElse(w, 0) + 1)
    }
    bufferedSource.close()
    pair.foreach(println)
  }

  /**
   * Выполните предыдущее упражнение, используя неизменяемый ассоциативный массив
   */
  def exercise3(): Unit = {
    val bufferedSource = scala.io.Source.fromFile("myfile.txt")
    val words = bufferedSource.mkString.split("\\W+")
    val wordCounts = (for (w <- words.distinct) yield (w, words.count(_ == w))).toMap
    bufferedSource.close()
    wordCounts.foreach(println)
  }

  /**
   * Выполните предыдущее упражнение, используя сортированный ассоциативный массив, чтобы слова выводились в отсортированном порядке.
   */
  def exercise4(): Unit = {
    val bufferedSource = scala.io.Source.fromFile("myfile.txt")
    val words = bufferedSource.mkString.split("\\W+")
    val wordCounts = (for (w <- words.distinct) yield (w, words.count(_ == w))).toMap
    bufferedSource.close()
    wordCounts.foreach(println)
  }
}

class Chapter5 {
  /**
   * Напишите класс BankAccount с методами deposit и withdraw
   * и свойством balance, доступным только для чтения */
  class BankAccount {
    val balance = 0

    def deposit(): Unit = {
    }

    def withdraw(): Unit = {
    }
  }

  /**
   * Напишите класс Time со свойствами hours и minutes, доступными только для чтения,
   * и методом before(other: Time): Boolean, который проверяет, предшествует ли время this времени other.
   * Объект Time должен конструироваться как new Time(hrs, min), где hrs – время в 24-часовом формате. */
  class Time(val hours: Int, val minutes: Int) {
    def before(other: Time): Boolean = {
      if (hours < other.hours) {
        true
      }
      else if (hours == other.hours && minutes < other.minutes) {
        true
      }
      else {
        false
      }
    }
  }

  /**
   * Перепишите класс Time из предыдущего упражнения, чтобы внутри время
   * было представлено количеством минут, прошедших с начала суток (между 0 и 24×60 – 1).
   * Общедоступный интерфейс при этом не должен измениться.
   * То есть эти изменения не должны оказывать влияния на клиентский код */
  class Time2(val hours: Int, val minutes: Int) {
    var timeMinutes: Int = hours * minutes

    def before(other: Time2): Boolean = {
      if (timeMinutes < other.timeMinutes) {
        true
      }
      else {
        false
      }
    }
  }

  /**
   * В классе Person из раздела 5.1 «Простые классы и методы без параметров»
   * реализуйте главный конструктор, преобразующий отрицательное значение возраста в 0. */
  class Person(var _age: Int) {
    println(_age)

    def age_=(newAge: Int): Unit = {
      if (newAge < 0) {
        _age = 0
      } else {
        _age = newAge
      }
      println(_age)
    }
  }
}

class Chapter6 {
  /**
   * Реализуйте общий суперкласс UnitConversion и определите объекты
   * InchesToCentimeters, GallonsToLiters и MilesToKilometers, наследующие его.
   * */
  abstract class UnitConversion {
    def convert(value: Double): Double
  }

  object InchesToCentimeters extends UnitConversion {
    override def convert(num: Double): Double = 1 * num
  }

  object GallonsToLiters extends UnitConversion {
    override def convert(num: Double): Double = 2 * num
  }

  object MilesToKilometers extends UnitConversion {
    override def convert(num: Double): Double = 3 * num
  }

  object CardSuit extends Enumeration {
    val Clubs = Value("♣")
    val Diamonds = Value("♦")
    val Hearts = Value("♥")
    val Spades = Value("♠")

    def isRed(num: Int): Boolean = {
      num == Diamonds.id || num == Hearts.id
    }

    def toString(num: Int): String = {
      num match {
        case 1 => "♣"
        case 2 => "♦"
        case 3 => "♥"
        case 4 => "♠"
      }
    }
  }
}

class Chapter8 {
  /**
   * Определите класс CheckingAccount, наследующий класс BankAccount,
   * который взимает $1 комиссионных за каждую операцию пополнения или списания.
   */
  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def currentBalance = balance

    def deposit(amount: Double) = {
      balance += amount
      balance
    }

    def withdraw(amount: Double) = {
      balance -= amount
      balance
    }
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private var balance = initialBalance

    override def currentBalance = balance

    override def deposit(amount: Double) = {
      balance += amount - 1
      balance
    }

    override def withdraw(amount: Double) = {
      balance -= amount - 1
      balance
    }
  }

  /**
   * Определите класс SavingsAccount, наследующий класс BankAccount
   * из предыдущего упражнения, который начисляет проценты каждый месяц
   * (вызовом метода earnMonthlyInterest) и позволяет бесплатно выполнять три операции зачисления
   * или списания каждый месяц. Метод earnMonthlyInterest должен сбрасывать счетчик транзакций
   */
  class SavingsAccount(initialBalance: Double) extends CheckingAccount(initialBalance) {
    private var balance = initialBalance
    private var transactionCount = 0

    override def currentBalance = balance

    override def deposit(amount: Double) = {
      if (transactionCount <= 3) {
        balance += amount - 1
      }
      else {
        balance += amount
      }
      transactionCount += 1
      balance
    }

    override def withdraw(amount: Double) = {
      if (transactionCount <= 3) {
        balance -= amount - 1
      }
      else {
        balance -= amount
      }
      transactionCount += 1
      balance
    }

    def earnMonthlyInterest(percent: Double) = {
      balance *= percent
      transactionCount = 0
      balance
    }
  }

  /**
   * Определите абстрактный класс элемента Item с методами price и description.
   * Определите подкласс простого элемента SimpleItem, представляющий элемент,
   * цена и описание которого определяются в конструкторе. Используйте тот факт, что
   * объявление val может переопределять def. Определите класс Bundle – пакет элементов,
   * содержащий другие элементы. Его цена должна определяться как сумма цен элементов в пакете.
   * Реализуйте также механизм добавления элементов в пакет и соответствующий метод description.
   */
  abstract class Item {
    def price: Double

    def description: String
  }

  class SimpleItem(override val price: Double, override val description: String) extends Item {

  }

  class Bundle extends Item {
    private var items: ArrayBuffer[Item] = new ArrayBuffer[Item]()

    def addItem(item: Item): Unit = {
      items += item
    }

    override def price: Double = items.map(_.price).sum

    override def description: String = items.map(_.description).mkString(", ")
  }
}

class Chapter9 {
  /**
   * Напишите на языке Scala код, который размещает строки в файле в
   * обратном порядке (последнюю делает первой и т. д.)
   * */
  def exercise1() = {
    val lines = Source.fromFile("myfile.txt")
    val textFile = lines.mkString.split("\\s+").reverse
    lines.close()

    val out = new PrintWriter("myfile.txt")
    for (text <- textFile) out.println(text)
    out.close()
  }

  /**
   * Напишите фрагмент кода на Scala, который читает файл и выводит в консоль все слова,
   * содержащие 12 или более символов. Дополнительные баллы начисляются тем, кто сможет сделать
   * это в одной строке кода.
   */
  def exercise3() = {
    val lines = Source.fromFile("myfile.txt")
    val count = lines.mkString.split("\\s+").filter(x => x.length > 12)
    lines.close()
    println(count.mkString(" "))
  }

  /**
   * Напишите программу на Scala, которая записывает степени двойки и их обратные величины
   * в файл с экспонентой от 0 до 20. Расположите числа в столбцах:
   */
  def exercise5() = {
    val out = new PrintWriter("exercise5Chapter9.txt")

    for (i <- 0 until 20) {
      if (i % 2 == 0) {
        val exponent: Double = 1.0 / i
        out.println(i + "   " + exponent)
      }
    }
    out.close()

  }
}


class Chapter11 {
  /**
   * Реализуйте класс Fraction с операциями + - * / . Реализуйте нормализацию
   * рациональных чисел, например чтобы число 15/–6 превращалось в –5/3,
   * а также деление на наибольший общий делитель, как показано ниже:
   * */
  class Fraction(n: Int, d: Int) {
    private val num: Int =
      if (d == 0) {
        1
      }
      else {
        n * sign(d) / gcd(n, d)
      }

    private val den: Int =
      if (d == 0) {
        0
      }
      else {
        d * sign(d) / gcd(n, d)
      }

    override def toString: String = s"$num/$den"

    private def sign(a: Int): Int =
      if (a > 0) {
        1
      }
      else if (a < 0) {
        -1
      }
      else {
        0
      }

    private def gcd(a: Int, b: Int): Int =
      if (b == 0) {
        abs(a)
      }
      else {
        gcd(b, a % b)
      }

    def +(other: Fraction): Fraction = {
      val commonDen = den * other.den
      val newNum = num * other.den + other.num * den
      Fraction(newNum, commonDen)
    }

    def -(other: Fraction): Fraction = {
      val commonDen = den * other.den
      val newNum = num * other.den - other.num * den
      Fraction(newNum, commonDen)
    }

    def *(other: Fraction): Fraction = {
      Fraction(num * other.num, den * other.den)
    }

    def /(other: Fraction): Fraction = {
      Fraction(num * other.den, den * other.num)
    }
  }
}


class Chapter12 {
  /**
   * Напишите функцию values(fun: (Int) => Int, low: Int, high: Int),
   * возвращающую коллекцию из значений в указанном диапазоне. Например,
   * вызов values(x => x * x, -5, 5) должен вернуть коллекцию пар (-5, 25),
   * (-4, 16), (-3, 9), ..., (5, 25).
   * */
  def exercise1(fun: Int => Int, low: Int, high: Int) = {
    for (i <- low to high) yield (i, fun(i))
  }

  /**
   * Как получить наибольший элемент массива с помощью метода
   * reduceLeft?
   * */
  def exercise2() = {
    val array = Array(3, 7, 2, 9, 1, 5)
    val maxElement = array.reduceLeft((x, max) => if (x < max) max else x)

    println(maxElement)
  }

  /**
   * Реализуйте функцию вычисления факториала с помощью методов
   * to и reduceLeft без применения цикла или рекурсии.
   */
  def exercise3(num: Int) = {
    if (num == 0) {
      1
    } else {
      (1 to num).reduceLeft((x, res) => x * res)
    }
  }
}


class Chapter13 {

  /**
   * Напишите функцию, возвращающую для указанной строки отображение индексов всех символов.
   * Например, вызов exercise1("Mississippi") должен вернуть ассоциативный массив, 230 Коллекции
   * связывающий 'M' со множеством {0}, 'i' – со множеством {1, 4, 7, 10} и т. д.
   * Используйте изменяемый ассоциативный массив, отображающий символы в изменяемые множества
   */
  def exercise1(str: String) = {
    val pair = mutable.Map[Char, ArrayBuffer[Int]]()
    for (i <- str.indices) pair(str(i)) = pair.getOrElse(str(i), ArrayBuffer()) += i
    pair
  }

  /**
   * Напишите функцию, принимающую коллекцию строк и ассоциативный массив.
   * Она олжна возвращать коллекцию целых чисел, значения которых соответствуют строкам
   * в ассоциативном массиве, повторяющимся в исходной коллекции.
   * Например, для Array("Tom", "Fred", "Harry") и Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
   */
  def exercise4(arr: Array[String]) = {
    val pair = mutable.Map[String, Int]()
    for (i <- arr.indices) pair(arr(i)) = pair.getOrElse(arr(i), 0) + arr(i).length
    pair
  }
}

class Chapter14 {
  /**
   * Используя сопоставление с образцом, напишите функцию swap, которая принимает пару
   * целых чисел и возвращает ту же пару, поменяв компоненты местами
   */
  def exercise2(firstNum: Int, secondNum: Int): (Int, Int) = firstNum match {
    case _ => (secondNum, firstNum)
  }

  /**
   * Используя сопоставление с образцом, напишите функцию swap, которая меняет местами первые
   * два элемента массива, если он имеет длину не меньше дву
   * */
  def exercise3(arr: Array[Int]): Array[Int] = arr match {
    case Array(a, b, rest*) => Array(b, a) ++ rest
    case _ => Array(-1)
  }
}

class Chapter15 {
  /**
   * Напишите метод sum с переменным числом целочисленных аргументов,
   * возвращающий сумму своих аргументов
   */
  def exercise4(nums: Int*) = {
    var res = 0
    for (num <- nums) res += num
    res
  }

  /**
   * Напишите метод, возвращающий строковое значение с содержимым текстового файла.
   */
  def exercise5(fileName: String) = {
    val lines = Source.fromFile(s"$fileName")
    val textFile = lines.mkString.split("\\s+").mkString(" ")
    lines.close()
    textFile
  }
}


class Chapter16 {
  /**
   * Напишите функцию, принимающую параметр типа Map[String, String] и возвращающую элемент
   * dl с элементом dt – для каждого ключа и dd – для каждого значения. Например, для
   * Map("A" -> "1", "B" -> "2") функция должна вернуть
   * <dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>
   */
  def exercise7(pair: Map[String, String]): String = {
    val result = for ((x, y) <- pair) yield s"<dt>$x</dt><dd>$y</dd>"
    s"<dl>${result.mkString}</dl>"
  }

  /**
   * Напишите функцию, принимающую элемент dl и превращающую его в Map[String, String].
   * Эта функция является полной противоположностью функции из предыдущего упражнения
   */
  def exercise8(str: String): Map[Char, Int] = {
    val map = mutable.Map[Char, Int]()
    var current = ' '
    for (ch <- str) {
      if (ch.isUpper) {
        map.addOne(ch, 1)
        current = ch
      }
      if (ch.isDigit) {
        map(current) = ch.asDigit
      }
    }
    map.toMap
  }
}

class Chapter17 {
  /**
   * Напишите функцию doInOrder, принимающую функции f: T => Future[U] и g: U => Future[V] и
   * возвращающую функцию T => Future[U], которая для заданного значения t в конечном счете
   * возвращает g(f(t)).
   */
  def exercise2[T, U, V](f: T => Future[U], g: U => Future[V]): T => Future[V] = {
    t => f(t).flatMap(g)
  }
}

class Chapter18 {
  /**
   * Определите неизменяемый класс Pair[T, S] с методом swap, возвращающим новую пару,
   * где компоненты поменяны местами.
   */
  class Pair[T, S](var first: T, var second: S) {
    def swap: Pair[S, T] = Pair(second, first)

    /**
     * Для класса Pair[T, S] напишите обобщенный метод swap, который принимает
     * пару в виде аргумента и возвращает новую пару с компонентами, поменянными местами.
     */
    def swap2(pair: Pair[T, S]): Pair[T, S] = Pair(first, second)

  }

  /**
   * Определите изменяемый класс Pair[T] с методом swap, который меняет компоненты пары местами.
   */
  class Pair2[T](var first: T, var second: T) {
    def swap() = {
      val temp = first
      first = second
      second = temp
    }
  }
}

class Chapter19 {
  /**
   * Реализуйте класс Bug, моделирующий жука, перемещающегося по горизонтальной линии.
   * Метод move перемещает жука в текущем направлении, метод turn изменяет направление на
   * противоположное, а метод show выводит текущую позицию. Обеспечьте возможность составления
   * цепочек из вызовов этих методов. Например, цепочка: bugsy.move(4).show().move(6).show().
   * turn().move(5).show() должна вывести 4 10 5
   */
  class Bug {
    var position: Int = 0
    var direction: Int = 1

    def move(steps: Int): Bug = {
      position += steps
      this
    }

    def turn(): Bug = {
      direction = -direction
      this
    }

    def show(): Bug = {
      print(position + " ")
      this
    }
  }

  /**
   * Напишите функцию printValues с тремя параметрами: f, from
   * и to, выводящую все значения f, для входных значений в заданном диапазоне
   * от from до to. Здесь f должен быть любым объектом с методом apply,
   * получающим и возвращающим значение типа Int. Например:
   */
  def exercise8(f: Int => Int, from: Int, to: Int): Unit = {
    for (i <- from to to) {
      print(f(i) + " ")
    }
  }
}

class Chapter20 {
  /**
   * Добавьте в парсер арифметических выражений операции / и %.
   */
  class exercise1 extends StandardTokenParsers {
    lexical.delimiters += ("+", "-", "*", "/", "%", "(", ")")

    def expr: Parser[Any] = term ~ rep(("+" | "-") ~ term)

    def term: Parser[Any] = factor ~ rep(("*" | "/" | "%") ~> factor)

    def factor: Parser[Any] = numericLit | "(" ~> expr <~ ")"

    def parseAll[T](p: Parser[T], in: String): ParseResult[T] =
      phrase(p)(new lexical.Scanner(in))
  }
}

/**
 * Определите оператор +%, добавляющий указанный процент к значению.
 * Например, выражение 120 +% 10 должно вернуть 132. Используйте неявный класс.
 */

class Percent(val value: Double) extends AnyVal {
  def +%(percent: Double): Double = value * (1 + percent / 100)
}

implicit class PercentOps(value: Double) {
  def +%(percent: Double): Double = new Percent(value) +% percent
}

class Factorial(val value: Double) extends AnyVal {
  def !(percent: Double): Int = {
    var result = 1
    for (i <- 1 to value.toInt) {
      result = result * i
    }
    result
  }
}

implicit class FactorialOps(value: Double) {
  def !(factorial: Double): Int = new Factorial(value) ! factorial
}