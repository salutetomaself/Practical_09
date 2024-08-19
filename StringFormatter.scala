object StringFormatter {

  // Method to convert a string to upper case
  def toUpper(str: String): String = str.toUpperCase

  // Method to convert a string to lower case
  def toLower(str: String): String = str.toLowerCase

  // Method to format a name using a provided formatting function
  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    // Test inputs
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    // Applying the formatting
    println(formatNames(name1)(toUpper)) // Output: BENNY
    println(formatNames(name2)(name => {
      val upperPart = name.substring(0, 2).toUpperCase
      val lowerPart = name.substring(2).toLowerCase
      upperPart + lowerPart
    })) // Output: NIroshan
    println(formatNames(name3)(toLower)) // Output: saman
    println(formatNames(name4)(name => {
      val lowerPart = name.substring(0, 1).toLowerCase
      val upperPart = name.substring(1, 5).toUpperCase
      lowerPart + upperPart + name.substring(5).toLowerCase
    })) // Output: KumarA
  }
}
