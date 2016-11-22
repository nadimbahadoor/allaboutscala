package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Find Function
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-find-function/ Tutorial]]
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
object Find_Tutorial extends App {

  println("Step 1: Initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to find a particular element in the sequence using the find function")
  val plainDonut: Option[String] = donuts.find(donutName => donutName == "Plain Donut")
  println(s"Find Plain Donut = ${plainDonut.get}")



  println("\nStep 3: How to find element Vanilla Donut which does not exists in the sequence using the find function")
//  val vanillaDonut: String = donuts.find(_ == "Vanilla Donut").get
//  println(s"Find Vanilla Donuts = $vanillaDonut")
  // NOTE: we get an exception Exception in thread "main" java.util.NoSuchElementException: None.get



  println("\nStep 4: How to find element Vanilla Donut using the find function and getOrElse")
  val vanillaDonut2: String = donuts.find(_ == "Vanilla Donut").getOrElse("Vanilla Donut was not found!")
  println(s"Find Vanilla Donuts = $vanillaDonut2")
}
