import Dependencies._

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-encoding", "UTF-8",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:higherKinds"
)

crossScalaVersions := Seq("2.12.19", "2.13.14")
scalaVersion := "2.13.14"
organization := "com.codacy"

version      := "0.9.3"


lazy val `simple-akka-downing` = (project in file("."))
  .enablePlugins(MultiJvmPlugin)
  .configs(MultiJvm)
  .settings(
    parallelExecution in Test := false,
    name := "simple-akka-downing",

    libraryDependencies += akkaCluster,

    libraryDependencies += akkaHttp % Test,
    libraryDependencies += scalaTest % Test,
    libraryDependencies += testKit % Test,
    libraryDependencies += multiNodeTestKit % Test,
  )
