object InterestCalculator extends App {
  
  // Define lambda functions for interest calculation
  val interest1: Double => Double = deposit => deposit * 0.02
  val interest2: Double => Double = deposit => deposit * 0.04
  val interest3: Double => Double = deposit => deposit * 0.035
  val interest4: Double => Double = deposit => deposit * 0.065

  // Function to calculate interest based on deposit amount
  def calculateInterest(deposit: Double): Double = {
    deposit match {
      case d if d <= 20000     => interest1(d)
      case d if d <= 200000    => interest2(d)
      case d if d <= 2000000   => interest3(d)
      case d if d > 2000000    => interest4(d)
    }
  }

  // Example usage
  val depositAmount = 2500000.0
  val interest = calculateInterest(depositAmount)
  println(s"Interest for a deposit of Rs. $depositAmount is Rs. $interest")
}
