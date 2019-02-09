package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  //val are immutable
  val y = 42
  println(y)
  // type for val are optional
  val aString: String = "hello"; val anotherString = "string"
  //semi colon requires for expression in 1 line
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 128
  val aLong: Long = 4444444444444444444L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables bottom
  var aVariable: Int = 4 //can be reassigned
  aVariable = 5 // side effect
}
