import Examples._

object Main {

  def main(args: Array[String]): Unit = {

    // explicit passing

    println(check(2)(isEven))          // true

    println(check(4)(smallerThan10))   // true
    println(check(14)(smallerThan10))  // false

    // passing as anonymous function

    println(check(3)(i => i % 2 == 0)) // false

  }

}
