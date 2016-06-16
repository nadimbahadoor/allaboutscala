package com.allaboutscala.chapter.one.tutorial_06

/**
  * Created by Nadim Bahadoor on 03/05/2016.
  *
  * Tutorial: IntelliJ Run Configuration – Running Your Scala application
  *
  * [[http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/intellij-run-configuration-scala-application/ Tutorial]]
  *
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
object HelloWorldWithArguments extends App {


  println("Hello World With Arguments Scala Application!")


  println("Command line arguments are: ")
  println(args.mkString(", "))


}
