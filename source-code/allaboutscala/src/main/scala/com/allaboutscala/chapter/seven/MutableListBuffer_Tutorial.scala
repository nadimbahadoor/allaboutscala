package com.allaboutscala.chapter.seven

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Mutable ListBuffer
  *
  * [[http://allaboutscala.com/tutorials/chapter-7-beginner-tutorial-using-scala-mutable-collection/scala-tutorial-learn-use-mutable-listbuffer/ Tutorial]]
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
object MutableListBuffer_Tutorial extends App {

  import scala.collection.mutable.ListBuffer
  println("Step 1: How to initialize a ListBuffer with 3 elements")
  val listBuffer1: ListBuffer[String] = ListBuffer("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 2: How to access elements at specific index in a ListBuffer")
  println(s"Element at index 0 = ${listBuffer1(0)}")
  println(s"Element at index 1 = ${listBuffer1(1)}")
  println(s"Element at index 2 = ${listBuffer1(2)}")



  println("\nStep 3: How to add elements to a ListBuffer using +=")
  listBuffer1 += "Vanilla Donut"
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 4: How to add elements from a List to a ListBuffer using ++=")
  listBuffer1 ++= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 5: How to remove elements from a ListBuffer")
  listBuffer1 -= "Plain Donut"
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 6: How to remove elements from a List to a ListBuffer using --=")
  listBuffer1 --= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 7: How to initialize an empty ListBuffer")
  val emptyListBuffer: ListBuffer[String] = ListBuffer.empty[String]
  println(s"Empty list buffer = $emptyListBuffer")
}
