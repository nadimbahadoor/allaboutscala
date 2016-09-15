package com.allaboutscala.chapter.seven

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Mutable ListMap
  *
  * [[http://allaboutscala.com/tutorials/chapter-7-beginner-tutorial-using-scala-mutable-collection/scala-tutorial-learn-use-mutable-listmap/ Tutorial]]
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
object MutableListMap_Tutorial extends App {

  import scala.collection.mutable.ListMap
  println("\nStep 1: How to initialize a ListMap with 3 elements")
  val listMap1: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "SD" ->"Strawberry Donut", "CD" -> "Chocolate Donut")
  println(s"Elements of listMap1 = $listMap1")



  println("\nStep 2: How to initialize ListMap using key -> value notation")
  val listMap2: ListMap[String, String] = ListMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of listMap1 = $listMap2")



  println("\nStep 3: How to access elements of ListMap by specific key")
  println(s"Element by key VD = ${listMap2("VD")}")
  println(s"Element by key GD = ${listMap2("GD")}")



  println("\nStep 4: How to add elements to ListMap using +=")
  listMap1 += ("KD" -> "Krispy Kreme Donut")
  println(s"Element of listMap1 = ${listMap1}")



  println("\nStep 5: How to add elements from a ListMap to an existing ListMap using ++=")
  listMap1 ++= listMap2
  println(s"Element of listMap1 = ${listMap1}")



  println("\nStep 6: How to remove key and its value from ListMap using -=")
  listMap1 -= ("CD")
  println(s"ListMap without the key CD and its value = $listMap1")



  println("\nStep 7: How to initialize an empty ListMap")
  val emptyListMap: ListMap[String, String] = ListMap.empty[String,String]
  println(s"Empty ListMap of type String = $emptyListMap")
}
