package com.allaboutscala.chapter.seven

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Mutable BitSet
  *
  * [[http://allaboutscala.com/tutorials/chapter-7-beginner-tutorial-using-scala-mutable-collection/scala-tutorial-learn-use-mutable-bitset/ Tutorial]]
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
object MutableBitSet_Tutorial extends App {

  import scala.collection.mutable.BitSet
  println("\nStep 1: How to initialize a BitSet")
  val bitSet1: BitSet = BitSet(0, 2, 4, 6, 8)
  println(s"Elements of bitSet1 = $bitSet1")



  println("\nStep 2: How to check specific elements in BitSet")
  println(s"Element 0 = ${bitSet1(0)}")
  println(s"Element 1 = ${bitSet1(1)}")
  println(s"Element 2 = ${bitSet1(2)}")



  println("\nStep 3: How to add elements to BitSet using +=")
  bitSet1 += 10
  println(s"Elements of bitSet1 after adding element 10 = $bitSet1")



  println("\nStep 4: How to add two BitSets together using ++=")
  bitSet1 ++= BitSet(12, 14, 16, 18, 20)
  println(s"Elements of bitSet1 after adding second BitSet = $bitSet1")



  println("\nStep 5: How to remove element from BitSet using -=")
  bitSet1 -= 0
  println(s"bitSet1 without element 0 = $bitSet1")



  println("\nStep 6: How to find the intersection between two BitSets using &")
  val bitSetEven2: BitSet = BitSet(6, 8, 10)
  println(s"Intersection of bitSet1 and bitSetEven2 = ${bitSet1 & bitSetEven2}")



  println("\nStep 7: How to find the difference between two BitSets using &~")
  println(s"Difference of bitSet1 and bitSetEven2 = ${bitSet1 &~ bitSetEven2}")



  println("\nStep 8: How to initialize an empty BitSet")
  val emptyBitSet: BitSet = BitSet.empty
  println(s"Empty BitSet = $emptyBitSet")
}
