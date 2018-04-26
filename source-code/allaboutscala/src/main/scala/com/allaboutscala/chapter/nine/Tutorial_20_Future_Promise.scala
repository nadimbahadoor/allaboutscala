package com.allaboutscala.chapter.nine

import scala.concurrent.Promise
import scala.util.{Success, Try, Failure}


/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Future promise
  *
  * [[http://allaboutscala.com/tutorials/chapter-9-beginner-tutorial-using-scala-futures/#future-promise Tutorial]]
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
object Tutorial_20_Future_Promise extends App {

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.ExecutionContext.Implicits.global
  def donutStock(donut: String): Int = {
    if(donut == "vanilla donut") 10
    else throw new IllegalStateException("Out of stock")
  }


  println(s"\nStep 2: Define a Promise of type Int")
  val donutStockPromise = Promise[Int]()



  println("\nStep 3: Define a future from Promise")
  val donutStockFuture = donutStockPromise.future
  donutStockFuture.onComplete {
    case Success(stock) => println(s"Stock for vanilla donut = $stock")
    case Failure(e)     => println(s"Failed to find vanilla donut stock, exception = $e")
  }



  println("\nStep 4: Use Promise.success or Promise.failure to control execution of your future")
  val donut = "vanilla donut"
  if(donut == "vanilla donut") {
    donutStockPromise.success(donutStock(donut))
  } else {
    donutStockPromise.failure(Try(donutStock(donut)).failed.get)
  }



  println("\nStep 5: Completing Promise using Promise.complete() method")
  val donutStockPromise2 = Promise[Int]()
  val donutStockFuture2 = donutStockPromise2.future
  donutStockFuture2.onComplete {
    case Success(stock) => println(s"Stock for vanilla donut = $stock")
    case Failure(e)     => println(s"Failed to find vanilla donut stock, exception = $e")
  }
  donutStockPromise2.complete(Try(donutStock("unknown donut")))

  Thread.sleep(3000)
}
