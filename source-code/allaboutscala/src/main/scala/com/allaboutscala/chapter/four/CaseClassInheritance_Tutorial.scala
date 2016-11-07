package com.allaboutscala.chapter.four

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Extend Case Class - Case Class Inheritance
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-extend-case-class/ Tutorial]]
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
object CaseClassInheritance_Tutorial extends App {

  println("Step 1: How to define an abstract class to represent a Donut object")
  abstract class Donut(name: String) {

    def printName: Unit

  }



  println("\nStep 2: How to extend the abstract class Donut and define a case class named VanillaDonut")
  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }



  println("\nStep 3: How to extend the abstract class Donut and define a case class named VanillaDonut")
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }



  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName
}
