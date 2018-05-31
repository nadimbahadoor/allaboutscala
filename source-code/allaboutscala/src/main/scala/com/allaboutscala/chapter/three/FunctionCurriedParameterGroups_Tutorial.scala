package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Function Currying With Parameter Groups
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-create-function-currying-parameter-groups/ Tutorial]]
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
object FunctionCurriedParameterGroups_Tutorial extends App {

  println("Step 1: How to define function with curried parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }



  println("\nStep 2: How to call a function with curried parameter groups")
  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")



  println("\nStep 3: How to create a partially applied function from a function with curried parameter groups")
  val totalCostForGlazedDonuts = totalCost("Glazed Donut") _



  println("\nStep 4: How to call a partially applied function")
  println(s"Total cost for Glazed Donuts ${totalCostForGlazedDonuts(10)(0.1)}")
}
