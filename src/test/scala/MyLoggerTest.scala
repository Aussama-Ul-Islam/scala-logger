import org.junit.Assert.assertEquals
import org.junit.Test

class MyLoggerTest {
  @Test
  def test1() : Unit ={
    var expected : String = "********** Message **********"
    var actual : String = MyLogger().returnPrettyLog("Message")
    assertEquals(expected, actual)
  }
}
