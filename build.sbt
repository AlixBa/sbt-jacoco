sbtPlugin := true

name := "jacoco4sbt"

organization := "de.johoop"

version := "2.0.0"

resolvers += "Sonatype Release" at "https://oss.sonatype.org/content/repositories/releases"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.jacoco" % "org.jacoco.core" % "0.6.3.201306030806" artifacts(Artifact("org.jacoco.core", "jar", "jar")),
  "org.jacoco" % "org.jacoco.report" % "0.6.3.201306030806" artifacts(Artifact("org.jacoco.report", "jar", "jar")))
   
scalacOptions ++= Seq("-unchecked", "-deprecation")

