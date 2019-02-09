package lectures.part1basics

object Functions extends App{
  def aFunction(a: String, b: Int): String = a + " " + b
  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  //when u need loops use recursion? what the hack

  def aFunctionWithSideEffect(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n-1)
  }

  def aGreetingFunction(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old"
  def aFactorialFunction(n: Int): Int =
    if (n <= 0) 1
    else n * aFactorialFunction(n-1)
  def aFibonacciFunction(n: Int): Int =
    if (n <= 2) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)
  def aTestsIsPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n / 2)
  }

}
