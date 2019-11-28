package functions

import org.scalatest.FunSuite

class BoardFunctionTest extends FunSuite{

  test("count moves --1") {
    assert(BoardFunction.countMoves("0,0") == 3)
    assert(BoardFunction.countMoves("9,0") == 3)
    assert(BoardFunction.countMoves("0,9") == 3)
    assert(BoardFunction.countMoves("9,9") == 3)
    assert(BoardFunction.countMoves("4,4") == 8)
    assert(BoardFunction.countMoves("2,7") == 6)
    assert(BoardFunction.countMoves("0,5") == 5)
    assert(BoardFunction.countMoves("0,9") == 3)

  }

}
