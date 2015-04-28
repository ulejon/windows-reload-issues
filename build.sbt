name := "windows-reload-issues"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val root = project.in(file("."))
        .aggregate(backend, othermodule)
        .settings(scalaVersion := "2.11.6")

lazy val backend = Project( "backend", file("modules/backend") ).
        dependsOn(othermodule).
        enablePlugins(PlayScala).
        settings(
            scalaVersion := "2.11.6",
            libraryDependencies += "org.scaldi" %% "scaldi-play" % "0.5-play-2.4.0-M3-7"
        )

lazy val othermodule = Project( "othermodule", file("modules/othermodule") ).
        settings(scalaVersion := "2.11.6")