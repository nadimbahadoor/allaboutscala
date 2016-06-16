package com.allaboutscala.chapter.two.tutorial_08

/**
  * Created by Nadim Bahadoor on 16/06/2016.
  *
  * Tutorial: Learn How To Use While And Do While Loop
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-tutorial-learn-how-to-use-while-and-do-while-loop/ Tutorial]]
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
object WhileLoop_Tutorial extends App {

  println("Step 1: How to use while loop in Scala")
  var numberOfDonutsToBake = 10
  while (numberOfDonutsToBake > 0) {
    println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
    numberOfDonutsToBake -= 1
  }



  println("\nStep 2: How to use do while loop in Scala")
  var numberOfDonutsBaked = 0
  do {
    numberOfDonutsBaked += 1
    println(s"Number of donuts baked = $numberOfDonutsBaked")
  } while (numberOfDonutsBaked < 5)



}
