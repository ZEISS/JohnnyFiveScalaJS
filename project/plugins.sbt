resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.3")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.24")
addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.10")// for autoplugins
  