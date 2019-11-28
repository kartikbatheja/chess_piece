package validations

object DataValidation {

  val rowSize = 10
  val colSize = 10
  var board = Array.fill(rowSize, colSize)("+--+")

  def validateInput(str: String): Boolean = {

    var (x,y): (Int,Int) = checkForIntegers(str)

    if((x < 0 || x > colSize-1) || (y < 0 || y > rowSize-1))
      false
    else {
      board(x)(y) = " P  "
      true
    }
  }

  def checkForIntegers(loc: String): (Int, Int) = {
    try {
      var tempX: Int = loc.split(",")(0).toInt
      var tempY: Int = loc.split(",")(1).toInt

      (tempX, tempY)
    }
    catch {
      case x : NumberFormatException => {
        println("Invalid Input. Please enter integers between 1 and chess piece size")
        (-1,-1)
      }
      case x : Exception => {
        println("Invalid Inputs")
        (-1,-1)
      }
    }

  }



  def validateN(x: Int): Boolean = {
    if(x-3 < 0)
      false
    else
      true
  }

  def validateS(x: Int): Boolean = {
    if(x+3 > rowSize-1)
      false
    else
      true
  }

  def validateE(x: Int): Boolean = {
    if(x+3 > colSize-1)
      false
    else
      true
  }

  def validateW(x: Int): Boolean = {
    if(x-3 < 0)
      false
    else
      true
  }

  def validateNE(x: Int, y: Int): Boolean = {
    if(x-2 < 0  || y+2 > colSize-1)
      false
    else
      true
  }

  def validateNW(x: Int, y: Int): Boolean = {
    if(x-2 < 0 || y-2 < 0)
      false
    else
      true
  }

  def validateSE(x: Int, y: Int): Boolean = {
    if(x+2 > rowSize-1 || y+2 > colSize-1)
      false
    else
      true
  }

  def validateSW(x: Int, y: Int): Boolean = {
    if(x+2 > colSize-1  || y-2 < 0 )
      false
    else
      true
  }

}
