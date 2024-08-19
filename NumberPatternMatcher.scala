import scala.io.StdIn.readLine

object NumberPatternMatcher {

  // Lambda functions to print the results
  val negativeOrZero: () => Unit = () => println("Negative/Zero is input")
  val evenNumber: () => Unit = () => println("Even number is given")
  val oddNumber: () => Unit = () => println("Odd number is given")

  // Function to match input and print appropriate message
  def matchNumber(input: Int): Unit = {
    input match {
      case x if x <= 0 => negativeOrZero()
      case x if x % 2 == 0 => evenNumber()
      case _ => oddNumber()
    }
  }

  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")

    // Read the input from the user
    val input = readLine()

    // Try to parse the input as an integer
    try {
      val inputNumber = input.toInt
      matchNumber(inputNumber)
    } catch {
      case _: NumberFormatException => println("Please provide a valid integer.")
    }
  }
}
