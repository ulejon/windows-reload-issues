name := "windows-reload-issues"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val root = project.in(file("."))
        .aggregate(backend, othermodule)
        .settings(scalaVersion := "2.11.6")

lazy val backend = Project( "backend", file("modules/backend") ).
        dependsOn(othermodule).
        settings(scalaVersion := "2.11.6").
        enablePlugins(PlayScala)

lazy val othermodule = Project( "othermodule", file("modules/othermodule") ).
        settings(scalaVersion := "2.11.6")