package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Tail Recursive Function - @annotation.tailrec
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-tail-recursive-function-tailrec-annotation/ Tutorial]]
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
object FunctionRecursive_Tutorial extends App {

  println("Step 1: How to define an Array of type String")
  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")



  println("\nStep 2: How to define a tail recursive function")
  @annotation.tailrec
  def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
    if(donuts.length == index) {
      None
    } else if(donuts(index) == donutName) {
      Some(true)
    } else {
      val nextIndex = index + 1
      search(donutName, donuts, nextIndex)
    }
  }



  println("\nStep 3: How to call a tail recursive function")
  val found = search("Glazed Donut", arrayDonuts, 0)
  println(s"Find Glazed Donut = $found")

  val notFound = search("Chocolate Donut", arrayDonuts, 0)
  println(s"Find Chocolate Donut = $notFound")
}
