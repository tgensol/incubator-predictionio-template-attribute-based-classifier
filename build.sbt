name := "template-scala-parallel-classification"

scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.12.0-incubating" % "provided",
   "edu.stanford.nlp" % "stanford-corenlp" % "3.8.0",
  "org.apache.spark"        %% "spark-mllib"              % "2.1.1" % "provided")
