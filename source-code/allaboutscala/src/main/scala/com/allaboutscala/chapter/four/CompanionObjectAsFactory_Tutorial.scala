package com.allaboutscala.chapter.four

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Companion Objects' Apply Method As A Factory (Class Hierarchy Via Inheritance)
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-classes-scala/scala-tutorial-learn-companion-objects-factory-apply-method-inheritance/ Tutorial]]
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
object CompanionObjectAsFactory_Tutorial extends App {

  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Option[Long] = None){

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}")

  }



  println("\nStep 2: How to declare class hierarchy through inheritance using extends keyword")
  class GlazedDonut(name: String) extends Donut(name)

  class VanillaDonut(name: String) extends Donut(name)



  println("\nStep 3: How to declare apply method of companion object as a factory")
  object Donut {

    def apply(name: String): Donut = {
      name match {
        case "Glazed Donut" => new GlazedDonut(name)
        case "Vanilla Donut" => new VanillaDonut(name)
        case _ => new Donut(name)
      }
    }

  }



  println("\nStep 4: How to call apply method of companion object which is a factory")
  val glazedDonut = Donut("Glazed Donut")
  println(s"The class type of glazedDonut = ${glazedDonut.getClass}")
  glazedDonut.print

  val vanillaDonut = Donut("Vanilla Donut")
  println(s"The class type of vanillaDonut = ${vanillaDonut.getClass}")
  vanillaDonut.print
}
