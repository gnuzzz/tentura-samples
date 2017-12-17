package ru.albemuth.tentura.samples

import scala.io.Source

/**
  * @author Vladimir Kornyshev { @literal <vkornyshev@at-consulting.ru>}
  */
object SimpleSample extends App {

  val fileName = "ru/albemuth/tentura/tensor/kernel/Matrix_.ptx"
  val source = Source.fromInputStream(getClass.getClassLoader.getResourceAsStream(fileName)).mkString
  println(source)

}
