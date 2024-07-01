import sbt._

object Dependencies {
  final val akkaVersion = "2.6.21"
  final val akkaHttpVersion = "10.2.10"

  lazy val akkaCluster = "com.typesafe.akka" %% "akka-cluster" % akkaVersion

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.19"
  lazy val testKit = "com.typesafe.akka" %% "akka-testkit" % akkaVersion
  lazy val multiNodeTestKit = "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion

  lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
}
