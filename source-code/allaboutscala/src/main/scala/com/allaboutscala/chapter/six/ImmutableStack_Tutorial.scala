package com.allaboutscala.chapter.six

/**
  * Created by Nadim Bahadoor on 28/06/2016.
  *
  *  Tutorial: Learn How To Use Scala's Immutable Stack
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-stack/ Tutorial]]
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
object ImmutableStack_Tutorial extends App {

  import scala.collection.immutable.Stack
  println("Step 1: How to initialize Stack with 3 elements")
  val stack1: Stack[String] = Stack("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of stack1 = $stack1")



  println("\nStep 2: How to initialize a Stack using an Immutable List")
  val stack2: List[String] = List("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Using an Immutable List for stack, elements are = $stack2")



  println("\nStep 3: Push one element at the top of the stack using :: of Immutable List")
  val stack3: List[String] = "Vanilla Donut" :: stack2
  println(s"Using an Immutable List for stack, elements after push = $stack3")



  println("\nStep 4: Push N elements at the top of the stack using :: of Immutable List")
  val stack4: List[String] = "Glazed Donut" :: "Vanilla Donut" :: stack2
  println(s"Using an Immutable List for stack, elements after pushing N elements  = $stack4")



  println("\nStep 5: Pop element from the Stack using tail function of Immutable List")
  val stack5: List[String] = stack2.tail
  println(s"Using an Immutable List for stack, elements after tail function to simulate Stack pop = $stack5")



  println("\nStep 6: How to initialize an empty Stack using Immutable List")
  val emptyStack: List[String] = List.empty[String]
  println(s"Using an Immutable List for stack, the empty stack = $emptyStack")
}
