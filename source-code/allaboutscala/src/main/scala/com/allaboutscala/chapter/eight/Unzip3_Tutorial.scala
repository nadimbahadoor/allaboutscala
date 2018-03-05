package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Unzip3 Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-unzip3-example/ Tutorial]]
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
object Unzip3_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of Tuple3 elements")
  val donuts: Seq[(String, Double, String)] = Seq(("Plain Donut",1.5,"Tasty"), ("Glazed Donut",2.0,"Very Tasty"), ("Strawberry Donut",2.5,"Very Tasty"))
  println(s"Donuts tuple3 elements = $donuts")


  println("\nStep 2: How to call unzip3 function to unzip Tuple3 elements")
  val unzipped: (Seq[String], Seq[Double], Seq[String]) = donuts.unzip3
  println(s"Unzipped donut names = ${unzipped._1}")
  println(s"Unzipped donut prices = ${unzipped._2}")
  println(s"Unzipped donut taste = ${unzipped._3}")
}
