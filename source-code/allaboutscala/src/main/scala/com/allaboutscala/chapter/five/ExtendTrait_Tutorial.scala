package com.allaboutscala.chapter.five

/**
  * /**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Extend Trait In Scala
  *
  * [[http://allaboutscala.com/tutorials/chapter-5-traits/scala-extend-trait/]]
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
  */
object ExtendTrait_Tutorial extends App {


  println("Step 1: Create a trait which will define the methods for a data access layer")
  trait DonutShoppingCartDao {

    def add(donutName: String): Long

    def update(donutName: String): Boolean

    def search(donutName: String): String

    def delete(donutName: String): Boolean

  }


  println("\nStep 2: Create a DonutShoppingCart class which extends the trait from Step 1 and implements its methods")
  class DonutShoppingCart extends DonutShoppingCartDao {

    override def add(donutName: String): Long = {
      println(s"DonutShoppingCart-> add method -> donutName: $donutName")
      1
    }

    override def update(donutName: String): Boolean = {
      println(s"DonutShoppingCart-> update method -> donutName: $donutName")
      true
    }

    override def search(donutName: String): String = {
      println(s"DonutShoppingCart-> search method -> donutName: $donutName")
      donutName
    }

    override def delete(donutName: String): Boolean = {
      println(s"DonutShoppingCart-> delete method -> donutName: $donutName")
      true
    }
  }


  println("\nStep 3: Create an instance of DonutShoppingCart and call the add, update, search and delete methods")
  val donutShoppingCart1: DonutShoppingCart = new DonutShoppingCart()
  donutShoppingCart1.add("Vanilla Donut")
  donutShoppingCart1.update("Vanilla Donut")
  donutShoppingCart1.search("Vanilla Donut")
  donutShoppingCart1.delete("Vanilla Donut")



  println("\nStep 4: Create an instance of DonutShoppingCart and assign its type to the trait DonutShoppingCartDao")
  val donutShoppingCart2: DonutShoppingCartDao = new DonutShoppingCart()
  donutShoppingCart2.add("Vanilla Donut")
  donutShoppingCart2.update("Vanilla Donut")
  donutShoppingCart2.search("Vanilla Donut")
  donutShoppingCart2.delete("Vanilla Donut")
}
