name := """views"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

resolvers ++= Seq(
  "webjars"    at "http://webjars.github.com/m2"
)

libraryDependencies ++= Seq(
  "org.webjars"               %% "webjars-play"       % "2.3.0",
  "org.webjars"               % "bootstrap"           % "3.0.0" exclude("org.webjars", "jquery"),
  "org.webjars"               % "jquery"              % "1.8.3",
  "postgresql" 				  % "postgresql" 		  % "9.1-901.jdbc4"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
