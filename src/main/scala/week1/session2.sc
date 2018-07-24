object session2 {
  1 + 2

  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {
    def isGoodEnough(guess: Double, x: Double): Boolean =
      abs(x - guess * guess) / x < 0.001

    def improve(guess: Double, x: Double): Double =
      (guess + x / guess) / 2

    def sqrIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrIter(improve(guess, x), x)

    sqrIter(1.0, x)
  }


  sqrt(2)
  sqrt(4)
  sqrt(1e-6)
  sqrt(1e60)


  val x = 0

  def f(y: Int) = y +1

  val result = {
    val x = f(3);
    x * x
  } + x
}