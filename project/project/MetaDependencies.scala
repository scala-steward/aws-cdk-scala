import sbt._

object MetaDependencies {
  object Aws {
    val cdk: ModuleID = "software.amazon.awscdk" % "aws-cdk-lib" % "2.16.0"

    val constructs: ModuleID = "software.constructs" % "constructs" % "10.0.94"
  }

  object Google {
    val guava: ModuleID = "com.google.guava" % "guava" % "31.1-jre"
  }
}
