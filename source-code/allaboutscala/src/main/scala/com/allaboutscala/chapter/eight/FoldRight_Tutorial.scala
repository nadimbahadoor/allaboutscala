package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use FoldRight Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-foldright-example/ Tutorial]]
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
object FoldRight_Tutorial extends App {

  println("Step 1: How to initialize a sequence of donut prices")
  val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Donut prices = $prices")



  println("\nStep 2: How to sum all the donut prices using foldRight function")
  val sum = prices.foldRight(0.0)(_ + _)
  println(s"Sum = $sum")



  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts")



  println("\nStep 4: How to create a String of all donuts using foldRight function")
  println(s"All donuts = ${donuts.foldRight("")((a, b) => a + " Donut " + b)}")



  println("\nStep 5: How to declare a value function to create the donut string")
  val concatDonuts: (String, String) => String = (a, b) => a + " Donut " + b
  println(s"Value function concatDonuts = $concatDonuts")



  println("\nStep 6: How to create a String of all donuts using value function from Step 5 and foldRight function")
  println(s"All donuts = ${donuts.foldRight("")(concatDonuts)}")
}
