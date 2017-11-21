package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use NonEmpty Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-nonempty-example/ Tutorial]]
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
object NonEmpty_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to check if a sequence is not empty using nonEmpty function")
  println(s"Is donuts sequence NOT empty = ${donuts.nonEmpty}")



  println("\nStep 3: How to create an empty sequence")
  val emptyDonuts: Seq[String] = Seq.empty[String]
  println(s"Elements of emptyDonuts = $emptyDonuts")



  println("\nStep 4: How to find out if sequence is empty using nonEmpty function")
  println(s"Is emptyDonuts sequence empty = ${emptyDonuts.nonEmpty}")
}
