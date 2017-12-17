organization := "ru.albemuth.tentura"

name := "tentura-samples"

version := "0.0.1"

scalaVersion := "2.12.0"

autoCompilerPlugins := true

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  Seq(
    "ru.albemuth.tentura"         %% "tentura"                     % "0.0.1",
    "org.slf4j"                   % "slf4j-log4j12"                % "1.7.7",
    //"com.typesafe.scala-logging"  %   "scala-logging_2.12.0-M4"  % "3.1.0",
    "org.scalatest"               %% "scalatest"                   % "3.0.1"   % "test",
    "com.storm-enroute"           %% "scalameter-core"             % "0.8.2",
    "com.storm-enroute"           %% "scalameter"                  % "0.8.2"
  )
}

fork in Test := true

fork in test := true