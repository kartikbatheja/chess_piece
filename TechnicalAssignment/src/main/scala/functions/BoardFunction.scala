package functions

import validations.DataValidation._

object BoardFunction {

  def countMoves(loc: String): Int = {
    var currentX: Int = loc.split(",")(0).toInt
    var currentY: Int = loc.split(",")(1).toInt
    var count = 0

    //Validating and Adding the piece to respective positions
    if(validateN(currentX)) {
      val (nX, nY) = (currentX-3, currentY)
      board(nX)(nY) = " N  "
      count+=1
    }

    if(validateS(currentX)) {
      val (sX, sY) = (currentX+3, currentY)
      board(sX)(sY) = " S  "
      count+=1
    }
    if(validateE(currentY)) {
      val (eX, eY) = (currentX, currentY+3)
      board(eX)(eY) = " E  "
      count+=1
    }
    if(validateW(currentY)) {
      val (wX, wY) = (currentX, currentY-3)
      board(wX)(wY) = " W  "
      count+=1
    }
    if(validateNE(currentX, currentY)) {
      val (neX, neY) = (currentX-2, currentY+2)
      board(neX)(neY) = " NE "
      count+=1
    }
    if(validateNW(currentX, currentY)) {
      val (nwX, nwY) = (currentX-2, currentY-2)
      board(nwX)(nwY) = " NW "
      count+=1
    }
    if(validateSE(currentX, currentY)) {
      val (seX, seY) = (currentX+2, currentY+2)
      board(seX)(seY) = " SE "
      count+=1
    }
    if(validateSW(currentX, currentY)) {
      val (swX, swY) = (currentX+2, currentY-2)
      board(swX)(swY) = " SW "
      count+=1
    }

    drawBoard()
    count
  }

  //Printing the board 10X10
  private def drawBoard() {

    board foreach { r =>
      r foreach print;
      println
    }

  }

}
