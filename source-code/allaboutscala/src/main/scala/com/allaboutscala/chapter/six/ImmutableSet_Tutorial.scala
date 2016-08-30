package com.allaboutscala.chapter.six

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Immutable Set
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-set/ Tutorial]]
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
object ImmutableSet_Tutorial extends App {

  println("Step 1: How to initialize a Set with 3 elements")
  val set1: Set[String] = Set("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of set1 = $set1")



  println("\nStep 2: How to check specific elements exists in Set")
  println(s"Element Plain Donut = ${set1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${set1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${set1("Chocolate Donut")}")



  println("\nStep 3: How to add elements in Set using +")
  val set2: Set[String] = set1 + "Vanilla Donut" + "Vanilla Donut"
  println(s"Adding elements to Set using + = $set2")



  println("\nStep 4: How to add two Sets together using ++")
  val set3: Set[String] = set1 ++ Set[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two Sets together using ++ = $set3")



  println("\nStep 5: How to remove element from Set using -")
  val set4: Set[String] = set1 - "Plain Donut"
  println(s"Set without Plain Donut element = $set4")



  println("\nStep 6: How to find the intersection between two Sets using &")
  val set5: Set[String] = Set("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of set1 and set5 = ${set1 & set5}")



  println("\nStep 7: How to find the difference between two Sets using &~")
  println(s"Difference between set1 and set5 = ${set1 &~ set5}")



  println("\nStep 8: How to initialize an empty Set")
  val emptySet: Set[String] = Set.empty[String]
  println(s"Empty Set = $emptySet")
}
