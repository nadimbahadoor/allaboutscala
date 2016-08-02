package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Typed Function
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-typed-function/ Tutorial]]
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
object FunctionWhichIsTyped_Tutorial extends App {


  println("Step 1: How to define a function which takes a String parameter")
  def applyDiscount(couponCode: String) {
    println(s"Lookup percentage discount in database for $couponCode")
  }



  println("\nStep 2: How to define a function which takes a parameter of type Double")
  def applyDiscount(percentageDiscount: Double) {
    println(s"$percentageDiscount discount will be applied")
  }



  println("\nStep 3: Calling applyDiscount function with String or Double parameter types")
  applyDiscount("COUPON_1234")
  applyDiscount(10)



  println("\nStep 4: How to define a generic typed function which will specify the type of its parameter")
  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")

      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")
    }
  }



  println("\nStep 5: How to call a function which has typed parameters")
  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)
}
