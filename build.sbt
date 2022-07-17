enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.8"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

scalacOptions += "-Ytasty-reader"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.2.0" cross CrossVersion.for2_13Use3
