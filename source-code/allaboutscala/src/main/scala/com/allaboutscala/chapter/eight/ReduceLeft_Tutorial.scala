package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use ReduceLeft Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-reduceleft-example/ Tutorial]]
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
object ReduceLeft_Tutorial extends App {

  println("Step 1: How to initialize a sequence of donut prices")
  val donutPrices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Elements of donutPrices = $donutPrices")



  println("\nStep 2: How to find the sum of the elements using reduceLeft function")
  val sum: Double = donutPrices.reduceLeft(_ + _)
  println(s"Sum of elements from donutPrices = $sum")



  println("\nStep 3: How to find the sum of elements using reduceLeft function explicitly")
  val sum1: Double = donutPrices.reduceLeft((a, b) => a + b)
  println(s"Sum of elements from donutPrices by calling reduceLeft function explicitly= $sum1")



  println("\nStep 4: How to find the cheapest donut using reduceLeft function")
  println(s"Cheapest donut price = ${donutPrices.reduceLeft(_ min _)}")



  println("\nStep 5: How to find the most expensive donut using reduceLeft function")
  println(s"Most expensive donut price = ${donutPrices.reduceLeft(_ max _)}")



  println("\nStep 6: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 7: How to concatenate the elements from the sequence using reduceLeft function")
  println(s"Elements of donuts sequence concatenated = ${donuts.reduceLeft((left, right) => left + ", " + right)}")



  println("\nStep 8: How to declare a value function to concatenate donut names")
  val concatDonutNames: (String, String) => String = (left, right) => {
    left + ", " + right
  }
  println(s"Value function concatDonutNames = $concatDonutNames")



  println("\nStep 9: How to pass a function to reduceLeft function")
  println(s"Elements of donuts sequence concatenated by passing function to the reduceLeft function = ${donuts reduceLeft concatDonutNames}")



  println("\nStep 10: How to use reduceLeftOption to avoid exception if the collection is empty ")
  println(s"Using reduceLeftOption will NOT throw any exception = ${Seq.empty[String].reduceLeftOption(_ + ", " + _)}")
}
