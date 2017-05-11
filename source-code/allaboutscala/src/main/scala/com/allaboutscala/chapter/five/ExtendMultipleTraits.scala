package com.allaboutscala.chapter.five

/**
  * /**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Extend Multiple Traits
  *
  * [[http://allaboutscala.com/tutorials/chapter-5-traits/scala-extend-multiple-traits/]]
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
object ExtendMultipleTraits extends App {

    println("Step 1: Create a trait with type which will define the methods for a data access layer")
    trait DonutShoppingCartDao[A] {

      def add(donut: A): Long

      def update(donut: A): Boolean

      def search(donut: A): A

      def delete(donut: A): Boolean
    }



    println("\nStep 2: Create a second trait which will define the methods for checking donut inventory")
    trait DonutInventoryService[A] {

      def checkStockQuantity(donut: A): Int

    }


    println("\nStep 3: Create a DonutShoppingCart class which extends multiple traits namely trait DonutShoppingCartDao and trait DonutInventoryService")
    class DonutShoppingCart[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A] {

      override def add(donut: A): Long = {
        println(s"DonutShoppingCart-> add method -> donut: $donut")
        1
      }

      override def update(donut: A): Boolean = {
        println(s"DonutShoppingCart-> update method -> donut: $donut")
        true
      }

      override def search(donut: A): A = {
        println(s"DonutShoppingCart-> search method -> donut: $donut")
        donut
      }

      override def delete(donut: A): Boolean = {
        println(s"DonutShoppingCart-> delete method -> donut: $donut")
        true
      }

      override def checkStockQuantity(donut: A): Int = {
        println(s"DonutShoppingCart-> checkStockQuantity method -> donut: $donut")
        10
      }
    }


    println("\nStep 4: Create an instance of DonutShoppingCart and call the add, update, search and delete methods")
    val donutShoppingCart: DonutShoppingCart[String] = new DonutShoppingCart[String]()
    donutShoppingCart.add("Vanilla Donut")
    donutShoppingCart.update("Vanilla Donut")
    donutShoppingCart.search("Vanilla Donut")
    donutShoppingCart.delete("Vanilla Donut")


    println("\nStep 5: Call the checkStockQuantity method which was inherited from trait DonutInventoryService")
    donutShoppingCart.checkStockQuantity("Vanilla Donut")
}
