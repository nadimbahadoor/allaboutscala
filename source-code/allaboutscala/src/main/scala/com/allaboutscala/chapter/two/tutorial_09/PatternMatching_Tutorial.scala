package com.allaboutscala.chapter.two.tutorial_09

/**
  * Created by Nadim Bahadoor on 17/06/2016.
  *
  *  Tutorial: Learn How To Use Pattern Matching
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-tutorial-learn-how-to-use-pattern-matching/ Tutorial]]
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
object PatternMatching_Tutorial extends App {

  println("Step 1: Pattern matching 101 - a very basic example")
  val donutType = "Glazed Donut"
  donutType match {
    case "Glazed Donut" => println("Very tasty")
    case "Plain Donut"  => println("Tasty")
  }



  println("\nStep 2: Pattern matching and return the result")
  val tasteLevel = donutType match {
    case "Glazed Donut" => "Very tasty"
    case "Plain Donut"  => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel")



  println("\nStep 3: Pattern matching using the wildcard operator")
  val tasteLevel2 = donutType match {
    case "Glazed Donut" => "Very tasty"
    case "Plain Donut"  => "Tasty"
    case _              => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel2")



  println("\nStep 4: Pattern matching with two or more items on the same condition")
  val tasteLevel3 = donutType match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel3")



  println("\nStep 5; Pattern matching and using if expressions in the case clause")
  val tasteLevel4 = donutType match {
    case donut if (donut.contains("Glazed") || donut.contains("Strawberry")) => "Very tasty"
    case "Plain Donut"  => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel4")



  println("\nStep 6: Pattern matching by types")
  val priceOfDonut: Any = 2.50
  val priceType = priceOfDonut match {
    case price: Int     => "Int"
    case price: Double  => "Double"
    case price: Float   => "Float"
    case price: String  => "String"
    case price: Boolean => "Boolean"
    case price: Char    => "Char"
    case price: Long    => "Long"
  }
  println(s"Donut price type = $priceType")

}
