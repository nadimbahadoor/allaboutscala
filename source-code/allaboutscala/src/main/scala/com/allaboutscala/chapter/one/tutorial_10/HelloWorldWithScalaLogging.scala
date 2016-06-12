package com.allaboutscala.chapter.one.tutorial_10

import com.typesafe.scalalogging.LazyLogging

/**
  * Created by nbahadoor on 06/05/2016.
  *
  * Tutorial: IntelliJ Import Dependencies – Getting Started With build.sbt
  *
  * [[http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/getting-started-sbt-import-dependencies-build-sbt/ Tutorial]]
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
object HelloWorldWithScalaLogging extends App with LazyLogging {

  logger.info("Hello World from Scala Logging")

}
