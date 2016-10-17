name := "allaboutscala"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq (
  "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0",
  "ch.qos.logback" %  "logback-classic" % "1.1.7",
  "joda-time"     % "joda-time"     % "2.9.3",
  "org.joda"      % "joda-convert"  % "1.8"
  )