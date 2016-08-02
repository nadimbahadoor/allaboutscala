package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Variable Argument Function
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-variable-argument-function/ Tutorial]]
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
object FunctionWithVariableArguments_Tutorial extends App {

  println("Step 1: How to define function which takes variable number of arguments")
  def printReport(names: String*) {
    println(s"""Donut Report = ${names.mkString(", ")}""")
  }



  println("\nStep 2: How to call function which takes variable number of String arguments")
  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport("Chocolate Donut")



  println("\nStep 3: How to pass a List to a function with variable number of arguments")
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(listDonuts: _*)



  println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
  printReport(seqDonuts: _*)



  println("\nStep 5: How to pass an Array to a function with variable number of arguments")
  val arrDonuts: Array[String] = Array("Coconut Donut")
  printReport(arrDonuts: _*)
}
