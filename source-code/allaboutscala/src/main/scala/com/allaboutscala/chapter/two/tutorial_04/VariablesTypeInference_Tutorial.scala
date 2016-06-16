package com.allaboutscala.chapter.two.tutorial_04

/**
  * Created by Nadim Bahadoor on 10/06/2016.
  *
  * Tutorial: An Overview Of Scala Type Inference
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-tutorial-overview-scala-type-inference/ Tutorial]]
  *
  * Copyright 2016 Nadim Bahadoor (http://allaboutscala.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy of
  * the License at
  *
  *  [http://www.apache.org/licenses/LICENSE-2.0]
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations under
  * the License.
  */
object VariablesTypeInference_Tutorial extends App {


  println("Step 1: Immutable variable")
  val donutsToBuy: Int = 5

  val donutsBought = 5



  println("\nStep 2: Scala Types")
  val donutsBoughtToday = 5

  val bigNumberOfDonuts = 100000000L

  val smallNumberOfDonuts = 1

  val priceOfDonut = 2.50

  val donutPrice = 2.50f

  val donutStoreName = "Allaboutscala Donut Store"

  val donutByte = 0xa

  val donutFirstLetter = 'D'

  val nothing = ()



  println("\nStep 3: Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1

  val minimumDonutsToBuy: Int = numberOfDonuts



  println("\nStep 4: User driven conversion from one data type to another ")
  // NB: You cannot convert from an Int to a String
  // val minimumDonutsToSell: String = numberOfDonuts

  val minimumDonutsToSell: String = numberOfDonuts.toString()
}
