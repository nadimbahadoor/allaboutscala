package com.allaboutscala.chapter.seven

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Mutable ArrayBuffer
  *
  * [[http://allaboutscala.com/tutorials/chapter-7-beginner-tutorial-using-scala-mutable-collection/scala-tutorial-learn-use-mutable-arraybuffer/ Tutorial]]
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
object MutableArrayBuffer_Tutorial extends App {

  import scala.collection.mutable.ArrayBuffer

  println("Step 1: How to initialize an ArrayBuffer with 3 elements")
  val arrayBuffer1: ArrayBuffer[String] = ArrayBuffer("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")



  println("\nStep 2: How to access elements of an ArrayBuffer at specific index")
  println(s"Element at index 0 = ${arrayBuffer1(0)}")
  println(s"Element at index 1 = ${arrayBuffer1(1)}")
  println(s"Element at index 2 = ${arrayBuffer1(2)}")



  println("\nStep 3: How to add elements to an ArrayBuffer using +=")
  arrayBuffer1 += "Vanilla Donut"
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")
  // NOTE: arrayBuffer1 is mutable and hence we were able to add a new element to it



  println("\nStep 4: How to add elements from a List to an ArrayBuffer using ++=")
  arrayBuffer1 ++= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")



  println("\nStep 5: How to remove elements from an ArrayBuffer")
  arrayBuffer1 -= "Plain Donut"
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")



  println("\nStep 6: How to remove elements of a List from ArrayBuffer using --=")
  arrayBuffer1 --= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")



  println("\nStep 7: How to initialize an empty ArrayBuffer")
  val emptyArrayBuffer: ArrayBuffer[String] = ArrayBuffer.empty[String]
  println(s"Empty array buffer = $emptyArrayBuffer")
}
