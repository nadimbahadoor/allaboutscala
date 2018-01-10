package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use ScanRight Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-scanright-example/ Tutorial]]
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
object ScanRight_Tutorial extends App {

  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")



  println("\nStep 2: How to create a running total using the scanRight function")
  val runningTotal: Seq[Int] = numbers.scanRight(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")
  // NOTE: scanRight method iterations
  // 5 + 4 + 3 + 2 + 1   = 15
  // 5 + 4 + 3 + 2       = 14
  // 5 + 4 + 3           = 12
  // 5 + 4               = 9
  // 5 + 0               = 5
  // 0                   = 0



  println("\nStep 3: How to create a running total using the scanRight function explicitly")
  val runningTotal2: Seq[Int] = numbers.scanRight(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")
  // NOTE: scanRight method iterations
  // 5 + 4 + 3 + 2 + 1   = 15
  // 5 + 4 + 3 + 2       = 14
  // 5 + 4 + 3           = 12
  // 5 + 4               = 9
  // 5 + 0               = 5
  // 0                   = 0
}
