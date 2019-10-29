import Dependencies.allDeps

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.github.DCameronMauch"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaAlgorithmsDataStructures",
    libraryDependencies ++= allDeps
  )