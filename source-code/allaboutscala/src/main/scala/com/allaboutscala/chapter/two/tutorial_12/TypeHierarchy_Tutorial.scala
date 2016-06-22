package com.allaboutscala.chapter.two.tutorial_12

/**
  * Created by Nadim Bahadoor on 22/06/2016.
  *
  *  Tutorial: Learn The Scala Class And Type Hierarchy
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-tutorial-learn-scala-class-type-hierarchy/ Tutorial]]
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
object TypeHierarchy_Tutorial extends App {


  println("Step 1: Declare a variable of type Any")
  val favoriteDonut: Any = "Glazed Donut"
  println(s"favoriteDonut of type Any = $favoriteDonut")



  println("\nStep 2: Declare a variable of type AnyRef")
  val donutName: AnyRef = "Glazed Donut"
  println(s"donutName of type AnyRef = $donutName")



  println("\nStep 3: Declare a variable of type AnyVal")
  val donutPrice: AnyVal = 2.50
  println(s"donutPrice of type AnyVal = $donutPrice")
  

}
