package com.allaboutscala.chapter.seven

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Mutable HashMap
  *
  * [[http://allaboutscala.com/tutorials/chapter-7-beginner-tutorial-using-scala-mutable-collection/scala-tutorial-learn-use-mutable-hashmap/ Tutorial]]
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
object MutableHashMap_Tutorial extends App {

  import scala.collection.mutable.HashMap
  println("\nStep 1: How to initialize a HashMap with 3 elements")
  val hashMap1: HashMap[String, String] = HashMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of hashMap1 = $hashMap1")


  println("\nStep 2: How to initialize HashMap using key -> value notation")
  val hashMap2: HashMap[String, String] = HashMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of hashMap2 = $hashMap2")


  println("\nStep 3: How to access elements of HashMap by specific key")
  println(s"Element by key VD = ${hashMap2("VD")}")
  println(s"Element by key GD = ${hashMap2("GD")}")


  println("\nStep 4: How to add elements to HashMap using +=")
  hashMap1 += ("KD" -> "Krispy Kreme Donut")
  println(s"Element in hashMap1 = $hashMap1")



  println("\nStep 5: How to add elements from a HashMap to an existing HashMap using ++=")
  hashMap1 ++= hashMap2
  println(s"Elements in hashMap1 = $hashMap1")



  println("\nStep 6: How to remove key and its value from HashMap using -=")
  hashMap1 -= "CD"
  println(s"HashMap without the key CD and its value = $hashMap1")



  println("\nStep 7: How to initialize an empty HashMap")
  val emptyMap: HashMap[String,String] = HashMap.empty[String,String]
  println(s"Empty HashMap = $emptyMap")
}
