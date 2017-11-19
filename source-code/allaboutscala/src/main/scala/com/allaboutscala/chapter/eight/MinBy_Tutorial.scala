package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use MinBy Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-minby-example/ Tutorial]]
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
object MinBy_Tutorial extends App {

  println("Step 1: How to create case class to represent Donut object")
  case class Donut(name: String, price: Double)



  println("\nStep 2: How to create a Sequence of type Donut")
  val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts = $donuts")



  println("\nStep 3: How to find the minimum element in a sequence of case classes using the minBy function")
  println(s"Minimum element in sequence of case class of type Donut, ordered by price = ${donuts.minBy(donut => donut.price)}")



  println("\nStep 4: How to declare a value predicate function for minBy function")
  val donutsMinBy: (Donut) => Double = (donut) => donut.price
  println(s"Value function donutMinBy = $donutsMinBy")



  println("\nStep 5: How to find the minimum element using minBy function and passing through the predicate function from Step 4")
  println(s"Minimum element in sequence using function from Step 3 = ${donuts.minBy(donutsMinBy)}")
}
