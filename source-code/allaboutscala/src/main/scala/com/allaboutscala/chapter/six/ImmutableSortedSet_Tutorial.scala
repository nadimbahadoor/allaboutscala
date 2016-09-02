package com.allaboutscala.chapter.six

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Immutable SortedSet
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-sortedset/ Tutorial]]
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
object ImmutableSortedSet_Tutorial extends App {

  import scala.collection.immutable.SortedSet
  println("Step 1: How to initialize a SortedSet with 3 elements")
  val sortedSet1: SortedSet[String] = SortedSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of sortedSet1 = $sortedSet1")



  println("\nStep 2: How to check specific elements in SortedSet")
  println(s"Element Plain Donut = ${sortedSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${sortedSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${sortedSet1("Chocolate Donut")}")



  println("\nStep 3: How to add elements to SortedSet using +")
  val sortedSet2: SortedSet[String] = sortedSet1 + "Vanilla Donut" + "Vanilla Donut"
  println(s"Adding elements to SortedSet using + = $sortedSet2")
  // NOTE: we only have one Vanilla Donut element and not two as SortedSet is distinct



  println("\nStep 4: How to add two SortedSets together using ++")
  val sortedSet3: SortedSet[String] = sortedSet1 ++ SortedSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two SortedSets together using ++ = $sortedSet3")


  println("\nStep 5: How to remove element in SortedSet using -")
  val sortedSet4: SortedSet[String] = sortedSet1 - "Plain Donut"
  println(s"SortedSet without Plain Donut element = $sortedSet4")



  println("\nStep 6: How to find the intersection between two SortedSets using &")
  val sortedSet5: SortedSet[String] = SortedSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of sortedSet1 and sortedSet5 = ${sortedSet1 & sortedSet5}")



  println("\nStep 7: How to find the difference between two SortedSets using &~")
  println(s"Difference of sortedSet1 and sortedSet5 = ${sortedSet1 &~ sortedSet5}")



  println("\nStep 8: How to change ordering of SortedSet to descending alphabet")
  object AlphabetOrdering extends Ordering[String] {
    def compare(element1:String, element2:String) = element2.compareTo(element1)
  }
  val sortedSet6: SortedSet[String] = SortedSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(AlphabetOrdering)
  println(s"Elements of sortedSet6 = $sortedSet6")
  // NOTE: The elements are now printed in descending order first with Strawberry Donut, then Plain Donut and finally Chocolate Donut



  println("\nStep 9: How to initialize an empty SortedSet")
  val emptySortedSet: SortedSet[String] = SortedSet.empty[String]
  println(s"Empty SortedSet = $emptySortedSet")
}
