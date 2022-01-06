import Dependencies._

idePackagePrefix := Some("com.github.mideo")

Global / excludeLintKeys += idePackagePrefix


lazy val `scala-exercises` = (project in file("."))
  .settings(
    name := "scala-exercises",
    version := "0.1",
    scalaVersion := "2.13.7",
    fork / run := true,
    parallelExecution := true,
    scalacOptions := Seq(
      "-unchecked",
      "-deprecation",
      "-encoding",
      "utf8",
      "-feature",
      "-language:implicitConversions",
      "-language:postfixOps",
      "-language:reflectiveCalls",
      "-Yrangepos"
    ),
    libraryDependencies ++= shapeless ++ specs2
  )





