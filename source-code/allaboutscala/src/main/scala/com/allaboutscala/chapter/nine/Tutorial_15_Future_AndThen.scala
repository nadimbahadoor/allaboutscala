package com.allaboutscala.chapter.nine

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Future andThen
  *
  * [[http://allaboutscala.com/tutorials/chapter-9-beginner-tutorial-using-scala-futures/#future-andThen Tutorial]]
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
object Tutorial_15_Future_AndThen extends App {

  println("Step 1: Define a method which returns a Future")
  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  def donutStock(donut: String): Future[Int] = Future {
    // assume some long running database operation
    println("checking donut stock")
    10
  }



  println(s"\nStep 2: Call Future.andThen with a PartialFunction")
  val donutStockOperation = donutStock("vanilla donut")
  donutStockOperation.andThen { case stockQty => println(s"Donut stock qty = $stockQty")}

  Thread.sleep(3000)
}
