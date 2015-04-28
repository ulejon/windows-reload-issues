name := "windows-reload-issues"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).
        enablePlugins(PlayScala).
        settings(
            scalaVersion := "2.11.6",
            libraryDependencies += "org.scaldi" %% "scaldi-play" % "0.5.4"
        )