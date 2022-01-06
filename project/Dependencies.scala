import sbt._

object Dependencies {
  lazy val shapeless: Seq[ModuleID] = Seq("com.chuusai" %% "shapeless" % "2.3.7")
  lazy val specs2: Seq[ModuleID] = Seq("org.specs2" %% "specs2-core" % "4.13.1" % Test)
}
