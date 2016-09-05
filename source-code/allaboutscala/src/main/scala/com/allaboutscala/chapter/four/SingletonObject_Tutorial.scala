package com.allaboutscala.chapter.four

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Declare And Use Singleton Object
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-tutorial-learn-declare-use-singleton-objects/ Tutorial]]
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
object SingletonObject_Tutorial extends App {


  // Step 1: How to declare a Singleton Object
  object DonutShoppingCartCalculator {

    // Step 2: How to define a global field
    val discount: Double = 0.01
    // NOTE: In practice you won't assign a hard code value, but just showing how to declare global fields


    // Step 3: How to define utility function called calculateTotalCost
    def calculateTotalCost(donuts: List[String]): Double = {
      // calculate the cost of donuts
      return 1
    }
  }



  println("\nStep 4: How to call global discount field from Step 2")
  println(s"Global discount = ${DonutShoppingCartCalculator.discount}")



  println("\nStep 5: How to call the utility function calculateTotalCost from Step 3")
  println(s"Call to calculateTotalCost function = ${DonutShoppingCartCalculator.calculateTotalCost(List())}")
}
