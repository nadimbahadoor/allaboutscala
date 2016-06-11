package com.allaboutscala.chapter.one.tutorial_07


/**
  * Created by nbahadoor on 05/05/2016.
  *
  * Tutorial: IntelliJ Debug Configuration – Debugging Your Scala Application
  *
  * [[http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/intellij-debug-configuration-scala-application/ Tutorial]]
  */
object HelloWorldWithArgumentsDebug extends App {

  Console.println("Hello World With Arguments Scala Application!")


  Console.println("Command line arguments are: ")
  Console.println(args.mkString(", "))

}
