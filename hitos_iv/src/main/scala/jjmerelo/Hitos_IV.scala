package jjmerelo

import io.circe.parser._

class Hitos_IV  {

  private var _hitos = {}

  class Hitos_IV( hitos_file: String = "hitos.json")  {
    val lines = scala.io.Source.fromFile("hitos.json").mkString
    _hitos = parse(lines )
  }

}


