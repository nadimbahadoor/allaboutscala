package com.allaboutscala.chapter.nine

import java.util.concurrent.Executors

import scala.util.{Success, Failure}


/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Future configure threadpool
  *
  * [[http://allaboutscala.com/tutorials/chapter-9-beginner-tutorial-using-scala-futures/#future-configure-threadpool Tutorial]]
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
object Tutorial_16_Future_Configure_ThreadPool extends App {

  // Tutorial name: how to configure your own thread pool for futures execution

  println("Step 1: Define an ExecutionContext")
  val executor = Executors.newSingleThreadExecutor()
  implicit val ec = scala.concurrent.ExecutionContext.fromExecutor(executor)



  println("\nStep 2: Define a method which returns a Future")
  import scala.concurrent.Future
  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }



  println("\nStep 3: Call method which returns a Future")
  val donutStockOperation = donutStock("vanilla donut")
  donutStockOperation.onComplete {
    case Success(donutStock)  => println(s"Results $donutStock")
    case Failure(e)           => println(s"Error processing future operations, error = ${e.getMessage}")
  }

  Thread.sleep(3000)
  executor.shutdownNow()
}
