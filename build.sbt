ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaForImpatient"
  )
