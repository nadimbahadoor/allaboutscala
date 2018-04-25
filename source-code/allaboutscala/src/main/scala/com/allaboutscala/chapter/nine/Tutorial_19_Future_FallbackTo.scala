package com.allaboutscala.chapter.nine

import scala.util.{Failure, Success}


/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Future fallbackTo
  *
  * [[http://allaboutscala.com/tutorials/chapter-9-beginner-tutorial-using-scala-futures/#future-fallbackTo Tutorial]]
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
object Tutorial_19_Future_FallbackTo extends App {

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future
  def donutStock(donut: String): Future[Int] = Future {
    if(donut == "vanilla donut") 10
    else throw new IllegalStateException("Out of stock")
  }



  println("\nStep 2: Define another method which returns a Future to match a similar donut stock")
  def similarDonutStock(donut: String): Future[Int] = Future {
    println(s"replacing donut stock from a similar donut = $donut")
    if(donut == "vanilla donut") 20 else 5
  }



  println("\nStep 3: Call Future.fallbackTo")
  val donutStockOperation = donutStock("plain donut")
    .fallbackTo(similarDonutStock("vanilla donut"))
    .onComplete {
      case Success(donutStock)  => println(s"Results $donutStock")
      case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
    }

  Thread.sleep(3000)
}
