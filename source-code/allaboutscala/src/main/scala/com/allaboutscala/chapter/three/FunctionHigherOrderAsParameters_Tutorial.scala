package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Higher Order Function - Function As Parameter
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-higher-order-function-parameter/ Tutorial]]
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
object FunctionHigherOrderAsParameters_Tutorial extends App {

  println("Step 1: Review how to define function with curried parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }



  println("\nStep 2: How to define a higher order function which takes another function as parameter")
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }



  println("\nStep 3: How to call higher order function and pass an anonymous function as parameter")
  val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5){totalCost =>
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with anonymous discount function = $totalCostOf5Donuts")



  println("\nStep 4: How to define and pass a function to a higher order function")
  def applyDiscount(totalCost: Double): Double = {
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")
}
