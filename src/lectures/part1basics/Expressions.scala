package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // expression
  println(x)

  println(2 + 3 * 4) // not expression + - * / & | ^ << >> >>> (right shift with zero extension)

  println(x == 1) // == != > >= < <=

  println(!(1 == x)) // ! && ||

  var aVariable = 2
  aVariable += 3 // -= += /= *=
  println(aVariable)

  // instructions(do) versus expressions
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // never write this again

  val aWeirdValue = (aVariable = 3) // type unit === void - while println reassigning return it

  //code blocks  , all val is block scoped and it is expressions
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  val someValue = {
    2 < 3
  }

  val anotherValue = {
    if (someValue) 239 else 986
    42
  }
}
