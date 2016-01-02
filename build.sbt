name := "prequel"

version := "0.3.8-mlxpatch2"

organization := "net.noerd"

scalaVersion := "2.11.7"

// Runtime Dependencies
libraryDependencies ++= Seq(
    "commons-pool" % "commons-pool" % "1.5.5",
    "commons-dbcp" % "commons-dbcp" % "1.4",
    "commons-lang" % "commons-lang" % "2.6",
    "joda-time" % "joda-time" % "2.1",
    "org.joda" % "joda-convert" % "1.2"
)

// Test Dependencies
libraryDependencies ++= Seq(
    "org.hsqldb" % "hsqldb" % "2.2.4" % "test",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
