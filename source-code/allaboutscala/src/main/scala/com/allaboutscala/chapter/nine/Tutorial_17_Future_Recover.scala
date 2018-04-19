package com.allaboutscala.chapter.nine

import scala.util.{Failure, Success}

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Future recover
  *
  * [[http://allaboutscala.com/tutorials/chapter-9-beginner-tutorial-using-scala-futures/#future-recover Tutorial]]
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
object Tutorial_17_Future_Recover extends App {

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent.Future
  def donutStock(donut: String): Future[Int] = Future {
    if(donut == "vanilla donut") 10
    else throw new IllegalStateException("Out of stock")
  }



  println("\nStep 2: Execute donutStock() future operation")
  donutStock("vanilla donut")
    .onComplete {
      case Success(donutStock)  => println(s"Results $donutStock")
      case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
    }



  println("\nStep 3: Call Future.recover to recover from a known exception")
  donutStock("unknown donut")
    .recover { case e: IllegalStateException if e.getMessage == "Out of stock" => 0 }
    .onComplete {
      case Success(donutStock)  => println(s"Results $donutStock")
      case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
    }

  Thread.sleep(3000)
}
