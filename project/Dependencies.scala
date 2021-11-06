import sbt._

object Dependencies {
  lazy val scalaTestVersion = "3.2.10'"

  val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion % Test
}
