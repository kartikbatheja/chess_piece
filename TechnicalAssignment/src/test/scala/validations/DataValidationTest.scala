package validations

import org.scalatest.FunSuite

class DataValidationTest extends FunSuite{

  test("Boundry Test -- 1") {
    val currX = 0
    val currY = 0
    assert(DataValidation.validateN(currX).equals(false))
    assert(DataValidation.validateS(currX).equals(true))
    assert(DataValidation.validateE(currY).equals(true))
    assert(DataValidation.validateW(currY).equals(false))
    assert(DataValidation.validateNE(currX,currY).equals(false))
    assert(DataValidation.validateNW(currX,currY).equals(false))
    assert(DataValidation.validateSE(currX,currY).equals(true))
    assert(DataValidation.validateSW(currX,currY).equals(false))
  }

  test("Boundry Test -- 2") {
    val currX = 0
    val currY = 9
    assert(DataValidation.validateN(currX).equals(false))
    assert(DataValidation.validateS(currX).equals(true))
    assert(DataValidation.validateE(currY).equals(false))
    assert(DataValidation.validateW(currY).equals(true))
    assert(DataValidation.validateNE(currX,currY).equals(false))
    assert(DataValidation.validateNW(currX,currY).equals(false))
    assert(DataValidation.validateSE(currX,currY).equals(false))
    assert(DataValidation.validateSW(currX,currY).equals(true))
  }

  test("Boundry Test -- 3") {
    val currX = 9
    val currY = 0
    assert(DataValidation.validateN(currX).equals(true))
    assert(DataValidation.validateS(currX).equals(false))
    assert(DataValidation.validateE(currY).equals(true))
    assert(DataValidation.validateW(currY).equals(false))
    assert(DataValidation.validateNE(currX,currY).equals(true))
    assert(DataValidation.validateNW(currX,currY).equals(false))
    assert(DataValidation.validateSE(currX,currY).equals(false))
    assert(DataValidation.validateSW(currX,currY).equals(false))
  }

  test("Boundry Test -- 4") {
    val currX = 9
    val currY = 9
    assert(DataValidation.validateN(currX).equals(true))
    assert(DataValidation.validateS(currX).equals(false))
    assert(DataValidation.validateE(currY).equals(false))
    assert(DataValidation.validateW(currY).equals(true))
    assert(DataValidation.validateNE(currX,currY).equals(false))
    assert(DataValidation.validateNW(currX,currY).equals(true))
    assert(DataValidation.validateSE(currX,currY).equals(false))
    assert(DataValidation.validateSW(currX,currY).equals(false))
  }

  test("Boundry Test -- 5") {
    val currX = 0
    val currY = 4
    assert(DataValidation.validateN(currX).equals(false))
    assert(DataValidation.validateS(currX).equals(true))
    assert(DataValidation.validateE(currY).equals(true))
    assert(DataValidation.validateW(currY).equals(true))
    assert(DataValidation.validateNE(currX,currY).equals(false))
    assert(DataValidation.validateNW(currX,currY).equals(false))
    assert(DataValidation.validateSE(currX,currY).equals(true))
    assert(DataValidation.validateSW(currX,currY).equals(true))
  }

  test("Boundry Test -- 6") {
    val currX = 4
    val currY = 9
    assert(DataValidation.validateN(currX).equals(true))
    assert(DataValidation.validateS(currX).equals(true))
    assert(DataValidation.validateE(currY).equals(false))
    assert(DataValidation.validateW(currY).equals(true))
    assert(DataValidation.validateNE(currX,currY).equals(false))
    assert(DataValidation.validateNW(currX,currY).equals(true))
    assert(DataValidation.validateSE(currX,currY).equals(false))
    assert(DataValidation.validateSW(currX,currY).equals(true))
  }

  test("Boundry Test -- 7") {
    val currX = 9
    val currY = 4
    assert(DataValidation.validateN(currX).equals(true))
    assert(DataValidation.validateS(currX).equals(false))
    assert(DataValidation.validateE(currY).equals(true))
    assert(DataValidation.validateW(currY).equals(true))
    assert(DataValidation.validateNE(currX,currY).equals(true))
    assert(DataValidation.validateNW(currX,currY).equals(true))
    assert(DataValidation.validateSE(currX,currY).equals(false))
    assert(DataValidation.validateSW(currX,currY).equals(false))
  }

  test("Boundry Test -- 8") {
    val currX = 4
    val currY = 0
    assert(DataValidation.validateN(currX).equals(true))
    assert(DataValidation.validateS(currX).equals(true))
    assert(DataValidation.validateE(currY).equals(true))
    assert(DataValidation.validateW(currY).equals(false))
    assert(DataValidation.validateNE(currX,currY).equals(true))
    assert(DataValidation.validateNW(currX,currY).equals(false))
    assert(DataValidation.validateSE(currX,currY).equals(true))
    assert(DataValidation.validateSW(currX,currY).equals(false))
  }

  test("checkForIntegers -- 1") {
    val currLoc = "0,0"
    assert(DataValidation.checkForIntegers(currLoc)._1 == 0)
    assert(DataValidation.checkForIntegers(currLoc)._2 == 0)
    assert(DataValidation.validateInput(currLoc).equals(true))
  }

  test("checkForIntegers -- 2") {
    val currLoc = "5,7"
    assert(DataValidation.checkForIntegers(currLoc)._1 == 5)
    assert(DataValidation.checkForIntegers(currLoc)._2 == 7)
    assert(DataValidation.validateInput(currLoc).equals(true))
  }

  test("checkForIntegers -- 3") {
    val currLoc = "a,0"
    assert(DataValidation.checkForIntegers(currLoc)._1 == -1)
    assert(DataValidation.checkForIntegers(currLoc)._2 == -1)
    assert(DataValidation.validateInput(currLoc).equals(false))
  }

  test("checkForIntegers -- 4") {
    val currLoc = "0,b"
    assert(DataValidation.checkForIntegers(currLoc)._1 == -1)
    assert(DataValidation.checkForIntegers(currLoc)._2 == -1)
    assert(DataValidation.validateInput(currLoc).equals(false))
  }


}
