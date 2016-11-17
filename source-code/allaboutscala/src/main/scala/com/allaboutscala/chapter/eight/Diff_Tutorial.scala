package com.allaboutscala.chapter.eight


/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Diff Function
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-diff-function/ Tutorial]]
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
object Diff_Tutorial extends App {

  println("Step 1: How to initialize a Set containing 3 donuts")
  val donutBasket1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donutBasket1 = $donutBasket1")



  println("\nStep 2: How to initialize a Set containing 2 donuts")
  val donutBasket2: Set[String] = Set("Glazed Donut", "Vanilla Donut")
  println(s"Elements of donutBasket2 = $donutBasket2")



  println("\nStep 3: How to find the difference between two Sets using the diff function")
  val diffDonutBasket1From2: Set[String] = donutBasket1 diff donutBasket2
  println(s"Elements of diffDonutBasket1From2 = $diffDonutBasket1From2")



  println("\nStep 4: How to find the difference between two Sets using the diff function")
  val diffDonutBasket2From1: Set[String] = donutBasket2 diff donutBasket1
  println(s"Elements of diff DonutBasket2From1 = $diffDonutBasket2From1")



  println("\nStep 5: How to find the difference between two Sets using the --")
  println(s"Difference between donutBasket1 and donutBasket2 = ${donutBasket1 -- donutBasket2}")
  println(s"Difference between donutBasket2 and donutBasket1 = ${donutBasket2 -- donutBasket1}")
}
