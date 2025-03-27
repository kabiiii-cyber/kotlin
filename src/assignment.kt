import java.util.*

fun main() {
    var read = Scanner(System.`in`)
    println("Enter a number :")
    var number = read.nextInt()


    var num2 = 50
  if (number > num2){
      println("$number is greater than num2")

  }
  else if (number < num2){
      println("$num2 is greater than $number")
  }
  else {
      println("$number and $num2 are equal")
  }

}