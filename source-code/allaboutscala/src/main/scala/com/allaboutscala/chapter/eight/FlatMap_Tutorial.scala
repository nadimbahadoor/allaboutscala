package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use FlatMap Function
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-flatmap-function/ Tutorial]]
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
object FlatMap_Tutorial extends App {

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts1: Seq[String] = Seq("Plain Donut", "Strawberry  Donut", "Glazed  Donut")
  println(s"Elements of donuts1 = $donuts1")



  println("\nStep 2: How to initialize another Sequence of donuts")
  val donuts2: Seq[String] = Seq("Vanilla  Donut", "Glazed  Donut")
  println(s"Elements of donuts2 = $donuts2")



  println("\nStep 3: How to create a List of donuts initialized using the two Sequences from Step 1 and Step 2")
  val listDonuts: List[Seq[String]] = List(donuts1, donuts2)
  println(s"Elements of listDonuts = $listDonuts")
  // NOTE: we have a List(List(Plain Donut, Strawberry  Donut, Glazed  Donut), List(Vanilla  Donut, Glazed  Donut))



  println("\nStep 4: How to return a single list of donut using the flatMap function")
  val listDonutsFromFlatMap: List[String] = listDonuts.flatMap(seq => seq)
  println(s"Elements of listDonutsFromFlatMap as a flatMap as a single list = $listDonutsFromFlatMap")
}
