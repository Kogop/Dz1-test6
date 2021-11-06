import Dependencies.scalaTest
name := "Dz1-test6"

version := "0.1"

scalaVersion := "2.13.7"
lazy val data = project

lazy val core = project
  .dependsOn(data)
  .settings (
      libraryDependencies +=scalaTest
 )


lazy val app = project.dependsOn(data,core)

lazy val root = (project in file("."))
  .aggregate(data, core, app)
