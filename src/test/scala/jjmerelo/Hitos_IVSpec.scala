package jjmerelo

import org.scalatest._

class Hitos_IVSpec extends FlatSpec with Matchers {
  "El objeto Hitos" should "devolver los hitos" in {
    var hitos_iv = new Hitos_IV
    hitos_iv.hitos should not equal {}
  }
}
