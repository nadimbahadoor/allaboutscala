package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Partial Function Using the PartialFunction Trait
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-partial-function-trait/ Tutorial]]
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
object FunctionWhichIsPartial_Tutorial extends App {

  println("Step 1: Review of Pattern Matching in Scala")
  val donut = "Glazed Donut"
  val tasteLevel = donut match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $donut = $tasteLevel")



  println("\nStep 2: How to define a Partial Function named isVeryTasty")
  val isVeryTasty: PartialFunction[String, String] = {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
  }



  println("\nStep 3: How to call the Partial Function named isVeryTasty")
  println(s"Calling partial function isVeryTasty = ${isVeryTasty("Glazed Donut")}")
  // NOTE: you will get scala.MatchError



  println("\nStep 4: How to define PartialFunction named isTasty and unknownTaste")
  val isTasty: PartialFunction[String, String] = {
    case "Plain Donut" => "Tasty"
  }

  val unknownTaste: PartialFunction[String, String] = {
    case donut @ _ => s"Unknown taste for donut = $donut"
  }



  println("\nStep 5: How to compose PartialFunction using orElse")
  val donutTaste = isVeryTasty orElse isTasty orElse unknownTaste
  println(donutTaste("Glazed Donut"))
  println(donutTaste("Plain Donut"))
  println(donutTaste("Chocolate Donut"))
}
