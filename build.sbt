import Dependencies._

val circeVersion = "0.8.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.jjmerelo",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hitos",
    libraryDependencies +=  scalaTest % Test

  )
