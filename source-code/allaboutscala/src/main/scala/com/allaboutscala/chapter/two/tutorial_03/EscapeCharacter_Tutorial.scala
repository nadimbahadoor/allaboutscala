package com.allaboutscala.chapter.two.tutorial_03

/**
  * Created by nbahadoor on 09/06/2016.
  *
  * Tutorial: Scala – How To Escape Characters And Create Multi-line String
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-escape-characters-create-multi-line-string/ Tutorial]]
  */
object EscapeCharacter_Tutorial extends App {



  println("Step 1: How to escape a Json String")
//  val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"



  println("\nStep 2: Using backslash to escpae quotes")
  val donutJson2: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")



  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")


  println("\nStep 4:  Creating multi-line text using stripMargin")
  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """.stripMargin
  println(s"donutJson4 = $donutJson4")



  println("\nTip:  stripMargin using a different character")
  val donutJson5: String =
    """
      #{
      #"donut_name":"Glazed Donut",
      #"taste_level":"Very Tasty",
      #"price":2.50
      #}
    """.stripMargin('#')
  println(s"donutJson5 = $donutJson4")

}
