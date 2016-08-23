package com.allaboutscala.chapter.six

import scala.collection.immutable.ListSet

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Immutable ListSet
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-listset/ Tutorial]]
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
object ImmutableListSet_Tutorial extends App {

  println("Step 1: How to initialize an immutable ListSet with 3 elements")
  val listSet1: ListSet[String] = ListSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of listSet1 = $listSet1")



  println("\nStep 2: How to check elements of immutable ListSet")
  println(s"Element Plain Donut = ${listSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${listSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${listSet1("Chocolate Donut")}")



  println("\nStep 3: How to add elements of immutable ListSet using +")
  val listSet2: ListSet[String] = listSet1 + "Vanilla Donut"
  println(s"Adding element Vanilla to ListSet using + = $listSet2")



  println("\nStep 4: How to add two ListSet together using ++")
  val listSet3: ListSet[String] = listSet1 ++ ListSet("Glazed Donut")
  println(s"Add two lists together using ++ = $listSet3")



  println("\nStep 5: How to remove element from the ListSet using -")
  val listSet4: ListSet[String] = listSet1 - ("Plain Donut")
  println(s"ListSet without the element Plain Donut = $listSet4")



  println("\nStep 6: How to initialize an empty ListSet")
  val emptyListSet: ListSet[String] = ListSet.empty[String]
  println(s"Empty ListSet of type String = $emptyListSet")
}
