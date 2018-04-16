package com.allaboutscala.chapter.nine

import scala.util.{Success, Failure}


/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Future zipWith
  *
  * [[http://allaboutscala.com/tutorials/chapter-9-beginner-tutorial-using-scala-futures/#future-zipWith Tutorial]]
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
object Tutorial_14_Future_ZipWith extends App {

  println("Step 1: Define a method which returns a Future Option")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future
  def donutStock(donut: String): Future[Option[Int]] = Future {
    println("checking donut stock")
    if(donut == "vanilla donut") Some(10) else None
  }



  println(s"\nStep 2: Define a method which returns a Future Double for donut price")
  def donutPrice(): Future[Double] = Future.successful(3.25)



  println(s"\nStep 3: Define a value function to convert Tuple (Option[Int], Double) to Tuple (Int, Double)")
  val qtyAndPriceF: (Option[Int], Double) => (Int, Double) = (someQty, price) => (someQty.getOrElse(0), price)



  println(s"\nStep 4: Call Future.zipWith and pass-through function qtyAndPriceF")
  val donutAndPriceOperation = donutStock("vanilla donut").zipWith(donutPrice())(qtyAndPriceF)
  donutAndPriceOperation.onComplete {
    case Success(result) => println(s"Result $result")
    case Failure(e)      => println(s"Error processing future operations, error = ${e.getMessage}")
  }

  Thread.sleep(3000)

}
