package com.allaboutscala.chapter.six


/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Immutable Sequence
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-sequence/ Tutorial]]
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
object ImmutableSequence_Tutorial extends App {

  println("Step 1: How to initialize a Sequence with 3 elements")
  val seq1: Seq[String] = Seq("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of seq1 = $seq1")



  println("\nStep 2: How to access elements in Sequence at specific index")
  println(s"Element at index 0 = ${seq1(0)}")
  println(s"Element at index 1 = ${seq1(1)}")
  println(s"Element at index 2 = ${seq1(2)}")



  println("\nStep 3: How to add elements to Sequence using :+")
  val seq2: Seq[String] = seq1 :+ "Vanilla Donut"
  println(s"Adding elements to Sequence using :+ = $seq2")



  println("\nStep 4: How to add two Sequence together using ++")
  val seq3: Seq[String] = seq1 ++ Seq[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two sequences together using ++ = $seq3")



  println("\nStep 5: How to initialize an empty Sequence")
  val emptySeq: Seq[String] = Seq.empty[String]
  println(s"Empty Sequence = $emptySeq")
}
