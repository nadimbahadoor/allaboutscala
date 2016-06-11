package com.allaboutscala.chapter.one.tutorial_06

/**
  * Created by nbahadoor on 03/05/2016.
  *
  * Tutorial: IntelliJ Run Configuration – Running Your Scala application
  *
  * [[http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/intellij-run-configuration-scala-application/ Tutorial]]
  */
object HelloWorldWithArguments extends App {


  println("Hello World With Arguments Scala Application!")


  println("Command line arguments are: ")
  println(args.mkString(", "))


}
