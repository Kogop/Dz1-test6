import scala.io.StdIn

object main extends App {

  val circleRound = new CircleRound

  print("Circle Round: ")
  val Round1 = StdIn.readDouble()



  val R = CircleSquare(Round1)

  println(s"Circle Square: ${circleRound.RoundC(R)}")


  println("Press ENTER...")
  StdIn.readLine()
}
