import sbt._

object Dependencies {
  private val mainDeps = Seq.empty[ModuleID]

  private val testDeps = Seq(
    "org.scalatest" %% "scalatest" % "3.0.8"
  )

  val allDeps: Seq[ModuleID] = mainDeps ++ testDeps.map(_ % Test)
}
