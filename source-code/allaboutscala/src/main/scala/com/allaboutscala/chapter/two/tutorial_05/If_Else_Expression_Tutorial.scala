package com.allaboutscala.chapter.two.tutorial_05

/**
  * Created by nbahadoor on 13/06/2016.
  *
  * Tutorial: How To Use If Else Statement And Expression
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-tutorial-use-if-else-statement-expression/ Tutorial]]
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
object If_Else_Expression_Tutorial extends App {

  println("Step 1: Using if clause as a statement")
  val numberOfPeople = 20
  val donutsPerPerson = 2

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")



  println(s"\nStep 2: Using if and else clause as a statement")
  val defaultDonutsToBuy = 8

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = $defaultDonutsToBuy")



  println("\nStep 3: Using if, else if, and else clause as a statement")
  if(numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }



  println("\nStep 4: Using if and else clause as expression")
  val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")

}
