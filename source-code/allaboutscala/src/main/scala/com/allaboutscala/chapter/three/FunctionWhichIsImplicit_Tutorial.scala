package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Implicit Function
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-implicit-function/ Tutorial]]
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
object FunctionWhichIsImplicit_Tutorial extends App {


  println("Step 1: How to create a wrapper String class which will extend the String type")
  class DonutString(s: String) {

    def isFavoriteDonut: Boolean = s == "Glazed Donut"

  }



  println("\nStep 2: How to create an implicit function to convert a String to the wrapper String class")
  object DonutConverstions {
    implicit def stringToDonutString(s: String) = new DonutString(s)
  }



  println("\nStep 3: How to import the String conversion so that it is in scope")
  import DonutConverstions._



  println("\nStep 4: How to create String values")
  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"



  println("\nStep 5: How to access the custom String function called isFavaoriteDonut")
  println(s"Is Glazed Donut my favorite Donut  = ${glazedDonut.isFavoriteDonut}")
  println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")
}
