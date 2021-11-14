import org.scalatest.flatspec._
import org.scalatest.matchers._

class CircleTest extends AnyFlatSpec with should.Matchers {

 def victim() = new CircleRound

  "CircleRound" should "calculate area for given Circle data" in {
     val rd = CircleSquare(2)

     victim().RoundC(rd) should be (12.56)
 }

  it should "return zero if Round is zero" in {
    val rd = CircleSquare(0)

    victim().RoundC(rd) should be (0)
  }

}
