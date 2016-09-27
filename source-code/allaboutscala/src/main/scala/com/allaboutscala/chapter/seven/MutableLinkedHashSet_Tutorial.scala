package com.allaboutscala.chapter.seven

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Mutable LinkedHashSet
  *
  * [[http://allaboutscala.com/tutorials/chapter-7-beginner-tutorial-using-scala-mutable-collection/scala-tutorial-learn-use-mutable-linkedhashset/ Tutorial]]
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
object MutableLinkedHashSet_Tutorial extends App {


  import scala.collection.mutable.LinkedHashSet
  println("\nStep 1: How to initialize a LinkedHashSet with 3 elements")
  val linkedHashSet1: LinkedHashSet[String] = LinkedHashSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of linkedHashSet1 = $linkedHashSet1")



  println("\nStep 2: How to check specific elements in LinkedHashSet")
  println(s"Element Plain Donut = ${linkedHashSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${linkedHashSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${linkedHashSet1("Chocolate Donut")}")



  println("\nStep 3: How to add elements to LinkedHashSet using +=")
  linkedHashSet1 += "Vanilla Donut"
  println(s"Elements of linkedHashSet1 after adding Vanilla Donut element = $linkedHashSet1")



  println("\nStep 4: How to add two LinkedHashSets together using ++=")
  linkedHashSet1 ++= LinkedHashSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of linkedHashSet1 after adding another HashSet = $linkedHashSet1")



  println("\nStep 5: How to remove element from LinkedHashSet using -=")
  linkedHashSet1 -= "Plain Donut"
  println(s"Set without Plain Donut element = $linkedHashSet1")



  println("\nStep 6: How to find the intersection between two LinkedHashSets using &")
  val linkedHashSet2: LinkedHashSet[String] = LinkedHashSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of linkedHashSet1 and linkedHashSet2 = ${linkedHashSet1 & linkedHashSet2}")



  println("\nStep 7: How to find the difference between two LinkedHashSets using &~")
  println(s"Difference of linkedHashSet1 and linkedHashSet2 = ${linkedHashSet1 &~ linkedHashSet2}")



  println("\nStep 8: How to initialize an empty LinkedHashSet")
  val emptyLinkedHashSet: LinkedHashSet[String] = LinkedHashSet.empty[String]
  println(s"Empty LinkedHashSet = $emptyLinkedHashSet")



  println("\nStep 9: How to print elements in order inserted to LinkedHashSet using foreach function")
  val linkedHashSet3: LinkedHashSet[String] = LinkedHashSet.empty[String]
  linkedHashSet3 += "Vanilla Donut"
  linkedHashSet3 += "Glazed Donut"
  linkedHashSet3 += "Plain Donut"
  linkedHashSet3 += "Chocolate Donut"
  linkedHashSet3.foreach(donut => println(s"$donut"))
}
