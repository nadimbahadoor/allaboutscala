package com.allaboutscala.chapter.eight

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Par Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-par-example/ Tutorial]]
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
object Par_Tutorial extends App {

  println("Step 1: How to initialize an Immutable Sequence of various donut flavours")
  val donutFlavours: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donutFlavours immutable sequence = $donutFlavours")



  println("\nStep 2: Convert the Immutable donut flavours Sequence into Parallel Collection")
  import scala.collection.parallel.ParSeq
  val donutFlavoursParallel: ParSeq[String] = donutFlavours.par



  println("\nStep 3: How to use Scala Parallel Collection")
  val donuts: ParSeq[String] = donutFlavoursParallel.map(d => s"$d donut")
  println(s"Elements of donuts parallel collection = $donuts")
}
