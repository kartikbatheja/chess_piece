import validations.DataValidation
import functions.BoardFunction

object PieceChecker {

  def main(args: Array[String]): Unit = {

    // currentLoc is the input provided by the user.
    val currentLoc = "0,0"

    // isValidInput is a boolean variable which checks the input for integers within the range.
    var isValidInput = DataValidation.validateInput(currentLoc)

    if(isValidInput)
      println("Number of tour a piece could make from that location : "+ BoardFunction.countMoves(currentLoc))
    else
      println("Piece's location out of range or Invalid input")

  }
}
