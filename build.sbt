import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"

scapegoatVersion in ThisBuild := "1.3.8"

lazy val root = (project in file("."))
  .settings(
    name := "ComparingUnrelatedTypesExample",
    libraryDependencies += scalaTest % Test
  )

