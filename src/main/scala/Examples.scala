object Examples {

  /**
   * Method that accepts an integer value and another method that
   * executes a check onto that integer.
   *
   * @param i The provided integer value.
   * @param f The provided function that executes a check.
   * @return `true` if the check was successful, `false` otherwise.
   */
  def check(i: Int)(f: Int => Boolean): Boolean = f(i)

  /**
   * Method that checks if the provided integer value is even.
   *
   * @param i Provided integer value.
   * @return `true` if the value is even, `false` otherwise.
   */
  def isEven(i: Int): Boolean = i % 2 == 0

  /**
   * Method that checks if the  provided integer value is
   * smaller than 10.
   *
   * @param i Provided integer value to check.
   * @return `true` if it is smaller, `false` otherwise.
   */
  def smallerThan10(i: Int): Boolean = i < 10

}
