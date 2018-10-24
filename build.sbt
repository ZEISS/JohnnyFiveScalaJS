lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "JohnnyFiveScala.js"

normalizedName := "johnny5scala-js"

version := "0.0.2-SNAPSHOT"

organization := "com.zeiss"

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.6")


scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault")

libraryDependencies ++= Seq(
  "org.scalactic" %%% "scalactic" % "3.0.5" % "test",
  "org.scalatest" %%% "scalatest" % "3.0.5" % "test",
)

publishMavenStyle := true

licenses += ("Apache 2", url("https://www.apache.org/licenses/LICENSE-2.0.txt"))

enablePlugins(DockerPlugin)