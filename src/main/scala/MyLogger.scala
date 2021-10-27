package io.github

import java.io.InvalidClassException
import org.junit.Assert._
import org.junit.Test

object MyLogger {
  def printPrettyLog(message : String) : Unit = {
    if (message.getClass == classOf[String]){
      println("********** " + message + " **********")
    }
    else {
      throw InvalidClassException("Expected type is String but " + message.getClass + "given")
    }
  }

  def returnPrettyLog(message : String) : String = {
    if (message.getClass == classOf[String]){
      return "********** " + message + " **********"
    }
    else {
      throw InvalidClassException("Expected type is String but " + message.getClass + "given")
    }
  }
}
