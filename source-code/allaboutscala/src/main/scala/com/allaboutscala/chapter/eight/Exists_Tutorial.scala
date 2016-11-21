package com.allaboutscala.chapter.eight


/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Exists Function
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-exists-function/ Tutorial]]
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
object Exists_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to check if a particular element exists in the sequence using the exists function")
  val doesPlainDonutExists: Boolean = donuts.exists(donutName => donutName == "Plain Donut")
  println(s"Does Plain Donut exists = $doesPlainDonutExists")



  println("\nStep 3: How to declare a predicate value function for the exists function")
  val plainDonutPredicate: (String) => Boolean = (donutName) => donutName == "Plain Donut"
  println(s"Value function plainDonutPredicate = $plainDonutPredicate")



  println("\nStep 4: How to find element Plain Donut using the exists function and passing through the predicate function from Step 3")
  println(s"Does Plain Donut exists = ${donuts.exists(plainDonutPredicate)}")



  println("\nStep 5: How to declare a predicate def function for the exists function")
  def plainDonutPredicateFunction(donutName: String): Boolean = donutName == "Plain Donut"



  println("\nStep 6: How to find element Plain Donut using the exists function and passing through the predicate function from Step 5")
  println(s"Does plain Donut exists = ${donuts.exists(plainDonutPredicateFunction(_))}")
}
