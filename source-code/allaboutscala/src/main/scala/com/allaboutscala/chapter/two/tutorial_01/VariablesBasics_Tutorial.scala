package com.allaboutscala.chapter.two.tutorial_01

/**
  * Created by nbahadoor on 07/06/2016.
  *
  * Tutorial: Scala Basic Tutorial – How To Declare Variables And Types
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-basic-tutorial-declare-variables-types/ Tutorial]]
  */
object VariablesBasics_Tutorial extends App {

  println("Step 1: Immutable variable")
  val donutsToBuy: Int = 5

//    donutsToBuy = 10 // you will get compile error because donutToBuy is immutable



  println("\nStep 2: Mutable variable")
  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"



  println("\nStep 3: lazy initialization")
  lazy val donutService = "initialize some donut service"



  println("\nStep 4: Scala Types")
  val donutsBought: Int = 5

  val bigNumberOfDonuts: Long = 100000000L

  val smallNumberOfDonuts: Short = 1

  val priceOfDonut: Double = 2.50

  val donutPrice: Float = 2.50f

  val donutStoreName: String = "Allaboutscala Donut Store"

  val donutByte: Byte = 0xa

  val donutFirstLetter: Char = 'D'

  val nothing: Unit = ()




  println("\nStep 5: Declare a variable without initialization")
  var leastFavoriteDonut: String = _

  leastFavoriteDonut = "Plain Donut"

}
