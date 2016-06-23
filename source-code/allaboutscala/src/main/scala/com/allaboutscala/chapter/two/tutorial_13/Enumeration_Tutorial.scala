package com.allaboutscala.chapter.two.tutorial_13

/**
  * Created by Nadim Bahadoor on 23/06/2016.
  *
  *  Tutorial: Learn How To Create And Use Enumerations
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/learn-to-create-use-enumerations/ Tutorial]]
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
  *
  */
object Enumeration_Tutorial extends App {


  println("Step 1: How to create an enumeration")
  object Donut extends Enumeration {
    type Donut = Value

    val Glazed      = Value("Glazed")
    val Strawberry  = Value("Strawberry")
    val Plain       = Value("Plain")
    val Vanilla     = Value("Vanilla")
  }



  println("\nStep 2: How to print the String value of the enumeration")
  println(s"Vanilla Donut string value = ${Donut.Vanilla}")



  println("\nStep 3: How to print the id of the enumeration")
  println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")



  println("\nStep 4: How to print all the values listed in Enumeration")
  println(s"Donut types = ${Donut.values}")



  println("\nStep 5: How to pattern match on enumeration values")
  Donut.values.foreach {
    case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
    case _ => None
  }



  println("\nStep 6: How to change the default ordering of enumeration values")
  object DonutTaste extends Enumeration{
    type DonutTaste = Value

    val Tasty       = Value(0, "Tasty")
    val VeryTasty   = Value(1, "Very Tasty")
    val Ok          = Value(-1, "Ok")
  }

  println(s"Donut taste values = ${DonutTaste.values}")
  println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")


}
