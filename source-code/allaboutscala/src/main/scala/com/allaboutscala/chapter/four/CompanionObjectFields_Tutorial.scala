package com.allaboutscala.chapter.four

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Declare Values And Fields In Companion Object
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-tutorial-learn-declare-value-fields-companion-object/ Tutorial]]
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
object CompanionObjectFields_Tutorial extends App {


  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Option[Long] = None){

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")

  }



  println("\nStep 2: How to declare fields and values in companion object")
  object Donut {

    private val uuid = 1 // we've declared a uuid value and it is also marked as private.

    def apply(name: String, productCode: Option[Long]): Donut = {
      new Donut(name, productCode)
    }

    def apply(name: String): Donut = {
      new Donut(name)
    }
  }



  println("\nStep 3: How to create instances of the Donut class using the companion object")
  val glazedDonut = Donut("Glazed Donut", Some(1111))
  val vanillaDonut = Donut("Vanilla Donut")



  println("\nStep 4: How to call function on each Donut object")
  glazedDonut.print
  vanillaDonut.print
}
