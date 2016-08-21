package com.allaboutscala.chapter.three

import scala.util.control.TailCalls._

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Trampoline Tail Recursive Function Using scala.util.control.TailCalls
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-trampoline-tail-recursive-function/ Tutorial]]
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
object FunctionTrampoline_Tutorial extends App {

  println("Step 1: How to define a trampoline function using scala.util.control.TailCalls")
  def verySweetDonut(donutList: List[String]): TailRec[Boolean] = {
    println(s"verySweetDonut function: donut list = $donutList")
    if (donutList.isEmpty) {
      println("verySweetDonut function: donut list isEmpty, returning false")
      done(false)
    } else {
      if(Set(donutList.head).subsetOf(Set("Vanilla Donut","Strawberry Donut","Glazed Donut"))) {
        println(s"verySweetDonut function: found donut list's head = ${donutList.head} to be VERY sweet, returning true")
        done(true)
      } else {
        println(s"verySweetDonut function: donut list's head = ${donutList.head} is NOT VERY sweet, forwarding donut list's to notSweetDonut function")
        tailcall(notSweetDonut(donutList))
      }
    }
  }



  println("\nStep 2: How to define a trampoline function using scala.util.control.TailCalls")
  def notSweetDonut(donutList: List[String]): TailRec[Boolean] = {
    println(s"notSweetDonut function: with donut list = $donutList")
    if (donutList.isEmpty) {
      println("notSweetDonut function: donut list isEmpty, returning false")
      done(false)
    } else {
      println(s"notSweetDonut function: donut list's head = ${donutList.head} is NOT sweet, forwarding donut list's tail to verySweetDonut function")
      tailcall(verySweetDonut(donutList.tail))
    }
  }



  println("\nStep 3: How to call a trampoline tail recursive function")
  val donutList: List[String] = List("Plain Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
  val foundVerySweetDonut = tailcall(verySweetDonut(donutList)).result
  println(s"Found very sweet donut = $foundVerySweetDonut")
}
