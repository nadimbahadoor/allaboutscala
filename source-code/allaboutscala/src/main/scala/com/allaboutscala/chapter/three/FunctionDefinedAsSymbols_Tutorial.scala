package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Functions As Symbols
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-functions-symbols/ Tutorial]]
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
object FunctionDefinedAsSymbols_Tutorial extends App {


  println("Step 1: How to create and instantiate a class")
  val donutCostCalculator = new DonutCostCalculator()



  println("\nStep 2: How to call a function from an instantiated class")
  println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")



  println("\nStep 4: How to call function whose name is just the symbol -")
  println(s"Calling function - = ${donutCostCalculator.-(10.5)}")



  println("\nStep 5: How to call a function using the operator style notation")
  println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")
}

class DonutCostCalculator {

  // We are hard-coding the totalCost value for simplicity.
  val totalCost = 100

  def minusDiscount(discount: Double): Double = {
    totalCost - discount
  }


  // Step 3: How to define function whose name is just the symbol minus -
  def -(discount: Double): Double = {
    totalCost - discount
  }


  // Step 6: How to define function whose name is just the symbol +++
  def +++(taxAmount: Double): Double = {
    totalCost + taxAmount
  }
}
