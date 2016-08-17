package com.allaboutscala.chapter.three

import scala.util.Random

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Function Using The Val Keyword Instead Of Def
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-val-function-val-vs-def/ Tutorial]]
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
object FunctionAsValues_Tutorial extends App {

  println("\nStep 1: How to define a higher order function which takes another function as parameter")
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }



  println("\nStep 2: How to define and pass a def function to a higher order function")
  def applyDiscount(totalCost: Double): Double = {
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount def function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")



  println("\nStep 3: How to define and pass a val function to a higher order function")
  val applyDiscountValueFunction = (totalCost: Double) => {
//  val applyDiscountValueFunction: Double => Double = totalCost => { // val function syntax with return type
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount val function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscountValueFunction)}")
}
