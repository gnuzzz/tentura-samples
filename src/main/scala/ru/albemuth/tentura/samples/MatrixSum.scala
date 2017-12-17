package ru.albemuth.tentura.samples

import ru.albemuth.tentura.tensor.Matrix

import scala.reflect.ClassTag

/**
  * @author Vladimir Kornyshev { @literal <vkornyshev@at-consulting.ru>}
  */
object MatrixSum extends App {

  val ROWS = 512
  val COLS = 128

  val a = new Matrix(values(ROWS, COLS, 1.0f))
  val b = new Matrix(values(ROWS, COLS, 2.0f))

  val result = a + b
  result.copy2host()

  val resultSum = result.values().foldLeft(0.0f)(_ + _.sum)
  println(s"$resultSum, ${3 * ROWS * COLS}")

  def values[T: ClassTag](rows: Int, cols: Int, value: T): Array[Array[T]] = {
    val data = new Array[Array[T]](rows)
    for (i <- data.indices) {
      data(i) = Array.fill(cols){value}
    }
    data
  }

}
