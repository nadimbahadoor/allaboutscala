package com.allaboutscala.chapter.six

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Immutable Vector
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-vector/ Tutorial]]
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
object ImmutableVector_Tutorial extends App {


  println("Step 1: How to initialize a Vector with 3 elements")
  val vector1: Vector[String] = Vector("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of vector1 = $vector1")



  println("\nStep 2: How to access elements of Vector at specific index")
  println(s"Element at index 0 = ${vector1(0)}")
  println(s"Element at index 1 = ${vector1(1)}")
  println(s"Element at index 2 = ${vector1(2)}")



  println("\nStep 3: How to append elements at the end of Vector using :+")
  val vector2 = vector1 :+ "Vanilla Donut"
  println(s"Adding elements to Vector using :+ = $vector2")



  println("\nStep 4: How to prepend elements in front of Vector using +:")
  val vector3 = "Vanilla Donut" +: vector1
  println(s"Adding elements to Vector using :+ = $vector3")



  println("\nStep 5: How to add two Vectors together using ++")
  val vector4 = vector1 ++ Vector[String]("Glazed Donut")
  println(s"Add two vectors together using ++ = $vector3")
  // NOTE: this return a new Vector(...), elements from the second vector)



  println("\nStep 6: How to initialize an empty Vector")
  val emptyVector: Vector[String] = Vector.empty[String]
  println(s"Empty vector of type String = $emptyVector")
}
