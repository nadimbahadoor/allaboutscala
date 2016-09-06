package com.allaboutscala.chapter.six


/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Immutable Stream
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-stream/ Tutorial]]
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
object ImmutableStream_Tutorial extends App {


  println("Step 1: How to create a Stream with 3 numbers using #::")
  val stream1: Stream[Int] = 1 #:: 2 #:: 3 #:: Stream.empty
  println(s"Elements of stream1 = $stream1")



  import scala.collection.immutable.Stream.cons
  println("\nStep 2: How to create a Stream with 3 numbers using Stream.cons")
  val stream2: Stream[Int]  = cons(1, cons(2, cons(3, Stream.empty) ) )
  println(s"Elements of stream2 = ${stream2}")



  println("\nStep 3: How to print all 3 numbers from stream2 using the take function")
  print("Take first 3 numbers from stream2 = ")
  stream2.take(3).print

  print("\nTake first 10 numbers from stream2 = ")
  stream2.take(10).print



  println("\n\nStep 4: How to define an infinite Stream of numbers using Stream.cons")
  def inifiniteNumberStream(number: Int): Stream[Int] = Stream.cons(number, inifiniteNumberStream(number + 1))
  print("Take only the first 20 numbers from the infinite number stream = ")
  inifiniteNumberStream(1).take(20).print



  println("\n\nStep 5: How to define an infinite stream of numbers using Stream.from")
  val stream3: Stream[Int]  = Stream.from(1)
  print("Take only the first 20 numbers from the infinite number stream = ")
  stream3.take(20).print



  println("\n\nStep 6: How to initialize an empty Stream")
  val emptyStream: Stream[Int] = Stream.empty[Int]
  println(s"Empty Stream = $emptyStream")
}
