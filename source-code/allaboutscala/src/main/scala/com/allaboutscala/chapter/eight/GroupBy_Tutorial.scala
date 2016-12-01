package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use GroupBy Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-groupby-example/ Tutorial]]
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
object GroupBy_Tutorial extends App {

  println("\nStep 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to group elements in a sequence using the groupBy function")
  val donutsGroup: Map[Char, Seq[String]] = donuts.groupBy(_.charAt(0))
  println(s"Group elements in the donut sequence by the first letter of the donut name = $donutsGroup")



  println("\nStep 3: How to create a case class to represent Donut objects")
  case class Donut(name: String, price: Double)



  println("\nStep 4: How to create a Sequence of type Donut")
  val donuts2: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts2 = $donuts2")



  println(s"\nStep 5: How to group case classes donut objects by the name property")
  val donutsGroup2: Map[String, Seq[Donut]] = donuts2.groupBy(_.name)
  println(s"Group element in the sequence of type Donut grouped by the donut name = $donutsGroup2")
}
