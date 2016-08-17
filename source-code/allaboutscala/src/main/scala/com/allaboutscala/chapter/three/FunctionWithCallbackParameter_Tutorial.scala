package com.allaboutscala.chapter.three

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Create Function With Callback Parameter
  *
  * [[http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-function-callback-parameter/ Tutorial]]
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
object FunctionWithCallbackParameter_Tutorial extends App {

  println("Step 1: How to define a function with a callback parameter")
  def printReport(sendEmailCallback: () => Unit) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback()
  }



  println("\nStep 2: How to call a function which has a callback parameter")
  printReport(() =>
    println("Sending email ... finished")
  )



  println("\nStep 3: How to call a function without providing its callback parameter")
  // printReport() // You get compile time error
  printReport(() => {}) // Not that elegant.



  println("\nStep 4: How to define a function with an Option callback")
  def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback.map(callback => callback())
  }



  println("\nStep 5: How to call a function without providing its callback parameter")
  printReportWithOptionCallback() // more elegant



  println("\nStep 6: How to call a function with Option callback parameter")
  printReportWithOptionCallback(Some(() =>
    println("Sending email wrapped in Some() ... finished")
  ))
}
