package com.allaboutscala.chapter.six

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Immutable Map
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-map/ Tutorial]]
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
object ImmutableMap_Tutorial extends App {


  println("Step 1: How to initialize a Map with 3 elements")
  val map1: Map[String, String] = Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of map1 = $map1")



  println("\nStep 2: How to initialize Map using key -> value notation")
  val map2: Map[String, String] = Map("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of map1 = $map2")



  println("\nStep 3: How to access elements by specific key")
  println(s"Element by key VD = ${map2("VD")}")
  println(s"Element by key GD = ${map2("GD")}")



  println("\nStep 4: How to add elements using +")
  val map3: Map[String, String] = map1 + ("KD" -> "Krispy Kreme Donut")
  println(s"Element in map3 = $map3")



  println("\nStep 5: How to add two Maps together using ++")
  val map4: Map[String, String] = map1 ++ map2
  println(s"Elements in map4 = $map4")



  println("\nStep 6: How to remove key and its value from map using -")
  val map5: Map[String, String] = map4 - ("CD")
  println(s"Map without the key CD and its value = $map5")



  println("\nStep 7: How to initialize an empty Map")
  val emptyMap: Map[String,String] = Map.empty[String,String]
  println(s"Empty Map = $emptyMap")
}
