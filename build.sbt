ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file(".")).enablePlugins(NativeImagePlugin).settings(
  name                := "graalvm-scala-catseffect",
  libraryDependencies += "org.typelevel" %% "cats-effect" % "3.5.2",
  Compile / mainClass := Some("com.example.Main"),
  nativeImageOptions  += "--no-fallback",
  nativeImageVersion  := "22.3.0" // It should be at least version 21.0.0
)
